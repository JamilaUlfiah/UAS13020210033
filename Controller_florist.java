package briliana.florist.Controller;

import briliana.florist.DAO.DAO_florist;
import briliana.florist.DAOImplement.DAOImplement_florist;
import briliana.florist.Model.Model_florist;
import briliana.florist.Model.Tabel_Model_florist;
import briliana.florist.View.View_florist;
import javax.swing.JOptionPane;
import java.util.List;

    public class Controller_florist {

   View_florist view;
   DAOImplement_florist implement_florist;
   List<Model_florist> floristList;

    public Controller_florist(View_florist view) {
        this.view = view;
        implement_florist = new DAO_florist();
        floristList = implement_florist.getAll();
    }

    public void reset() {
        view.getTxtId().setText("");
        view.getTxtNamaBunga().setText("");
        view.getTxtJumlahbeli().setText("");
        view.getTxtHarga().setText("");
        view.getTxtCari().setText("");
    }

    public void isiTable() {
        floristList = implement_florist.getAll();
        setTableModel();
    }

    public void isiField(int row) {
        if (row >= 0 && row < floristList.size()) {
            Model_florist florist = floristList.get(row);
            view.getTxtId().setText(String.valueOf(florist.getId()));
            view.getTxtNamaBunga().setText(florist.getNama_bunga());
            view.getTxtJumlahbeli().setText(String.valueOf(florist.getJumlah_beli()));
            view.getTxtHarga().setText(florist.getHarga());
        }
    }

   public void insert() {
    if (//!view.getTxtId().getText().trim().isEmpty() &&
        !view.getTxtNamaBunga().getText().trim().isEmpty() &&
        !view.getTxtJumlahbeli().getText().trim().isEmpty() &&
        !view.getTxtHarga().getText().trim().isEmpty()) {

        Model_florist florist = new Model_florist();
        //florist.setId(Integer.parseInt(view.getTxtId().getText()));
        florist.setNama_bunga(view.getTxtNamaBunga().getText());
        florist.setJumlah_beli(Integer.parseInt(view.getTxtJumlahbeli().getText()));
        florist.setHarga(view.getTxtHarga().getText());

        implement_florist.insert(florist);
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        reset();
    } else {
        JOptionPane.showMessageDialog(view, "Harap isi semua field data");
    }
}

    public void update() {
        String idText = view.getTxtId().getText().trim();
        String namaBunga = view.getTxtNamaBunga().getText().trim();
        String jumlahBeliText = view.getTxtJumlahbeli().getText().trim();
        String harga = view.getTxtHarga().getText().trim();

        if (!idText.isEmpty() && !namaBunga.isEmpty() && !jumlahBeliText.isEmpty() && !harga.isEmpty()) {
            try {
                int id = Integer.parseInt(idText);
                int jumlahBeli = Integer.parseInt(jumlahBeliText);

                Model_florist florist = new Model_florist();
                florist.setId(id);
                florist.setNama_bunga(namaBunga);
                florist.setJumlah_beli(jumlahBeli);
                florist.setHarga(harga);

                implement_florist.update(florist);
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
                isiTable();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(view, "ID dan Jumlah Beli harus angka");
            }
        } else {
            JOptionPane.showMessageDialog(view, "Data tidak boleh kosong");
        }
    }

    public void delete() {
        int row = view.getTabelPelanggan().getSelectedRow();
        if (row != -1) {
            int id = Integer.parseInt(view.getTxtId().getText());
            implement_florist.delete(id);

            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");

            floristList = implement_florist.getAll();
            setTableModel();
        } else {
            JOptionPane.showMessageDialog(view, "Silahkan pilih data yang akan dihapus");
        }
    }

    public void setTableModel() {
        Tabel_Model_florist tmb = new Tabel_Model_florist(floristList);
        view.getTabelPelanggan().setModel(tmb);
    }

    public void isiTableCariData() {
        String keyword = view.getTxtCari().getText().trim();
        floristList = implement_florist.getByKeyword(keyword);
        setTableModel();
    }

    public void cariData() {
        String keyword = view.getTxtCari().getText().trim();
        if (!keyword.isEmpty()) {
            floristList = implement_florist.getByKeyword(keyword);
            setTableModel();
        } else {
            JOptionPane.showMessageDialog(view, "Silahkan masukkan kata kunci pencarian");
        }
    }
    }
