package tugas;

class Mahasiswa {
    final String nama = "Radya Iftikhar";
    final String nim = "202410370110370";

    void displayInfo() {
        System.out.println("\nNama: " + nama);
        System.out.println("Nim: " + nim);
    }

    boolean login(String getUsername, String getPassword) {
        if (getUsername.equals(nama) && getPassword.equals(nim)) {
            displayInfo();
            return true;
        }
        return false;
    }
}