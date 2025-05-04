package com.praktikum.users;

public class Admin extends User {
    private String username = "Admin370";
    private String password = "Password370";

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login(String username, String pass) {
        if (username.equals(this.username) && pass.equals(this.password)) {
            displayInfo(super.getNama(), super.getNim());
        } else {
            System.out.println("Username atau Password Salah!");
        }
    }

    @Override
    public void displayInfo(String nama, String nim) {
        System.out.printf("\nBerhasil Login (Admin)\n");
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("Nim: %s  \n", nim);
    }
}