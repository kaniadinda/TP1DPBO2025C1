package TP1DPBO2025.Java;

import java.util.Scanner;

public class Main {
    private static final int MAX_PRODUK = 100;
    private static Petshop[] daftarProduk = new Petshop[MAX_PRODUK];
    private static int jumlahProduk = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void tambahProduk() {
        if (jumlahProduk >= MAX_PRODUK) {
            System.out.println("Kapasitas penuh!\n");
            return;
        }

        System.out.print("ID Produk: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline
        System.out.print("Nama Produk: ");
        String nama = scanner.nextLine();
        System.out.print("Kategori: ");
        String kategori = scanner.nextLine();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();

        daftarProduk[jumlahProduk] = new Petshop(id, nama, kategori, harga);
        jumlahProduk++;
        System.out.println("Produk berhasil ditambahkan!\n");
    }

    public static void tampilkanProduk() {
        if (jumlahProduk == 0) {
            System.out.println("Belum ada produk yang tersedia.\n");
            return;
        }
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("\nProduk ke-" + (i + 1) + ":");
            daftarProduk[i].tampilkan();
        }
    }

    public static void ubahProduk() {
        System.out.print("Masukkan ID produk yang ingin diubah: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahProduk; i++) {
            if (daftarProduk[i].getId() == id) {
                System.out.print("Nama Baru: ");
                String nama = scanner.nextLine();
                System.out.print("Kategori Baru: ");
                String kategori = scanner.nextLine();
                System.out.print("Harga Baru: ");
                double harga = scanner.nextDouble();

                daftarProduk[i].setNamaProduk(nama);
                daftarProduk[i].setKategori(kategori);
                daftarProduk[i].setHarga(harga);
                System.out.println("Produk berhasil diperbarui!\n");
                return;
            }
        }
        System.out.println("Produk tidak ditemukan!\n");
    }

    public static void hapusProduk() {
        System.out.print("Masukkan ID produk yang ingin dihapus: ");
        int id = scanner.nextInt();

        for (int i = 0; i < jumlahProduk; i++) {
            if (daftarProduk[i].getId() == id) {
                for (int j = i; j < jumlahProduk - 1; j++) {
                    daftarProduk[j] = daftarProduk[j + 1];
                }
                daftarProduk[jumlahProduk - 1] = null;
                jumlahProduk--;
                System.out.println("Produk berhasil dihapus!\n");
                return;
            }
        }
        System.out.println("Produk tidak ditemukan!\n");
    }

    public static void cariProduk() {
        scanner.nextLine();
        System.out.print("Masukkan nama produk yang dicari: ");
        String nama = scanner.nextLine();

        for (int i = 0; i < jumlahProduk; i++) {
            if (daftarProduk[i].getNamaProduk().equalsIgnoreCase(nama)) {
                System.out.println("\nProduk ditemukan:");
                daftarProduk[i].tampilkan();
                return;
            }
        }
        System.out.println("Produk tidak ditemukan!\n");
    }

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Menu PetShop ===");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Ubah Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Cari Produk");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: tambahProduk(); break;
                case 2: tampilkanProduk(); break;
                case 3: ubahProduk(); break;
                case 4: hapusProduk(); break;
                case 5: cariProduk(); break;
                case 6: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid!\n");
            }
        } while (pilihan != 6);

        scanner.close();
    }
}
