from petshop import Petshop

daftar_produk = []

# untuk tambah produk
def tambah_produk():
    id = int(input("ID Produk: "))
    nama = input("Nama Produk: ")
    kategori = input("Kategori: ")
    harga = float(input("Harga: "))

    daftar_produk.append(Petshop(id, nama, kategori, harga))
    print("Produk berhasil ditambahkan!\n")

# untuk menampilkan produk
def tampilkan_produk():
    if not daftar_produk:
        print("Belum ada produk yang tersedia.\n")
        return

    for idx, produk in enumerate(daftar_produk, start=1):
        print(f"\nProduk ke-{idx}:")
        produk.tampilkan()

# untuk mengubah detail produk
def ubah_produk():
    id = int(input("Masukkan ID produk yang ingin diubah: "))

    for produk in daftar_produk:
        if produk.get_id() == id:
            produk.set_nama_produk(input("Nama Baru: "))
            produk.set_kategori(input("Kategori Baru: "))
            produk.set_harga(float(input("Harga Baru: ")))
            print("Produk berhasil diperbarui!\n")
            return

    print("Produk tidak ditemukan!\n")

# untuk menghapus produk
def hapus_produk():
    id = int(input("Masukkan ID produk yang ingin dihapus: "))

    for produk in daftar_produk:
        if produk.get_id() == id:
            daftar_produk.remove(produk)
            print("Produk berhasil dihapus!\n")
            return

    print("Produk tidak ditemukan!\n")

# untuk mencari produk
def cari_produk():
    nama = input("Masukkan nama produk yang dicari: ")

    for produk in daftar_produk:
        if produk.get_nama_produk().lower() == nama.lower():
            print("\nProduk ditemukan:")
            produk.tampilkan()
            return

    print("Produk tidak ditemukan!\n")

# menu
def main():
    while True:
        print("\n=== Menu PetShop ===")
        print("1. Tambah Produk")
        print("2. Tampilkan Produk")
        print("3. Ubah Produk")
        print("4. Hapus Produk")
        print("5. Cari Produk")
        print("6. Keluar")
        
        pilihan = input("Pilih menu: ")

        if pilihan == "1":
            tambah_produk()
        elif pilihan == "2":
            tampilkan_produk()
        elif pilihan == "3":
            ubah_produk()
        elif pilihan == "4":
            hapus_produk()
        elif pilihan == "5":
            cari_produk()
        elif pilihan == "6":
            print("Terima kasih!")
            break
        else:
            print("Pilihan tidak valid!\n")

if __name__ == "__main__":
    main()
