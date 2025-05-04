package codelab.modul4.perpustakaan;

import java.time.LocalDate;

public class Anggota implements Peminjaman {

    protected String nama;
    protected String idAnggota;

    protected String bukuPinjam;
    LocalDate defaultDeadline = LocalDate.now().plusDays(7);

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public void displayInfo() {
        System.out.printf("Anggota: %s (id: %s)\n", nama, idAnggota);
    }

    public void pinjamBuku(String judulBuku) {
        System.out.printf("%s meminjam buku (%s) selama 7 hari deadline (%s)\n", nama, judulBuku, defaultDeadline);
        this.bukuPinjam = judulBuku;
    }

    public void pinjamBuku(String judulBuku, int durasi) {
        LocalDate durasiDeadline = LocalDate.now().plusDays(durasi);
        System.out.printf("%s meminjam buku (%s) selama %d hari deadline (%s)\n", nama, judulBuku, durasi,
                durasiDeadline);
        this.bukuPinjam = judulBuku;
    }

    public void kembalikanBuku() {
        System.out.printf("%s mengembalikan buku (%s)\n", nama, bukuPinjam);
    }

}
