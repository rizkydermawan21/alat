package pbo11;

import java.util.Scanner;

public class AlatTulis extends Alat {

    static Scanner Alat = new Scanner(System.in);

    String fungsi(String fung) {
     System.out.print(" Fungsi:");
     fung = Alat.next();
     return fung;
    }

    int dimensi(int D) {
     int p, l;
     System.out.print(" Dimensi:");
     p = Alat.nextInt();
     l = Alat.nextInt();
     return D;
    }
}
