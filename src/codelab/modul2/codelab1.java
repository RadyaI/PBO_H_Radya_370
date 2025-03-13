package codelab.modul2;

class Hewan {
    String nama, suara, jenis;

    String tampilkanInfo() {
        return "Nama: " + nama + "\n" + "Jenis: " + jenis + "\n" + "Suara: " + suara;
    }

}

public class codelab1 {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.nama = "Kucing";
        hewan1.jenis = "Mamalia";
        hewan1.suara = "Ngeeeengg!";
        
        hewan2.nama = "Anjing";
        hewan2.jenis = "Mamalia";
        hewan2.suara = "Info copas kodingan";

        System.out.println(hewan1.tampilkanInfo() + "\n");
        System.out.println(hewan2.tampilkanInfo());
    }
}