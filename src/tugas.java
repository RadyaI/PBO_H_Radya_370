//author: Radya - 202410370110370
//Current progress = Modul 1

import java.util.Scanner;

class Admin {
    final String username = "Admin370";
    final String password = "Password370";

    boolean login(String getUsername, String getPassword) {
        if (getUsername.equals(username) && getPassword.equals(password)) {
            return true;
        }
        return false;
    }

}

class Mahasiswa {
    final String username = "Radya Iftikhar";
    final String password = "202410370110370";

    void displayInfo() {
        System.out.println("\nNama: " + username);
        System.out.println("Nim: " + password);
    }

    boolean login(String getUsername, String getPassword) {
        if (getUsername.equals(username) && getPassword.equals(password)) {
            displayInfo();
            return true;
        }
        return false;
    }

}

public class tugas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Pilih login: ");
        System.out.println("1. Admin\n2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        String pilihan = scan.nextLine().trim();

        if (pilihan.equals("1")) {

            System.out.print("Masukkan username: ");
            String username = scan.nextLine();
            System.out.print("Masukkan password: ");
            String password = scan.nextLine();

            boolean login = admin.login(username, password);

            if (login) {
                System.out.println("Berhasil login");
            } else {
                System.out.println("Password/username salah");
            }

        } else if (pilihan.equals("2")) {

            System.out.print("Masukkan username: ");
            String username = scan.nextLine();
            System.out.print("Masukkan password: ");
            String password = scan.nextLine();

            boolean login = mahasiswa.login(username, password);
            if (login) {
                System.out.println("Berhasil login");
            } else {
                System.out.println("Password/username salah");
            }

        } else {
            System.out.println("Input tidak valid!");
        }

        scan.close();

    }
}
