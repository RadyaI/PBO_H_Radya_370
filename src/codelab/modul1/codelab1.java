// Author: Radya-202410370110370

package codelab.modul1;

import java.util.Scanner;

public class codelab1 {
    public static void main(String[] args) {
        String nama;
        int tahun;

        Scanner scan = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Tahun: ");
        tahun = scan.nextInt();

        System.out.printf("Nama %s tahun %d", nama, tahun);

        scan.close();

    }
}
