package LATIHAN;

class random {
    static String Aslab() {
        String[] Aslab = { "Mba Rani", "Mas zam-zam", "Mas Fatih", "Mas Titan", "Mas Khoirul Umam" };
        return Aslab[(int) (Math.random() * 5)];
    }
}

public class RandomAslab {
    public static void main(String[] args) {

        System.out.println("Aslabmu besok adalah...." + random.Aslab());
        System.out.println("Aslabmu besok adalah...." + random.Aslab());
        System.out.println("Aslabmu besok adalah...." + random.Aslab());
    }
}