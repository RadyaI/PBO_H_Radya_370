package codelab.modul2;

class RekeningBank {
    String nomorRekening, namaPemilik;
    long saldo;

    String tampilkanInfo() {
        return "Nomor Rekening: " + nomorRekening + "\n" + "Nama Pemilik: " + namaPemilik + "\n" + "Saldo: Rp." + saldo
                + "\n";
    }

    void setorUang(long jumlahSetor) {
        saldo += jumlahSetor;
        System.out.printf("%s menyetor Rp.%d. Saldo sekarang %d\n", namaPemilik, jumlahSetor, saldo);
    }

    void tarikUang(long jumlahTarik) {
        if (saldo < jumlahTarik) {
            System.out.printf("%s menarik %d. (GAGAL, Saldo tidak mencukupi) saldo sekarang %d\n", namaPemilik,
                    jumlahTarik, saldo);
        } else {
            saldo -= jumlahTarik;
            System.out.printf("%s menarik %d. (BERHASIL) saldo sekarang %d\n", namaPemilik, jumlahTarik, saldo);
        }
    }
}

public class codelab2 {
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank();
        RekeningBank rek2 = new RekeningBank();

        rek1.namaPemilik = "Muhammad Radya Iftikhar";
        rek1.nomorRekening = "202410370110370";
        rek1.saldo = 50_000_000l;

        rek2.namaPemilik = "Radya Second Account";
        rek2.nomorRekening = "2024103701103702";
        rek2.saldo = 40_000_000l;

        System.out.println(rek1.tampilkanInfo());
        System.out.println(rek2.tampilkanInfo());

        rek1.setorUang(50_000_000l);
        rek2.setorUang(10_000_000l);

        System.out.println();

        rek1.tarikUang(20_000_000l);
        rek2.tarikUang(55_000_000l);

        System.out.println();

        System.out.println(rek1.tampilkanInfo());
        System.out.println(rek2.tampilkanInfo());
    }
}