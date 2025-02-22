package TP1DPBO2025.Java;

public class Petshop {
    private int id;
    private String namaProduk;
    private String kategori;
    private double harga;

    // konstruktor
    public Petshop(int id, String namaProduk, String kategori, double harga) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.kategori = kategori;
        this.harga = harga;
    }

    // setter
    public void setId(int id) { this.id = id; }
    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }
    public void setKategori(String kategori) { this.kategori = kategori; }
    public void setHarga(double harga) { this.harga = harga; }

    // getter
    public int getId() { return id; }
    public String getNamaProduk() { return namaProduk; }
    public String getKategori() { return kategori; }
    public double getHarga() { return harga; }

    // menampilkan data produk
    public void tampilkan() {
        System.out.println("ID: " + id);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga: Rp" + harga);
    }
}
