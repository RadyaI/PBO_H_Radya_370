//author: Radya - 202410370110370
//Current progress = Modul 1

import java.util.Scanner;

class Admin {
    String username;
    String password;

    Admin() {
        this.username = "Admin370";
        this.password = "Password370";
    }
}

class Mahasiswa {
    String username;
    String password;

    Mahasiswa() {
        this.username = "Radya Iftikhar";
        this.password = "202410370110370";
    }
}

public class tugas_pbo {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        Admin admin = new Admin();
        Scanner scan = new Scanner(System.in);

        System.out.println("Pilih login: ");
        System.out.println("1. Admin\n2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        String pilihan = scan.nextLine().trim().toLowerCase();

        if (pilihan.equals("1")) {

            System.out.print("Masukkan username: ");
            String username = scan.nextLine();
            System.out.print("Masukkan password: ");
            String password = scan.nextLine();

            if (username.equals(admin.username) && password.equals(admin.password)) {
                System.out.println("Login admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan.equals("2")) {

            System.out.print("Masukkan username: ");
            String username = scan.nextLine();
            System.out.print("Masukkan password: ");
            String password = scan.nextLine();

            if (username.equals(mahasiswa.username) && password.equals(mahasiswa.password)) {
                System.out.println("Login Mahasiswa berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else {
            System.out.println("Input tidak valid!");
        }

        scan.close();

    }
}
