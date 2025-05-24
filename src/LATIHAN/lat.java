package LATIHAN;

import java.util.ArrayList;
import java.util.Iterator;

public class lat {
    public static void main(String[] args) {

        String kota2[] = {"Malang", "Batu"};
        kota2[1] = "Solo";

        ArrayList<String> kota = new ArrayList<>();
        kota.add("Malang");
        kota.add("Batu");
        kota.add("Jakarta");

        kota.set(0, "Solo");
        Iterator <String> it_kota = kota.iterator();

        while(it_kota.hasNext()){
            System.out.println(it_kota.next());
        }
    }
}
