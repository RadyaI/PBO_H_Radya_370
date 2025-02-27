package latihan;

import java.util.Scanner;

public class lat2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = "Azril";

        System.out.print("Masukkan nama: ");
        nama = scan.nextLine();

        System.out.println("Nama saya " + nama);
        System.out.printf("Nama saya %s", nama);
        scan.close();
    }
}
