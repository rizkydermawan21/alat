package pbo11;

import java.util.Scanner;

public class AlatKesehatan extends Alat{

    static Scanner Alat = new Scanner(System.in);
    String jenis(String jakes) {
        System.out.print("Masukkan Jenis:");
        jakes = Alat.next();
        return jakes;
    }
    String manfaat(String manf) {
        System.out.print("Masukkan Manfaat:");
        manf = Alat.next();
        return manf;
    }
}
