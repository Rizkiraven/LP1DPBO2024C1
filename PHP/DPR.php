<?php

// deklarasi kelas DPR
class DPR
{
    // atribut - atribut privat untuk id, nama, bidang, partai, dan foto
    private $id = "";
    private $nama = "";
    private $bidang = "";
    private $partai = "";
    private $foto = "";

    // konstruktor dengan parameter id, nama, bidang, partai, dan foto
    public function __construct($id = "", $nama = "", $bidang = "", $partai = "", $foto = "")
    {
        $this->id = $id;
        $this->nama = $nama;
        $this->bidang = $bidang;
        $this->partai = $partai;
        $this->foto = $foto;
    }

    // get id
    public function getId()
    {
        return $this->id;
    }

    // set id
    public function setId($id)
    {
        $this->id = $id;
    }

    // get nama
    public function getNama()
    {
        return $this->nama;
    }

    // set nama
    public function setNama($nama)
    {
        $this->nama = $nama;
    }

    // get bidang
    public function getBidang()
    {
        return $this->bidang;
    }

    // set bidang
    public function setBidang($bidang)
    {
        $this->bidang = $bidang;
    }

    // get partai
    public function getPartai()
    {
        return $this->partai;
    }

    // set partai
    public function setPartai($partai)
    {
        $this->partai = $partai;
    }

    // get foto
    public function getFoto()
    {
        return $this->foto;
    }

    // set foto
    public function setFoto($foto)
    {
        $this->foto = $foto;
    }
}

?>