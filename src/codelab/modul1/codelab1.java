// Author: Radya-202410370110370

package codelab.modul1;

import java.time.LocalDate;
import java.util.Scanner;

public class codelab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String namaSiswa = scan.nextLine();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        String gender = scan.nextLine().trim().toLowerCase();

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scan.nextInt();

        if (tahunLahir <= 0 || tahunLahir > LocalDate.now().getYear()) {
            System.out.println("\nTahun lahir tidak valid!");
            System.exit(0);
        }

        int umur = LocalDate.now().getYear() - tahunLahir;

        if (!gender.equals("l") && !gender.equals("p")) {
            System.out.println("\nGender tidak valid!");
            System.exit(0);
        }

        String jenisKelamin = gender.equals("l") ? "Laki-laki" : "Perempuan";

        System.out.println("\n=========================================");
        System.out.printf("| %-15s | %-10s | %-5s |\n", "Nama", "Gender", "Umur");
        System.out.println("=========================================");
        System.out.printf("| %-15s | %-10s | %-5d |\n", namaSiswa, jenisKelamin, umur);
        System.out.println("=========================================");

        scan.close();
    }
}