/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// library yang digunakan
#include <iostream>
#include <string>

// import standard namespace
using namespace std;

// deklarasi kelas DPR
class DPR
{
    // private attributes untuk id, nama, bidang, dan partai
    private:
        string id;
        string name;
        string bidang;
        string partai;
    
    // public attributes
    public:
        // constructor
        DPR()
        {
            // set id, nama, bidang, dan partai ke default
            this->id = "";
            this->name = "";
            this->bidang = "";
            this->partai = "";
        }

        DPR(string id, string name, string bidang, string partai)
        {
            this->id = id;
            this->name = name;
            this->bidang = bidang;
            this->partai = partai;
        }

        string get_id()
        {
            return this->id;
        }

        void set_id(string id)
        {
            this->id = id;
        }

        string get_name()
        {
            return this->name;
        }

        void set_name(string name)
        {
            this->name = name;
        }

        string get_bidang()
        {
            return this->bidang;
        }

        void set_bidang(string bidang)
        {
            this->bidang = bidang;
        }

        string get_partai()
        {
            return this->partai;
        }

        void set_partai(string partai)
        {
            this->partai = partai;
        }

        // destructor
        ~DPR()
        {
        }
};