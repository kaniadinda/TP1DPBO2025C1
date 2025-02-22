# membuat kelas petshop
class Petshop:
    # konstruktor dengan parameter
    def __init__(self, id, nama_produk, kategori, harga):
        self.id = id
        self.nama_produk = nama_produk
        self.kategori = kategori
        self.harga = harga
    #get dan set
    def set_id(self, id):
        self.id = id

    def get_id(self):
        return self.id

    def set_nama_produk(self, nama_produk):
        self.nama_produk = nama_produk

    def get_nama_produk(self):
        return self.nama_produk

    def set_kategori(self, kategori):
        self.kategori = kategori

    def get_kategori(self):
        return self.kategori

    def set_harga(self, harga):
        self.harga = harga

    def get_harga(self):
        return self.harga

    def tampilkan(self):
        print(f"ID: {self.id}")
        print(f"Nama Produk: {self.nama_produk}")
        print(f"Kategori: {self.kategori}")
        print(f"Harga: Rp{self.harga}\n")
