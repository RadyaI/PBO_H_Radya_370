// Author: Muhammad Radya Iftikhar - 202410370110370

package codelab.modul3;

import java.util.Scanner;

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
        System.out.printf("%s(kamu) menyerang %s(musuh) menggunakan Laser! (-20)\n", getNama(), target.getNama());
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
        System.out.printf("%s(musuh) menyerang %s(kamu) menggunakan Pistol! (-15)\n", getNama(), target.getNama());
        if (target.getKesehatan() <= 0) {
            System.out.printf("%s(kamu) mati...\n\n", target.getNama());
        } else {
            System.out.printf("Kesehatan %s(kamu) sekarang %d\n\n", target.getNama(), target.getKesehatan());
        }
    }
}

public class codelab {
    public static void main(String[] args) {
        KarakterGame KarakterUmum = new KarakterGame("Probe", 20);
        Musuh enemy = new Musuh("Adudu", 200);

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nickname: ");
        String nickname = scan.nextLine();
        Pahlawan hero = new Pahlawan(nickname, 150);
        scan.close();

        System.out.println("====== Game Start ======\n");
        System.out.printf("%s (kamu) memiliki kesehatan: %d\n", hero.getNama(), hero.getKesehatan());
        System.out.printf("%s (musuh) memiliki kesehatan: %d\n", enemy.getNama(), enemy.getKesehatan());
        System.out.printf("%s memiliki kesehatan: %d\n\n", KarakterUmum.getNama(), KarakterUmum.getKesehatan());

        KarakterUmum.serang(enemy);
        hero.serang(enemy);
        hero.serang(KarakterUmum);
        enemy.serang(hero);
        enemy.serang(hero);
        enemy.serang(hero);
        enemy.serang(hero);
        enemy.serang(hero);
        enemy.serang(hero);
        enemy.serang(hero);
        hero.serang(enemy);
        hero.serang(enemy);
        hero.serang(enemy);
        hero.serang(enemy);
        hero.serang(enemy);
        hero.serang(enemy);
        hero.serang(enemy);
        hero.serang(enemy);
        hero.serang(enemy);
    }
}
