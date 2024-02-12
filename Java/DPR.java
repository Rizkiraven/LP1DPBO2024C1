/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// deklarasi kelas DPR
class DPR
{
    // atribut - atribut privat untuk id, nama, bidang, dan partai
    private String id;
    private String nama;
    private String bidang;
    private String partai;

    // konstruktor dengan parameter id, nama, bidang, dan partai
    public DPR(String id, String nama, String bidang, String partai)
    {
        this.id = id;
        this.nama = nama;
        this.bidang = bidang;
        this.partai = partai;
    }

    // get id
    public String getId()
    {
        return id;
    }

    // set id
    public void setID(String id)
    {
        this.id = id;
    }

    //  get nama
    public String getnama()
    {
        return nama;
    }

    // set nama
    public void setnama(String nama)
    {
        this.nama = nama;
    }

    // get bidang
    public String getBidang()
    {
        return bidang;
    }

    // set bidang
    public void setbidang(String bidang)
    {
        this.bidang = bidang;
    }

    // get partai
    public String getPartai()
    {
        return partai;
    }

    // set partai
    public void setpartai(String partai)
    {
        this.partai = partai;
    }
}