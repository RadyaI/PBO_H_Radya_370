package codelab.modul4;

import codelab.modul4.perpustakaan.Anggota;
import codelab.modul4.perpustakaan.Fiksi;
import codelab.modul4.perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        Fiksi fiksi = new Fiksi("Bumi Manusia", "Pramoedya Ananta Toer");
        NonFiksi NonFiksi = new NonFiksi("The Alchemist", "Paulo Coelho");
        Anggota anggota1 = new Anggota("Muhammad Radya Iftikhar", "H370");
        Anggota anggota2 = new Anggota("Nur Aini", "H381");

        NonFiksi.displayInfo();
        fiksi.displayInfo();

        System.out.println();

        anggota1.displayInfo();
        anggota2.displayInfo();

        System.out.println();

        anggota1.pinjamBuku(NonFiksi.getJudul());
        anggota2.pinjamBuku(fiksi.getJudul(), 7);

        System.out.println();

        anggota1.kembalikanBuku();
        anggota2.kembalikanBuku();
    }
}
