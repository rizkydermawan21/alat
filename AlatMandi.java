package pbo11;

import java.util.Scanner;

public class AlatMandi extends Alat {

    static Scanner Alat = new Scanner(System.in);

    String wujud(String color) {
     System.out.print("Masukkan Warna:");
     color = Alat.next();
     return color;
    }

    String warna(String wuj) {
     System.out.print("Masukkan Wujud:");
     wuj = Alat.next();
     return wuj;
    }

}

