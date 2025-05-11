package com.praktikum.users;

import java.util.Scanner;
import com.praktikum.actions.*;

public class Admin extends User implements AdminActions {
    private String username = "Admin370";
    private String password = "Password370";

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    Scanner scan = new Scanner(System.in);

    @Override
    public void displayAppMenu() {
        boolean loop = true;

        do {
            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0: LogOut");

            System.out.print("Masukkan pilihan (1/2/0): ");
            int pilihan = scan.nextInt();
            scan.nextLine();
            switch (pilihan) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.err.println("Pilihan Tidak Valid");
                    loop = false;
                    break;
            }
        } while (loop);
    }

    @Override
    public void login(String username, String pass) {
        if (username.equals(this.username) && pass.equals(this.password)) {
            displayInfo(super.getNama(), super.getNim());
            System.out.println();

            displayAppMenu();
        } else {
            System.out.println("Username atau Password Salah!");
        }
    }

    @Override
    public void displayInfo(String nama, String nim) {
        System.out.printf("\nBerhasil Login (Admin)\n");
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("Nim: %s ", nim);
    }

    @Override
    public void manageUsers() {
        System.err.println("\n>> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

    public void manageItems() {
        System.err.println("\n>> Fitur Kelola Barang Belum Tersedia <<");
    }
    
}