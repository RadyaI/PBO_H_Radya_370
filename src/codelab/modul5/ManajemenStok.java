package codelab.modul5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        daftarBarang.add(new Barang("Laptop", 10));
        daftarBarang.add(new Barang("Mouse", 15));
        daftarBarang.add(new Barang("Keyboard", 7));
        daftarBarang.add(new Barang("Headset", 16));
        daftarBarang.add(new Barang("TWS", 40));
        daftarBarang.add(new Barang("Monitor", 35));

        int pilihan;

        do {
            System.out.println("\n--- Menu Manajemen Stok ---");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.print("\nNama Barang: ");
                        String nama = scanner.nextLine();

                        System.out.print("Stok Awal: ");
                        try {
                            int stok = scanner.nextInt();
                            daftarBarang.add(new Barang(nama, stok));
                            System.out.println(nama + " berhasil ditambahkan sebanyak " + stok);
                        } catch (InputMismatchException e) {
                            System.out.println("Input stok harus berupa angka!");
                            scanner.nextLine();
                        }
                        break;

                    case 2:
                        if (daftarBarang.isEmpty()) {
                            System.out.println("\nStok barang kosong.");
                        } else {
                            System.out.println("\nDaftar Barang:");
                            Iterator<Barang> iterator = daftarBarang.iterator();
                            int i = 0;
                            System.out.printf("%-10s %-20s %-10s\n", "No", "Nama Barang", "Stok");
                            System.out.println("-------------------------------------");
                            while (iterator.hasNext()) {
                                Barang b = iterator.next();
                                System.out.printf("%-10d %-20s %-10d\n", i++, b.getNama(), b.getStok());
                            }

                        }
                        break;

                    case 3:
                        try {
                            if (daftarBarang.isEmpty()) {
                                System.out.println("\nStok barang kosong.");
                                break;
                            }

                            System.out.printf("%-10s %-20s %-10s\n", "No", "Barang", "Stok");
                            System.out.println("-------------------------------------");
                            for (int i = 0; i < daftarBarang.size(); i++) {
                                Barang b = daftarBarang.get(i);
                                System.out.printf("%-10d %-20s %-25d\n", i, b.getNama(), b.getStok());
                            }

                            System.out.print("\nPilih indeks barang: ");
                            int indeks = scanner.nextInt();

                            System.out.print("Jumlah yang akan diambil: ");
                            int jumlahAmbil = scanner.nextInt();

                            Barang barangDipilih = daftarBarang.get(indeks);
                            if (jumlahAmbil > barangDipilih.getStok()) {
                                throw new StokTidakCukupException(
                                        "Stok untuk " + barangDipilih.getNama() + " hanya tersisa "
                                                + barangDipilih.getStok());
                            }

                            barangDipilih.setStok(barangDipilih.getStok() - jumlahAmbil);
                            System.out.printf("Stok %s berhasil dikurangi sebanyak %d.\n", barangDipilih.getNama(),
                                    jumlahAmbil);
                            System.out.printf("Stok %s tersisa %d\n", barangDipilih.getNama(), barangDipilih.getStok());

                        } catch (InputMismatchException e) {
                            System.out.println("Input harus berupa angka!");
                            scanner.nextLine();
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Indeks tidak valid.");
                        } catch (StokTidakCukupException e) {
                            System.out.println("ERROR: " + e.getMessage());
                        }
                        break;

                    case 0:
                        System.out.println("Terima kasih!");
                        break;

                    default:
                        System.out.println("Menu tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                pilihan = 4;
            }

        } while (pilihan != 0);

        scanner.close();
    }
}
