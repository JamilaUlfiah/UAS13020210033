package briliana.florist.Model;

public class Model_florist {
    
    private int id;
    private String nama_bunga;
    private int jumlah_beli;
    private String harga;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_bunga() {
        return nama_bunga;
    }

    public void setNama_bunga(String nama_bunga) {
        this.nama_bunga = nama_bunga;
    }

    public int getJumlah_beli() {
        return jumlah_beli;
    }

    public void setJumlah_beli(int jumlah_beli) {
        this.jumlah_beli = jumlah_beli;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}