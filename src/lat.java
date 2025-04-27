import java.util.Scanner;

public class lat {
    public static void main(String[] args) {
    
        // Inisialisasi
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan nama: ");
        String nama = scan.nextLine();

        System.out.println("Masukkan Umur: ");
        int umur = scan.nextInt();

    
        System.out.printf("Nama: %s\nUmur: %d", nama, umur);

        scan.close();
    }
}
