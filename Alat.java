package pbo11;

import java.util.Scanner;

public class Alat {
    
    static Scanner Alat = new Scanner(System.in);

    String nama(String nam) {
     System.out.print("Masukkan Nama Alat:");
     nam = Alat.next();
     return nam;
    }

    String merk(String mer) {
     System.out.print("Masukkan Merk:");
     mer = Alat.next();
     return mer;
    }

    double hargaBeli(double har) {
     System.out.print("Masukkan Harga:");
     har = Alat.nextDouble();
     return har;
    }
}
