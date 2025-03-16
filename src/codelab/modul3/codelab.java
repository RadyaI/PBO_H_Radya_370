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

    void serang(KarakterGame target) {  }
}

class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    void serang(KarakterGame target) {
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.printf("%s menyerang %s menggunakan Kamehameha!\n", getNama(), target.getNama());
        System.out.printf("Kesehatan %s sekarang %d\n", target.getNama(), target.getKesehatan());
    }
}

class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    void serang(KarakterGame target) {
        target.setKesehatan(getKesehatan() - 20);
        System.out.printf("%s menyerang %s menggunakan Sarung Wadimor!\n", getNama(), target.getNama());
        System.out.printf("Kesehatan %s sekarang %d\n", target.getNama(), target.getKesehatan());
    }
}

public class codelab {
    public static void main(String[] args) {
        // KarakterGame KarakterUmum = new KarakterGame("npc", 100);
        Pahlawan saitama = new Pahlawan("Saitama", 150);
        Musuh tungTungSahur = new Musuh("Tung tung sahur", 200);

        System.out.println("====== Game Start ======\n");
        System.out.printf("%s memiliki kesehatan: %d\n", saitama.getNama(), saitama.getKesehatan());
        System.out.printf("%s memiliki kesehatan: %d\n", tungTungSahur.getNama(), tungTungSahur.getKesehatan());

        System.out.println();

        saitama.serang(tungTungSahur);

        System.out.println();

        tungTungSahur.serang(saitama);
    }
}
