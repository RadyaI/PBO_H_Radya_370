package latihan;

import java.util.Scanner;

public class lat1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "Admin380";
        String password = "password380";
        String[] userData = {"Admin380", "password380"};
        // Pemilihan menu
        System.out.println("Pilih login:\n");
        System.out.println("1. Admin\n2. Mahasiswa");
        System.out.print("Masukkan pilihan:");
        String pilihan = scan.nextLine();

        // Pilihan pertama
        if (pilihan.equals("1")) {
            System.out.print("Masukkan username:");
            String admin = scan.nextLine();
            System.out.print("Masukkan password:");
            String pass = scan.nextLine();

            if (admin.equals(username) && pass.equals(password)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        }
        // Pilhan kedua
        else if (pilihan.equals("2")) {
            System.out.print("Masukkan Nama:");
            System.out.print("Masukkan NIM:");
        }
        // Selain pilihan
        else {
            System.out.println("Pilihan tidak valid.");
        }

        scan.close();

    }

}