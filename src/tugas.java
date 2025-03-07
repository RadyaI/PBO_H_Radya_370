//author: Radya - 202410370110370
//Current progress = Modul 1

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final String usernameMahasiswa = "Radya Iftikhar";
        final String passwordMahasiswa = "202410370110370";

        final String usernameAdmin = "Admin370";
        final String passwordAdmin = "Password370";

        System.out.println("Pilih login: ");
        System.out.println("1. Admin\n2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        String pilihan = scan.nextLine().trim();

        if (pilihan.equals("1")) {

            System.out.print("Masukkan username: ");
            String username = scan.nextLine();
            System.out.print("Masukkan password: ");
            String password = scan.nextLine();

            if (username.equals(usernameAdmin) && password.equals(passwordAdmin)) {
                System.out.println("Login admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan.equals("2")) {

            System.out.print("Masukkan username: ");
            String username = scan.nextLine();
            System.out.print("Masukkan password: ");
            String password = scan.nextLine();

            if (username.equals(usernameMahasiswa) && password.equals(passwordMahasiswa)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("\nNama: " + username);
                System.out.println("NIM: " + password);
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else {
            System.out.println("Input tidak valid!");
        }

        scan.close();

    }
}
