/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

#include <bits/stdc++.h>
#include "DPR.cpp"

using namespace std;

int main()
{
    int i, n = 0;
    string id, name, bidang, partai, id_baru;
    vector<DPR> dprvec;

    cout << "Selamat datang ke pendataan Anggota DPR"
         << "\n\n";
    cout << "Jumlah Anggota : ";

    cin >> n;
    cout << '\n';
    for (i = 0; i < n; i++)
    {
        cout << "Input ID : ";
        cin >> id;
        cout << "Input Nama : ";
        cin >> name;
        cout << "Input Bidang : ";
        cin >> bidang;
        cout << "Input Partai : ";
        cin >> partai;
        cout << '\n';

        dprvec.push_back(DPR(id, name, bidang, partai));
    }

    cout << "Berikut list data anggota DPR" << '\n';

    for (i = 0; i < n; i++)
    {
        cout << "   ID   : " << dprvec[i].get_id() << '\n';
        cout << "  Nama  : " << dprvec[i].get_name() << '\n';
        cout << " Bidang : " << dprvec[i].get_bidang() << '\n';
        cout << " Partai : " << dprvec[i].get_partai() << "\n\n";
    }

    int m = 0;

    while (m != 5)
    {
        cout << "Halaman Fitur" << '\n';
        cout << "1. Tambah Data Anggota" << '\n'
             << "2. Edit Data Anggota" << '\n'
             << "3. Hapus Data Anggota" << '\n'
             << "4. List Data Anggota" << '\n'
             << "5. Exit" << "\n\n";
        cout << "Fitur yang dipilih : ";
        cin >> m;
        if (m == 1)
        {
            n++;
            cout << "Input ID : ";
            cin >> id;
            cout << "Input Nama : ";
            cin >> name;
            cout << "Input Bidang : ";
            cin >> bidang;
            cout << "Input Partai : ";
            cin >> partai;
            cout << '\n';

            dprvec.push_back(DPR(id, name, bidang, partai));

            cout << "Baik, data sudah ditambahkan!" << "\n\n";
        }
        else if (m == 2)
        {
            cout << "Input ID yang akan di edit : ";
            cin >> id;
            cout << "Input ID baru : ";
            cin >> id_baru;
            cout << "Input Nama baru : ";
            cin >> name;
            cout << "Input Bidang baru : ";
            cin >> bidang;
            cout << "Input Partai baru : ";
            cin >> partai;
            cout << '\n';

            for (i = 0; i < n; i++)
            {
                if (dprvec[i].get_id() == id)
                {
                    dprvec[i].set_id(id_baru);
                    dprvec[i].set_name(name);
                    dprvec[i].set_bidang(bidang);
                    dprvec[i].set_partai(partai);
                }
            }

            cout << "Baik, data sudah diedit!" << '\n';
        }
        else if (m == 3)
        {
            cout << "Input ID yang akan di hapus : ";
            cin >> id;
            cout << '\n';

            for (i = 0; i < n; i++)
            {
                if (dprvec[i].get_id() == id)
                {
                    dprvec.erase(dprvec.begin() + i);
                    n--;
                }
            }

            cout << "Baik, data sudah dihapus!" << '\n';
        }
        else if (m == 4)
        {
            cout << "Berikut list data anggota terbaru" << '\n';
            for (i = 0; i < n; i++)
            {
                cout << "   ID   : " << dprvec[i].get_id() << '\n';
                cout << "  Nama  : " << dprvec[i].get_name() << '\n';
                cout << " Bidang : " << dprvec[i].get_bidang() << '\n';
                cout << " Partai : " << dprvec[i].get_partai() << "\n\n";
            }
        }
    }

    cout << '\n' << "Terimakasih!" << '\n';

    return 0;
}