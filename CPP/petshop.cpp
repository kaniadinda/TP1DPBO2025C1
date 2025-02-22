#include <iostream>
#include <string>

using namespace std;

// membuat kelas petshop
class Petshop {
private:
    int id;
    string namaProduk;
    string kategori;
    double harga;

public:
    // konstruktor default
    Petshop() {}

    // konstruktor dengan parameter
    Petshop(int id, string namaProduk, string kategori, double harga) {
        this->id = id;
        this->namaProduk = namaProduk;
        this->kategori = kategori;
        this->harga = harga;
    }

    // setter
    void setId(int id) { this->id = id; }
    void setNamaProduk(string namaProduk) { this->namaProduk = namaProduk; }
    void setKategori(string kategori) { this->kategori = kategori; }
    void setHarga(double harga) { this->harga = harga; }

    // getter
    int getId() { return id; }
    string getNamaProduk() { return namaProduk; }
    string getKategori() { return kategori; }
    double getHarga() { return harga; }

    // menampilkan data produk
    void tampilkan() {
        cout << "ID: " << id << endl;
        cout << "Nama Produk: " << namaProduk << endl;
        cout << "Kategori: " << kategori << endl;
        cout << "Harga: Rp" << harga << endl;
    }
};
