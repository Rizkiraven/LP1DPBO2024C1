/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// import library yang digunakan
import java.util.ArrayList;
import java.util.Scanner;

// deklarasi kelas Main
public class Main
{
  // metode untuk menampilkan data anggota DPR dalam bentuk tabel dinamis (sesuai panjang huruf inputan user)
  private static void displayListDPR(ArrayList<DPR> listDPR)
  {
    // atribut untuk menetapkan panjang awal ID, nama, bidang, dan partai
    int idTerpanjang = 2;
    int namaTerpanjang = 4;
    int bidangTerpanjang = 6;
    int partaiTerpanjang = 6;

    // menghitung panjang maksimum di setiap kolom yang ada
    for (DPR dpr : listDPR)
    {
      // cek apakah panjang ID saat ini lebih panjang daripada panjang yang sudah ditetapkan di awal
      if (dpr.getId().length() > idTerpanjang)
      {
        idTerpanjang = dpr.getId().length(); // jika ID lebih panjang, maka panjang awal diupdate
      }
      // cek apakah panjang nama saat ini lebih panjang daripada panjang yang sudah ditetapkan di awal
      if (dpr.getnama().length() > namaTerpanjang)
      {
        namaTerpanjang = dpr.getnama().length(); // jika nama lebih panjang, maka panjang awal diupdate
      }
      // cek apakah panjang bidang saat ini lebih panjang daripada panjang yang sudah ditetapkan di awal
      if (dpr.getBidang().length() > bidangTerpanjang)
      {
        bidangTerpanjang = dpr.getBidang().length(); // jika bidang lebih panjang, maka panjang awal diupdate
      }
      // cek apakah panjang partai saat ini lebih panjang daripada panjang yang sudah ditetapkan di awal
      if (dpr.getPartai().length() > partaiTerpanjang)
      {
        partaiTerpanjang = dpr.getPartai().length(); // jika partai lebih panjang, maka panjang awal diupdate
      }
    }

    // format string untuk menampilkan tabel dengan align ke kiri
    String formatPrint = "| %-" + idTerpanjang + "s | %-" + namaTerpanjang + "s | %-" + bidangTerpanjang + "s | %-" + partaiTerpanjang + "s |%n";

    // menampilkan tabel bagian garis paling atas memakai format
    System.out.format("+-%1$s-+-%2$s-+-%3$s-+-%4$s-+%n",
      "-".repeat(idTerpanjang),
      "-".repeat(namaTerpanjang),
      "-".repeat(bidangTerpanjang),
      "-".repeat(partaiTerpanjang)
      /* jadi untuk system out atau print ini pakai format, tanda %1$s itu semacam
         variabel atau atribut yang akan diganti dengan argumen yang ditetapkan
         setelah format string. Pada kasus ini argumen nya ada "-" dan di repeat
         atau diulang sebanyak panjang ID, nama, bidang, dan partai */
    );
    // menampilkan tabel bagian header (yang menampilkan ID, nama, bidang, dan partai)
    System.out.format(formatPrint, "ID", "Nama", "Bidang", "Partai");
    System.out.format("+-%1$s-+-%2$s-+-%3$s-+-%4$s-+%n",
      "-".repeat(idTerpanjang),
      "-".repeat(namaTerpanjang),
      "-".repeat(bidangTerpanjang),
      "-".repeat(partaiTerpanjang)
      /* jadi untuk system out atau print ini pakai format, tanda %1$s itu semacam
         variabel atau atribut yang akan diganti dengan argumen yang ditetapkan
         setelah format string. Pada kasus ini argumen nya ada "-" dan di repeat
         atau diulang sebanyak panjang ID, nama, bidang, dan partai */
    );
    // menampilkan tabel bagian isi atau list anggota DPR
    for (DPR dpr : listDPR) // memakai perulangan untuk cek semua data yang ada pada list
    {
      // print memakai format dan memanggil formatPrint lalu memanggil get untuk mendapatkan dan menampilkan semua data nya
      System.out.format(formatPrint,
        dpr.getId(),
        dpr.getnama(),
        dpr.getBidang(),
        dpr.getPartai()
      );
    }
    // menampilkan tabel bagian garis paling bawah memakai format
    System.out.format("+-%1$s-+-%2$s-+-%3$s-+-%4$s-+%n",
      "-".repeat(idTerpanjang),
      "-".repeat(namaTerpanjang),
      "-".repeat(bidangTerpanjang),
      "-".repeat(partaiTerpanjang)
      /* jadi untuk system out atau print ini pakai format, tanda %1$s itu semacam
         variabel atau atribut yang akan diganti dengan argumen yang ditetapkan
         setelah format string. Pada kasus ini argumen nya ada "-" dan di repeat
         atau diulang sebanyak panjang ID, nama, bidang, dan partai */
    );
    System.out.println(); // print new line
  }

