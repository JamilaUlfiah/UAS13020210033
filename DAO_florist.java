package briliana.florist.DAO;

import briliana.florist.DAOImplement.DAOImplement_florist;
import briliana.florist.Koneksi.Koneksi_floristDB;
import briliana.florist.Model.Model_florist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO_florist implements DAOImplement_florist {

    Connection connection;
    final String insert = "INSERT INTO tabel_florist (nama_bunga, jumlah_beli, harga) VALUES (?, ?, ?);";
    final String update = "UPDATE tabel_florist SET nama_bunga=?, jumlah_beli=?, harga=? WHERE id=?;";
    final String delete = "DELETE FROM tabel_florist WHERE id=?;";
    final String select = "SELECT * FROM tabel_florist;";
    //final String getByKeyword = "SELECT * FROM tabel_florist WHERE nama_bunga LIKE ?;";

    public DAO_florist() {
        connection = Koneksi_floristDB.connection();
    }

    @Override
    public void insert(Model_florist florist) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, florist.getNama_bunga());
            statement.setInt(2, florist.getJumlah_beli());
            statement.setString(3, florist.getHarga());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(Model_florist florist) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, florist.getNama_bunga());
            statement.setInt(2, florist.getJumlah_beli());
            statement.setString(3, florist.getHarga());
            statement.setInt(4, florist.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Model_florist> getAll() {
        List<Model_florist> floristList = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Model_florist florist = new Model_florist();
                florist.setId(rs.getInt("id"));
                florist.setNama_bunga(rs.getString("nama_bunga"));
                florist.setJumlah_beli(rs.getInt("jumlah_beli"));
                florist.setHarga(rs.getString("harga"));
                floristList.add(florist);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_florist.class.getName()).log(Level.SEVERE, null, ex);
        }
        return floristList;
    }

    @Override
    public List<Model_florist> getByKeyword(String keyword) {
    List<Model_florist> floristList = new ArrayList<>();
    try {
        String query = "SELECT * FROM tabel_florist WHERE nama_bunga LIKE ? OR jumlah_beli LIKE ? OR harga LIKE ?";
        PreparedStatement st = connection.prepareStatement(query);
        st.setString(1, "%" + keyword + "%");
        st.setString(2, "%" + keyword + "%");
        st.setString(3, "%" + keyword + "%");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Model_florist florist = new Model_florist();
            florist.setId(rs.getInt("id"));
            florist.setNama_bunga(rs.getString("nama_bunga"));
            florist.setJumlah_beli(rs.getInt("jumlah_beli"));
            florist.setHarga(rs.getString("harga"));
            floristList.add(florist);
        }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_florist.class.getName()).log(Level.SEVERE, null, ex);
        }
        return floristList;
    }
}
