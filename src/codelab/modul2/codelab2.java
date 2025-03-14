// Author: Muhammad Radya Iftikhar - 202410370110370

package codelab.modul2;

class RekeningBank {
    String nomorRekening, namaPemilik;
    double saldo;

    String tampilkanInfo() {
        return "Nomor Rekening: " + nomorRekening + "\n" +
                "Nama Pemilik: " + namaPemilik + "\n" +
                "Saldo: Rp." + String.format("%.2f", saldo) + "\n";
    }

    void setorUang(double jumlahSetor) {
        saldo += jumlahSetor;
        System.out.printf("%s menyetor Rp.%.1f. Saldo sekarang %.1f\n", namaPemilik, jumlahSetor, saldo);
    }

    void tarikUang(double jumlahTarik) {
        if (saldo < jumlahTarik) {
            System.out.printf("%s menarik %.1f. (GAGAL, Saldo tidak mencukupi) saldo sekarang %.1f\n", namaPemilik,
                    jumlahTarik, saldo);
        } else {
            saldo -= jumlahTarik;
            System.out.printf("%s menarik %.1f. (BERHASIL) saldo sekarang %.1f\n", namaPemilik, jumlahTarik, saldo);
        }
    }
}

public class codelab2 {
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank();
        RekeningBank rek2 = new RekeningBank();

        rek1.namaPemilik = "Muhammad Radya Iftikhar";
        rek1.nomorRekening = "202410370110370";
        rek1.saldo = 50_000_000;

        rek2.namaPemilik = "Aini";
        rek2.nomorRekening = "202410370110381";
        rek2.saldo = 40_000_000;

        System.out.println(rek1.tampilkanInfo());
        System.out.println(rek2.tampilkanInfo());

        rek1.setorUang(50_000_000);
        rek2.setorUang(10_000_000);

        System.out.println();

        rek1.tarikUang(20_000_000);
        rek2.tarikUang(55_000_000);

        System.out.println();

        System.out.println(rek1.tampilkanInfo());
        System.out.println(rek2.tampilkanInfo());
    }
}