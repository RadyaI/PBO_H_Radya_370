import java.util.ArrayList;
import java.util.Iterator;

class Admin {

    String nama, password;

    public Admin(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }
}

class Mahasiswa {

    String nama, password;

    public Mahasiswa(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

}

public class TestExeptions {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> UserList = new ArrayList<>();
        UserList.add(new Mahasiswa("Radya", "123"));

        Iterator<Mahasiswa> it_user = UserList.iterator();
    }
}
