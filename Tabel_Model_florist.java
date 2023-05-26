package briliana.florist.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Tabel_Model_florist extends AbstractTableModel {
    
    private List<Model_florist> floristList;
    
    public Tabel_Model_florist(List<Model_florist> floristList) {
        this.floristList = floristList;
    }

    @Override
    public int getRowCount() {
        return floristList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama Bunga";
            case 2:
                return "Jumlah Beli";
            case 3:
                return "Harga";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        Model_florist florist = floristList.get(row);
        switch (column) {
            case 0:
                return florist.getId();
            case 1:
                return florist.getNama_bunga();
            case 2:
                return florist.getJumlah_beli();
            case 3:
                return florist.getHarga();
            default:
                return null;
        }
    }
}
