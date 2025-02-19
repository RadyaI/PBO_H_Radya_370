import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ambilScan = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = ambilScan.nextLine();

        ambilScan.close();

        System.out.println("Nama: " + nama);
    }
}
