package LATIHAN;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Mahasiswa {

    private String nama, nim, jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getNim() {
        return nim;
    }
}

public class CRUD_Mahasiswa {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswaData = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n========> MENU <========");
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Iterator<Mahasiswa> mahasiswa_it = mahasiswaData.iterator();
                    System.out.printf("\n%-10s %-20s %-20s %-20s\n", "No", "Nama", "Nim", "Jurusan");
                    System.out.println("------------------------------------------------------------------");
                    int index = 1;
                    if (!mahasiswaData.isEmpty()) {
                        while (mahasiswa_it.hasNext()) {
                            Mahasiswa tempData = mahasiswa_it.next();
                            System.out.printf("%-10s %-20s %-20s %-20s\n", index++, tempData.getNama(),
                                    tempData.getNim(),
                                    tempData.getJurusan());
                        }
                    } else {
                        System.out.println("Tidak ada data mahasiswa...\n");
                    }
                    break;
                case 2:
                    System.out.println("\n=======> TAMBAH DATA <=======");
                    System.out.print("Masukkan Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan Nim: ");
                    String nim = scan.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = scan.nextLine();

                    mahasiswaData.add(new Mahasiswa(nama, nim, jurusan));

                    System.out.println("Sukses menambahkan mahasiswa atas nama " + nama + "\n");

                    break;
                case 3:
                    Iterator<Mahasiswa> updateMahasiswa = mahasiswaData.iterator();
                    int updateIndex = 1;
                    if (!mahasiswaData.isEmpty()) {
                        System.out.printf("\n%-10s %-20s %-20s %-20s\n", "No", "Nama", "Nim", "Jurusan");
                        System.out.println("------------------------------------------------------------------");
                        while (updateMahasiswa.hasNext()) {
                            Mahasiswa tempData = updateMahasiswa.next();
                            System.out.printf("%-10d %-20s %-20s %-20s\n", updateIndex++, tempData.getNama(),
                                    tempData.getNim(), tempData.getJurusan());
                        }
                        System.out.print("Masukkan No mahasiswa yang ingin diupdate: ");
                        int pilihUpdate = scan.nextInt();
                        scan.nextLine();
                        System.out.println();
                        System.out.print("Masukkan Nama: ");
                        String updateNama = scan.nextLine();
                        System.out.print("Masukkan Nim: ");
                        String updateNim = scan.nextLine();
                        System.out.print("Masukkan Jurusan: ");
                        String updateJurusan = scan.nextLine();
                        mahasiswaData.set(pilihUpdate - 1, new Mahasiswa(updateNama, updateNim, updateJurusan));

                        System.out.println("Berhasil mengubah data mahasiswa atas nama " + updateNama + "\n");
                    } else {
                        System.out.println("\nTidak ada data mahasiswa...");
                    }
                    break;
                case 4:
                    Iterator<Mahasiswa> deleteMahasiswa = mahasiswaData.iterator();
                    int deleteIndex = 1;
                    if (!mahasiswaData.isEmpty()) {
                        System.out.printf("\n%-10s %-20s %-20s %-20s\n", "No", "Nama", "Nim", "Jurusan");
                        System.out.println("------------------------------------------------------------------");
                        while (deleteMahasiswa.hasNext()) {
                            Mahasiswa tempData = deleteMahasiswa.next();
                            System.out.printf("%-10d %-20s %-20s %-20s\n", deleteIndex++, tempData.getNama(),
                                    tempData.getNim(), tempData.getJurusan());
                        }
                        System.out.print("Masukkan No mahasiswa yang ingin diupdate: ");
                        int pilihDelete = scan.nextInt();
                        mahasiswaData.remove(pilihDelete - 1);
                        System.out.println("\nBerhasil menghapus mahasiswa atas nama "
                                + mahasiswaData.get(pilihDelete - 1).getNama() + "\n");
                        scan.nextLine();
                    }
                    break;
                default:
                    scan.close();
                    return;
            }
        }

    }

}
