// Author: Muhammad Radya Iftikhar - 202410370110370

package codelab.modul2;

class Hewan {
    String nama, suara, jenis;
    int populasi;

    String tampilkanInfo() {
        return "Nama: " + nama + "\n" + "Jenis: " + jenis + "\n" + "Suara: " + suara + "\n" + "populasi: " + populasi;
    }

}

public class codelab1 {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.nama = "Kucing";
        hewan1.jenis = "Mamalia";
        hewan1.suara = "Ngeeeengg!";
        hewan1.populasi = 1000;
        
        hewan2.nama = "Anjing";
        hewan2.jenis = "Mamalia";
        hewan2.suara = "Info copas kodingan";
        hewan2.populasi = 500;

        System.out.println(hewan1.tampilkanInfo() + "\n");
        System.out.println(hewan2.tampilkanInfo());

    }
}