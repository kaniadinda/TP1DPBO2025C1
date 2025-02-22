<?php
require_once "petshop.php";

// tampilan selamat datang
echo "<h4>===== Daftar Produk di Petshop =====</h4>";
echo "<hr>";

// membuat array of object dengan daftar produk
$produk1 = new Petshop(101, "Makanan Kucing", "Makanan", 50000);
$produk2 = new Petshop(102, "Shampoo Anjing", "Perawatan", 75000);
$produk3 = new Petshop(103, "Mainan Kucing", "Aksesoris", 30000);
$produk4 = new Petshop(104, "Kandang Burung", "Peralatan", 150000);
$produk5 = new Petshop(105, "Vitamin Kelinci", "Kesehatan", 40000);

$daftarProduk = [$produk1, $produk2, $produk3, $produk4, $produk5];

// menampilkan daftar produk
foreach ($daftarProduk as $index => $produk) {
    echo "<b># Data ke-" . ($index + 1) . ".</b><br/>";
    $produk->tampilkan();
}

?>
