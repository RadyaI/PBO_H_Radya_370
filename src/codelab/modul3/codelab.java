// Author: Muhammad Radya Iftikhar - 202410370110370

package codelab.modul3;

import java.util.Scanner;

class KarakterGame {
    // Membuat 2 atribut dengan modifier private agar hanya bisa diakses di class
    // nya sendiri
    private String nama;
    private int kesehatan;

    // Ini Konstruktor buat memberi nilai ke atributnya saat membuat object baru
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Setter untuk atribut nama
    void setNama(String nama) {
        this.nama = nama;
    }

    // getter untuk atribut nama
    String getNama() {
        return nama;
    }

    // Setter untuk atribut kesehatan
    void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // getter untuk atribut kesehatan
    int getKesehatan() {
        return kesehatan;
    }

    // Method serang untuk update kesehatan (setelah diserang) dan menampilkan info
    // penyerangan
    // Method ini nanti akan dioverride oleh sub-class di bawah
    void serang(KarakterGame target) {
        System.out.printf("%snya baik tidak menyerang...\n\n", getNama());
    }
}

// Class pahlawan ekstend class KarakterGame yang dimana Pahlawan menjadi
// sub-class dan KarakterGame menjadi super-class
class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        // Keyword super berfungsi untuk mewarisi atribut yang ada di parent class
        // Agar bisa diakses/digunakan juga di class ini
        super(nama, kesehatan);
    }

    // Override ini buat menimpa/menulis ulang method serang yang ada di super-class
    // Override biasanya digunakan ketika butuh method yang sama tapi fungsi yang
    // beda
    @Override
    void serang(KarakterGame target) {
        // Isi method ini berfungsi untuk mengurangi darah lawan dan menampilkan info
        // penyerangan
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.printf("%s(kamu) menyerang %s(musuh) menggunakan Laser! (-20)\n", getNama(), target.getNama());
        // Kalo darahnya 0 atau dibawah 0 maka infonya musuh mati
        if (target.getKesehatan() <= 0) {
            System.out.printf("%s(musuh) mati...\n\n", target.getNama());
        } else {
            System.out.printf("Kesehatan %s(musuh) sekarang %d\n\n", target.getNama(), target.getKesehatan());
        }
    }
}

// Ini penjelasannya sama seperti class Pahlawan di atas
class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        // Buat mewarisi atribut di class KarakterGame
        // agar bisa digunakan di class ini
        super(nama, kesehatan);
    }

    // Override menimpa/menulis ulang class serang untuk menampilkan info
    // saat musuh menyerang
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
    // Method utama untuk menjalankan kode
    public static void main(String[] args) {
        // Membuat object baru sekaligus dengan parameter agar atributnya langsung ada
        // nilainya
        KarakterGame KarakterUmum = new KarakterGame("Probe", 20);
        Musuh enemy = new Musuh("Adudu", 200);

        // Buat class pahlawan saya membuat untuk bisa memasukkan nickname
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nickname: ");
        String nickname = scan.nextLine();
        // Input nickname dulu kemudian nickname dikirim menggunakan parameter
        Pahlawan hero = new Pahlawan(nickname, 150);
        scan.close();

        // Menampilkan status awal
        System.out.println("====== Game Start ======\n");
        System.out.printf("%s (kamu) memiliki kesehatan: %d\n", hero.getNama(), hero.getKesehatan());
        System.out.printf("%s (musuh) memiliki kesehatan: %d\n", enemy.getNama(), enemy.getKesehatan());
        System.out.printf("%s memiliki kesehatan: %d\n\n", KarakterUmum.getNama(), KarakterUmum.getKesehatan());

        // Serang serang serang....
        KarakterUmum.serang(enemy);
        hero.serang(enemy);
        hero.serang(KarakterUmum);
        // Musuh menyerang pahlawan jadi nanti pada method serang di atas
        // Kesehatan pahlawan akan dikurangi
        enemy.serang(hero);
        enemy.serang(hero);
        enemy.serang(hero);
        enemy.serang(hero);
        enemy.serang(hero);
        enemy.serang(hero);
        enemy.serang(hero);
        // Hero menyerang musuh jadi nanti pada method serang di atas
        // Kesehatan musuh akan dikurangi
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
