// Author: Muhammad Radya Iftikhar - 202410370110370

package codelab.modul3;

class KarakterGame {
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    int getKesehatan() {
        return kesehatan;
    }

    void serang(KarakterGame target) {
        System.out.printf("%snya baik tidak menyerang...\n\n", getNama());
    }
}

class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    void serang(KarakterGame target) {
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.printf("%s(kamu) menyerang %s(musuh) menggunakan sendal terbang!\n", getNama(), target.getNama());
        if (target.getKesehatan() <= 0) {
            System.out.printf("%s(musuh) mati...\n\n", target.getNama());
        } else {
            System.out.printf("Kesehatan %s(musuh) sekarang %d\n\n", target.getNama(), target.getKesehatan());
        }
    }
}

class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    void serang(KarakterGame target) {
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.printf("%s(musuh) menyerang %s(kamu) menggunakan Sarung Wadimor!\n", getNama(), target.getNama());
        if (target.getKesehatan() <= 0) {
            System.out.printf("%s(kamu) mati...\n\n", target.getNama());
        } else {
            System.out.printf("Kesehatan %s(kamu) sekarang %d\n\n", target.getNama(), target.getKesehatan());
        }
    }
}

public class codelab {
    public static void main(String[] args) {
        KarakterGame KarakterUmum = new KarakterGame("Rembo", 20);
        Pahlawan upin = new Pahlawan("Upin", 150);
        Musuh ipin = new Musuh("Ipin", 200);

        System.out.println("====== Game Start ======\n");
        System.out.printf("%s (kamu) memiliki kesehatan: %d\n", upin.getNama(), upin.getKesehatan());
        System.out.printf("%s (musuh) memiliki kesehatan: %d\n", ipin.getNama(), ipin.getKesehatan());
        System.out.printf("%s memiliki kesehatan: %d\n\n", KarakterUmum.getNama(), KarakterUmum.getKesehatan());

        KarakterUmum.serang(ipin);
        upin.serang(ipin);
        upin.serang(KarakterUmum);
        ipin.serang(upin);
        ipin.serang(upin);
        ipin.serang(upin);
    }
}
