# Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 1
# dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# deklarasi kelas DPR
class DPR:
    # atribut privat untuk id anggota, nama, bidang, dan partai
    __idanggota = ""
    __nama = ""
    __bidang = ""
    __partai = ""
    
    # konstruktor dengan parameter self, id anggota, nama, bidang, dan partai
    def __init__(self, idanggota = "", nama = "", bidang = "", partai = ""):
        self.__idanggota = idanggota
        self.__nama = nama
        self.__bidang = bidang
        self.__partai = partai
    
    # untuk get id
    def getId(self):
        return self.__idanggota
    
    # untuk set id
    def setId(self, idanggota):
        self.__idanggota = idanggota
    
    # untuk get nama
    def getNama(self):
        return self.__nama
    
    # untuk set nama
    def setNama(self, nama):
        self.__nama = nama
    
    # untuk get bidang
    def getBidang(self):
        return self.__bidang
    
    # untuk set bidang
    def setBidang(self, bidang):
        self.__bidang = bidang
    
    # untuk get partai
    def getPartai(self):
        return self.__partai
    
    # untuk set partai
    def setPartai(self, partai):
        self.__partai = partai