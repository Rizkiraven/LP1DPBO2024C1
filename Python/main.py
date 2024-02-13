# Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 1
# dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# import file kelas
from DPR import DPR

# fungsi untuk menampilkan tabel data anggota DPR
def displayListDPR(listDPR):
    # atribut untuk menetapkan panjang awal ID, nama, bidang, dan partai
    idTerpanjang = 2
    namaTerpanjang = 4
    bidangTerpanjang = 6
    partaiTerpanjang = 6

    # menghitung panjang maksimum di setiap kolom yang ada
    for dpr in listDPR:
        # cek apakah panjang ID saat ini lebih panjang daripada panjang yang sudah ditetapkan di awal
        if len(dpr.getId()) > idTerpanjang:
            idTerpanjang = len(dpr.getId()) # jika ID lebih panjang, maka panjang awal diupdate
        
        # cek apakah panjang nama saat ini lebih panjang daripada panjang yang sudah ditetapkan di awal
        if len(dpr.getNama()) > namaTerpanjang:
            namaTerpanjang = len(dpr.getNama()) # jika nama lebih panjang, maka panjang awal diupdate
        
        # cek apakah panjang bidang saat ini lebih panjang daripada panjang yang sudah ditetapkan di awal
        if len(dpr.getBidang()) > bidangTerpanjang:
            bidangTerpanjang = len(dpr.getBidang()) # jika bidang lebih panjang, maka panjang awal diupdate
        
        # cek apakah panjang partai saat ini lebih panjang daripada panjang yang sudah ditetapkan di awal
        if len(dpr.getPartai()) > partaiTerpanjang:
            partaiTerpanjang = len(dpr.getPartai()) # jika partai lebih panjang, maka panjang awal diupdate
    
    # format string untuk menampilkan tabel
    format_print = "| {:<{}s} | {:<{}s} | {:<{}s} | {:<{}s} |"
    
    # menampilkan tabel bagian garis paling atas memakai format (yang {} itu diisi dengan '-' yang disesuaikan dengan panjang hurufnya)
    print("+{}+{}+{}+{}+".format('-' * (idTerpanjang + 2), '-' * (namaTerpanjang + 2), '-' * (bidangTerpanjang + 2), '-' * (partaiTerpanjang + 2)))
    
    # menampilkan tabel bagian header (yang menampilkan ID, nama, bidang, dan partai)
    print(format_print.format("ID", idTerpanjang, "Nama", namaTerpanjang, "Bidang", bidangTerpanjang, "Partai", partaiTerpanjang))
    
    # menampilkan tabel bagian garis bawah header memakai format (yang {} itu diisi dengan '-' yang disesuaikan dengan panjang hurufnya)
    print("+{}+{}+{}+{}+".format('-' * (idTerpanjang + 2), '-' * (namaTerpanjang + 2), '-' * (bidangTerpanjang + 2), '-' * (partaiTerpanjang + 2)))
    
    # menampilkan tabel bagian isi dari list anggota DPR
    # memakai perulangan untuk cek semua data yang ada pada list
    for dpr in listDPR:
        # print memakai format dan memanggil format_print lalu memanggil get untuk mendapatkan dan menampilkan semua data nya
        print(format_print.format(dpr.getId(), idTerpanjang, dpr.getNama(), namaTerpanjang, dpr.getBidang(), bidangTerpanjang, dpr.getPartai(), partaiTerpanjang))
    
    # menampilkan tabel bagian garis paling bawah memakai format (yang {} itu diisi dengan '-' yang disesuaikan dengan panjang hurufnya)
    print("+{}+{}+{}+{}+".format('-' * (idTerpanjang + 2), '-' * (namaTerpanjang + 2), '-' * (bidangTerpanjang + 2), '-' * (partaiTerpanjang + 2)))
    print()

