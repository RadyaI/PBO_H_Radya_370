package codelab.modul4.perpustakaan;

public class Fiksi extends Buku{

    public Fiksi(String judul, String penulis){
        super(judul, penulis);
    }

    @Override
    public void displayInfo(){
        System.out.printf("Buku Fiksi: %s (Penulis: %s)\n", judul, penulis);
    }

    public String getJudul(){
        return judul;
    }
    
}