  // main
  public static void main(String[] args)
    {
      // scanner untuk menerima inputan dari user
      Scanner sc = new Scanner(System.in);
      // membuat array list untuk anggota DPR
      ArrayList<DPR> listDPR = new ArrayList<>();

    // sebagai nilai sementara inputan user
    int m = 0;

    // ketika m tidak sama dengan 5
    while (m != 5)
    {
      // akan menampilkan menu fitur yang bisa dilakukan oleh user
      System.out.println("+=============================================+");
      System.out.println("|   Selamat datang ke pendataan Anggota DPR   |");
      System.out.println("+=============================================+");
      System.out.println("Halaman fitur yang tersedia :");
      System.out.println("1. Tambah Data Anggota"); // memilih angka 1 untuk menambah data anggota
      System.out.println("2. Edit Data Anggota"); // memilih angka 2 untuk mengedit data anggota
      System.out.println("3. Hapus Data Anggota"); // memilih angka 3 untuk menghapus data anggota
      System.out.println("4. Tampilkan Data Anggota"); // memilih angka 4 untuk menampilkan data anggota dalam bentuk tabel
      System.out.println("5. Keluar\n"); // memilih angka 5 untuk keluar dari program

      System.out.print("Fitur yang dipilih : ");

      m = sc.nextInt(); // menerima inputan angka dari user
      sc.nextLine(); // newline

      // jika m = 1 (inputan user adalah 1)
      if (m == 1)
      {
        // maka akan menerima inputan ID, nama, bidang, dan partai untuk ditambahkan ke list
        System.out.print("Input ID : ");
        String id = sc.nextLine();
        System.out.print("Input Nama : ");
        String nama = sc.nextLine();
        System.out.print("Input Bidang : ");
        String bidang = sc.nextLine();
        System.out.print("Input Partai : ");
        String partai = sc.nextLine();
        System.out.println();

        listDPR.add(new DPR(id, nama, bidang, partai)); // menambahkan data baru ke list

        System.out.println("Baik, data sudah ditambahkan!\n");
      }
      // jika m = 2 (inputan user adalah 2)
      else if (m == 2)
      {
        System.out.print("Input ID yang akan di edit : ");
        String id = sc.nextLine(); // menerima inputan ID yang akan di edit
        int found = 0; // penanda (semacam boolean)
        // perulangan untuk mencari data pada list sesuai ID nya
        for (DPR dpr : listDPR)
        {
          // jika ID yang dicari ada pada list
          if (dpr.getId().equals(id))
          {
            found = 1; // penanda berubah menjadi 1 (menandakan bahwa data ada pada list)
            // menerima inputan ID baru, nama baru, bidang baru, dan partai baru kepada ID yang lama
            System.out.print("Input ID baru : ");
            String newId = sc.nextLine();
            System.out.print("Input Nama baru : ");
            String nama = sc.nextLine();
            System.out.print("Input Bidang baru : ");
            String bidang = sc.nextLine();
            System.out.print("Input Partai baru : ");
            String partai = sc.nextLine();
            System.out.println();

            listDPR.set(listDPR.indexOf(dpr), new DPR(newId, nama, bidang, partai));
            System.out.println("Baik, data sudah diedit!\n");
            break;
          }
        }
        // jika penanda masih tetap 0, artinya ID yang ingin di edit tidak ada pada list
        if(found == 0)
        {
          System.out.println("\nMaaf, data dengan ID tersebut tidak ditemukan!\n");
        }
      }
      // jika m = 3 (inputan user adalah 3)
      else if (m == 3)
      {
        System.out.print("Input ID yang akan di hapus : ");
        String id = sc.nextLine(); // menerima inputan ID yang akan di hapus
        int found1 = 0; // penanda (semacam boolean)
        System.out.println(); // newline

        // perulangan untuk mencari data pada list sesuai ID nya
        for (DPR dpr : listDPR)
        {
          // jika ID yang dicari ada pada list
          if (dpr.getId().equals(id))
          {
            found1 = 1; // penanda berubah menjadi 1 (menandakan bahwa data ada pada list)
            listDPR.remove(dpr); // menghapus data berdasarkan ID yang diinput
            System.out.println("Baik, data sudah dihapus!\n");
            break;
          }
        }
        // jika penanda masih tetap 0, artinya ID yang ingin di hapus tidak ada pada list
        if (found1 == 0)
        {
          System.out.println("Maaf, ID yang dicari tidak ditemukan!\n");
        }
      }
      // jika m = 4 (inputan user adalah 4)
      else if (m == 4)
      {
        // jika list tidak ada isinya
        if(listDPR.isEmpty())
        {
          System.out.println("Maaf, tidak ada data yang dapat ditampilkan :(\n");
        }
        // jika list ada isinya
        else
        {
          System.out.println("\nBerikut list data anggota DPR :");
          displayListDPR(listDPR);
        }
      }
    }
    System.out.println("\nTerimakasih!"); // output ketika user keluar dari program (m = 5)
  }
}