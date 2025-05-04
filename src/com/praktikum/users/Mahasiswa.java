package com.praktikum.users;

public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login(String username, String pass) {
        if (username.equals(super.getNama()) && pass.equals(super.getNim())) {
            displayInfo(super.getNama(), super.getNim());
        } else {
            System.out.println("Username atau Password Salah");
        }
    }

    @Override
    public void displayInfo(String nama, String nim){
        System.out.println("Login Berhasil\n");
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("Nim: %s\n", nim);
    }
}