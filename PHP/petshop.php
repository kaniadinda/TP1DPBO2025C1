<?php
class Petshop {
    private $id;
    private $namaProduk;
    private $kategori;
    private $harga;

    // konstruktor
    public function __construct($id, $namaProduk, $kategori, $harga) {
        $this->id = $id;
        $this->namaProduk = $namaProduk;
        $this->kategori = $kategori;
        $this->harga = $harga;
    }

    // getter
    public function getId() { return $this->id; }
    public function getNamaProduk() { return $this->namaProduk; }
    public function getKategori() { return $this->kategori; }
    public function getHarga() { return $this->harga; }

    // menampilkan data produk dalam format html
    public function tampilkan() {
        echo "<b>ID:</b> " . $this->id . "<br/>";
        echo "<b>Nama Produk:</b> " . $this->namaProduk . "<br/>";
        echo "<b>Kategori:</b> " . $this->kategori . "<br/>";
        echo "<b>Harga:</b> Rp" . number_format($this->harga, 0, ',', '.') . "<br/><br/>";
    }
}
?>
