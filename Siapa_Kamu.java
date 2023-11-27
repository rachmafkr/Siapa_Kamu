/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Manusia;

/**
 * Nama: Rachma Fadilah Kunianto
 * NIM: 22166019
 * Kelas: SISTEM INFORMASI
 * Semester: Tiga
 * Mata Kuliah: PBO1
 */

class Manusia {
    private String nama;
    private int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void siapaKamu() {
        System.out.println("Saya manusia");
    }
}

class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang mengajar matakuliah " + mataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}

class Mahasiswa extends Manusia {
    private String NIM;
    private String kelas;

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang belajar di kelas " + kelas);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}

public class Siapa_Kamu {
    public static void main(String[] args) {
        
        // UNTUK DOSEN
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setNip("41227829930");
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        // UNTUK MAHASISWA
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Rachma Fadilah Kurnianto");
        mahasiswa.setUmur(20);
        mahasiswa.setNIM("22166019");
        mahasiswa.setKelas("PB01");

        System.out.println("\nNIM MAHASISWA : " + mahasiswa.getNIM());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}
