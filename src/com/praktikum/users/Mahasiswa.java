package com.praktikum.users;

import java.util.Scanner;

import com.praktikum.actions.*;

public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    Scanner scan = new Scanner(System.in);

    @Override
    public void login(String username, String pass) {
        if (username.equals(super.getNama()) && pass.equals(super.getNim())) {
            displayInfo(super.getNama(), super.getNim());
            displayAppMenu();
        } else {
            System.out.println("Username atau Password Salah\n");
        }
    }

    @Override
    public void displayInfo(String nama, String nim) {
        System.out.println("\nLogin Berhasil\n");
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("Nim: %s\n", nim);
    }

    @Override
    public void displayAppMenu() {
        boolean loop = true;

        do {
            System.out.println("\n===== MAHASISWA MENU =====");
            System.out.println("1. Laporkan Barang Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0: LogOut");

            System.out.print("Masukkan pilihan (1/2/0): ");
            int pilihan = scan.nextInt();
            scan.nextLine();
            switch (pilihan) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
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
    public void reportItem() {
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scan.nextLine();

        System.out.print("Masukkan deskripsi barang: ");
        String deskripsiBarang = scan.nextLine();

        System.out.print("Lokasi terakhir ditemukan: ");
        String lokasiTerakhir = scan.nextLine();

        System.out.println("\n===============");
        System.out.println("Barang: " + namaBarang);
        System.out.println("Deskripsi Barang: " + deskripsiBarang);
        System.out.println("Lokasi terakhir: " + lokasiTerakhir);
        System.out.println("===============");
    }

    @Override
    public void viewReportedItems() {
        System.err.println("\n>> Fitur Lihat Laporan Belum Tersedia <<");
    }
}