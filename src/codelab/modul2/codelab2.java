package codelab.modul2;

import java.text.DecimalFormat;

class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    DecimalFormat formatter = new DecimalFormat("#,##0.0");

    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + formatter.format(saldo));
        System.out.println();
    }

    void masukanInfo(String nomor, String nama, double saldoAwal) {
        nomorRekening = nomor;
        namaPemilik = nama;
        saldo = saldoAwal;
        tampilkanInfo();
    }

    void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + formatter.format(jumlah) + ". Saldo sekarang: Rp"
                + formatter.format(saldo));
    }

    void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + formatter.format(jumlah)
                    + ". (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp" + formatter.format(saldo));
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + formatter.format(jumlah) + "(Berhasil) Saldo sekarang: Rp"
                    + formatter.format(saldo));
        }
    }
}

public class codelab2 {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.masukanInfo("202410370110381", "Aini", 25000000);
        rekening2.masukanInfo("202410370110370", "Radya", 50000000);

        rekening1.setorUang(5000000);
        rekening2.setorUang(10000000);

        rekening1.tarikUang(35000000);
        rekening2.tarikUang(20000000);

        System.out.println();
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}