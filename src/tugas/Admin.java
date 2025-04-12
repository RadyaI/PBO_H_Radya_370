package tugas;

public class Admin {
    final String username = "Admin370";
    final String password = "Password370";

    boolean login(String getUsername, String getPassword) {
        if (getUsername.equals(username) && getPassword.equals(password)) {
            return true;
        }
        return false;
    }
}