# fungsi utama (main)
def main():
    # list kosong untuk menampung data anggota DPR
    listDPR = []
    
    # sebagai nilai sementara inputan user
    m = 0 
    
    # ketika m tidak sama dengan 5
    while m != 5:
        # akan menampilkan menu fitur yang bisa dilakukan oleh user
        print("+=============================================+")
        print("|   Selamat datang ke pendataan Anggota DPR   |")
        print("+=============================================+")
        print("Halaman fitur yang tersedia :")
        print("1. Tambah Data Anggota") # memilih angka 1 untuk menambah data anggota
        print("2. Edit Data Anggota") # memilih angka 2 untuk mengedit data anggota
        print("3. Hapus Data Anggota") # memilih angka 3 untuk menghapus data anggota
        print("4. Tampilkan Data Anggota") # memilih angka 4 untuk menampilkan data anggota dalam bentuk tabel
        print("5. Keluar\n") # memilih angka 5 untuk kelaur dari program
        
        m = int(input("Fitur yang dipilih : ")) # tempat user menginput angka
        
        # jika m = 1 (inputan user adalah 1)
        if m == 1:
            # maka akan menerima inputan ID, nama, bidang, dan partai untuk ditambahkan ke list
            idanggota = input("Input ID : ")
            nama = input("Input Nama : ")
            bidang = input("Input Bidang : ")
            partai = input("Input Partai : ")
            
            # menambahkan data baru ke list
            listDPR.append(DPR(idanggota, nama, bidang, partai))
            print("\nBaik, data sudah ditambahkan!\n")
        
        # jika m = 2 (inputan user adalah 2)
        elif m == 2:
            # menerima input ID yang akan diedit
            idanggota = input("Input ID yang akan di edit : ")
            found = False # penanda
            
            # perulangan untuk mencari data pada list sesuai ID nya
            for dpr in listDPR:
                # jika ID yang dicari ada pada list
                if dpr.getId() == idanggota:
                    found = True # penanda menjadi true
                    # menerima inputan ID baru, nama baru, bidang baru, dan partai baru kepada ID yang lama
                    new_id = input("Input ID baru : ")
                    nama = input("Input Nama baru : ")
                    bidang = input("Input Bidang baru : ")
                    partai = input("Input Partai baru : ")
                    
                    # set ID, nama, bidang, dan partai yang baru
                    dpr.setId(new_id)
                    dpr.setNama(nama)
                    dpr.setBidang(bidang)
                    dpr.setPartai(partai)
                    
                    print("\nBaik, data sudah diedit!\n")
                    break
            
            # jika found atau penandanya masih false atau ID yang dicari tidak ada pada list
            if not found:
                print("\nMaaf, data dengan ID tersebut tidak ditemukan!\n")
        
        # jika m = 3 (inputan user adalah 3)
        elif m == 3:
            # menerima input ID yang akan dihapus
            idanggota = input("Input ID yang akan dihapus : ")
            found = False # penanda
            
            # perulangan untuk mencari data pada list sesuai ID nya
            for dpr in listDPR:
                # jika ID yang dicari ada pada list
                if dpr.getId() == idanggota:
                    found = True # penanda menjadi true
                    listDPR.remove(dpr) # menghapus data sesuai dengan ID nya
                    print("\nBaik, data sudah dihapus!\n")
                    break
            
            # jika found atau penandanya masih false atau ID yang dicari tidak ada pada list
            if not found:
                print("\nMaaf, ID yang dicari tidak ditemukan!\n")
        
        # jika m = 4 (inputan user adalah 4)
        elif m == 4:
            # jika list tidak ada isinya
            if not listDPR:
                print("Maaf, tidak ada data yang dapat ditampilkan :(\n")
            # jika list ada isinya
            else:
                print("\nBerikut list data anggota DPR :")
                displayListDPR(listDPR) # memanggil fungsi display list berbentuk tabel
    
    # output ketika user keluar dari program (m = 5)
    print("\nTerimakasih!")

# memanggil fungsi utama (main) ketika kode program ini dijalankan
if __name__ == "__main__":
    main()