#include "petshop.cpp"

// tentukan max produk
const int MAX_PRODUK = 100;
Petshop daftarProduk[MAX_PRODUK];
int jumlahProduk = 0;

// menambahkan produk
void tambahProduk() {
    if (jumlahProduk >= MAX_PRODUK) {
        cout << "Kapasitas penuh!\n"; // jika produk penuh
        return;
    }

    int id;
    string nama, kategori;
    double harga;

    cout << "ID Produk: ";
    cin >> id;
    cin.ignore();
    cout << "Nama Produk: ";
    getline(cin, nama);
    cout << "Kategori: ";
    getline(cin, kategori);
    cout << "Harga: ";
    cin >> harga;

    daftarProduk[jumlahProduk] = Petshop(id, nama, kategori, harga);
    jumlahProduk++;
    cout << "Produk berhasil ditambahkan!\n";
}

// menampilkan produk
void tampilkanProduk() {
    if (jumlahProduk == 0) {
        cout << "Belum ada produk yang tersedia.\n";
        return;
    }
    for (int i = 0; i < jumlahProduk; i++) {
        cout << "\nProduk ke-" << i + 1 << ":\n";
        daftarProduk[i].tampilkan();
    }
}

// mengubah produk
void ubahProduk() {
    int id;
    cout << "Masukkan ID produk yang ingin diubah: ";
    cin >> id;

    for (int i = 0; i < jumlahProduk; i++) {
        if (daftarProduk[i].getId() == id) {
            string nama, kategori;
            double harga;

            cin.ignore();
            cout << "Nama Baru: ";
            getline(cin, nama);
            cout << "Kategori Baru: ";
            getline(cin, kategori);
            cout << "Harga Baru: ";
            cin >> harga;

            daftarProduk[i].setNamaProduk(nama);
            daftarProduk[i].setKategori(kategori);
            daftarProduk[i].setHarga(harga);
            cout << "Produk berhasil diperbarui!\n";
            return;
        }
    }
    cout << "Produk tidak ditemukan!\n";
}

// menghapus produk
void hapusProduk() {
    int id;
    cout << "Masukkan ID produk yang ingin dihapus: ";
    cin >> id;

    for (int i = 0; i < jumlahProduk; i++) {
        if (daftarProduk[i].getId() == id) {
            for (int j = i; j < jumlahProduk - 1; j++) {
                daftarProduk[j] = daftarProduk[j + 1];
            }
            jumlahProduk--;
            cout << "Produk berhasil dihapus!\n";
            return;
        }
    }
    cout << "Produk tidak ditemukan!\n";
}

// mencari produk
void cariProduk() {
    string nama;
    cin.ignore();
    cout << "Masukkan nama produk yang dicari: ";
    getline(cin, nama);

    for (int i = 0; i < jumlahProduk; i++) {
        if (daftarProduk[i].getNamaProduk() == nama) {
            cout << "\nProduk ditemukan:\n";
            daftarProduk[i].tampilkan();
            return;
        }
    }
    cout << "Produk tidak ditemukan!\n";
}

// menu
int main() {
    int pilihan;
    do {
        cout << "\n=== Menu PetShop ===\n";
        cout << "1. Tambah Produk\n";
        cout << "2. Tampilkan Produk\n";
        cout << "3. Ubah Produk\n";
        cout << "4. Hapus Produk\n";
        cout << "5. Cari Produk\n";
        cout << "6. Keluar\n";
        cout << "Pilih menu: ";
        cin >> pilihan;

        switch (pilihan) {
            case 1: tambahProduk(); break;
            case 2: tampilkanProduk(); break;
            case 3: ubahProduk(); break;
            case 4: hapusProduk(); break;
            case 5: cariProduk(); break;
            case 6: cout << "Terima kasih!\n"; break;
            default: cout << "Pilihan tidak valid!\n";
        }
    } while (pilihan != 6);

    return 0;
}
