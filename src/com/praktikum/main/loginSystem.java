//author: Radya - 202410370110370
//Current progress: Modul 4
package com.praktikum.main;

import java.util.Scanner;
import com.praktikum.users.*;


public class loginSystem {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        User admin = new Admin("Muhammad Radya Admin", "2024370");
        User mahasiswa = new Mahasiswa("Muhammad Radya Iftikhar", "202410370110370");

        System.out.println("Pilih login: ");
        System.out.println("1. Admin\n2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        String pilihan = scan.nextLine().trim();

        if (pilihan.equals("1")) {

            System.out.print("Masukkan username: ");
            String username = scan.nextLine();
            System.out.print("Masukkan password: ");
            String password = scan.nextLine();

            admin.login(username, password);

        } else if (pilihan.equals("2")) {

            System.out.print("Masukkan username: ");
            String username = scan.nextLine();
            System.out.print("Masukkan password: ");
            String password = scan.nextLine();

            mahasiswa.login(username, password);

        } else {
            System.out.println("Input tidak valid!");
        }

        scan.close();
    }
}