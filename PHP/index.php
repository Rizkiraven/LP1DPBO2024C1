<?php

// memanggil file DPR.php
require_once 'DPR.php';

// array untuk menyimpan data anggota DPR
$anggota_dpr = [];

// fungsi menambah data anggota DPR
function tambahAnggotaDPR($id, $nama, $bidang, $partai, $foto)
{
    global $anggota_dpr;
    // memasukkan data baru kedalam array sementara yaitu anggota_baru
    $anggota_baru = new DPR($id, $nama, $bidang, $partai, $foto);
    // memasukkan data baru kedalam array anggota_dpr
    $anggota_dpr[] = $anggota_baru;
}

// fungsi menampilkan anggota DPR dalam bentuk tabel
function tampilkanAnggotaDPR()
{
    global $anggota_dpr;
    // menampilkan header dari tabel
    echo "<table border='1'>";
    echo "<tr><th>ID</th><th>Nama</th><th>Bidang</th><th>Partai</th><th>Foto Profil</th></tr>";
    // perulangan untuk mendapatkan semua data yang ada pada array untuk ditampilkan
    foreach ($anggota_dpr as $anggota)
    {
        echo '<tr>';
        echo '<td>' . $anggota->getId() . '</td>'; // menampilkan ID
        echo '<td>' . $anggota->getNama() . '</td>'; // menampilkan nama
        echo '<td>' . $anggota->getBidang() . '</td>'; // menampilkan bidang
        echo '<td>' . $anggota->getPartai() . '</td>'; // menampilkan partai
        echo '<td><img src="' . $anggota->getFoto() . '" alt="Foto Profil" width="60" height="60"></td>'; // menampilkan foto
        echo '</tr>';
    }
    echo "</table>";
}

// fungsi mengubah data anggota DPR berdasarkan ID nya
function ubahAnggotaDPR($id, $nama, $bidang, $partai, $foto)
{
    global $anggota_dpr;
    // perulangan untuk mendapatkan data pada array yang sesuai dengan ID inputan
    foreach ($anggota_dpr as $anggota)
    {
        // jika ID anggota ditemukan, ubah data sesuai dengan masukan baru user
        if ($anggota->getId() == $id)
        {
            $anggota->setNama($nama);
            $anggota->setBidang($bidang);
            $anggota->setPartai($partai);
            $anggota->setFoto($foto);
        }
    }
}

// fungsi menghapus data anggota DPR berdasarkan ID nya
function hapusAnggotaDPR($id)
{
    global $anggota_dpr;
    // perulangan untuk mendapatkan data pada array yang sesuai dengan ID inputan
    foreach ($anggota_dpr as $key => $anggota)
    {
        // jika ID anggota ditemukan, hapus datanya dari array
        if ($anggota->getId() == $id)
        {
            unset($anggota_dpr[$key]);
        }
    }
}

// menambahkan beberapa data awal anggota DPR
tambahAnggotaDPR("01", "Ravenyx", "Pertahanan", "PSHK", "luvisrage.jpg");
tambahAnggotaDPR("02", "Cid Kagenou", "Hukum", "SG", "cid.jpg");
tambahAnggotaDPR("03", "Naofumi", "Keamanan", "PSI", "herta.jpg");

// menampilkan tabel data anggota DPR
echo "<h3>Daftar Anggota DPR</h3>";
tampilkanAnggotaDPR();

// menambah data anggota DPR baru
tambahAnggotaDPR("04", "Natsumi", "Pertanian", "PKK", "delta.jpg");
echo "<p>Baik, data baru sudah ditambahkan!</p>";
tampilkanAnggotaDPR();

// mengubah data anggota DPR yang sudah ada berdasarkan ID nya
ubahAnggotaDPR("03", "Naix", "Olahraga", "PJMK", "sukunaryomen.jpg");
echo "<p>Baik, data dengan ID 03 sudah diubah!</p>";
tampilkanAnggotaDPR();

// menghapus data anggota DPR yang sudah ada berdasarkan ID nya
hapusAnggotaDPR("04");
echo "<p>Baik, data dengan ID 04 sudah dihapus!</p>";
tampilkanAnggotaDPR();