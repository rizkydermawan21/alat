package pbo11;

import java.util.Scanner;

public class PBO11 {

    static String nam, mer, wuj, color,fung,manf,jakes;
    static int jumlah,D,pil;
    static double har;
    static Scanner Alat = new Scanner(System.in);
    static AlatMandi alman = new AlatMandi();
    static AlatTulis altul = new AlatTulis();
    static AlatKesehatan alkes = new AlatKesehatan();
    public static void main(String[] args) {
        input();    
    }

    public static void input() {        
        System.out.print("Masukkan Jumlah Alat :");
        jumlah = Alat.nextInt();
        for (int i = 0; i < jumlah; i++) {
          System.out.println("Alat ke-"+(i+1)); 
          System.out.println("1. ALAT MANDI");
          System.out.println("2. ALAT TULIS");
          System.out.println("3. ALAT KESEHATAN");
          System.out.print("Masukkan Jenis Alat :");          
          pil = Alat.nextInt();
            
            
            if (pil == 1){
          System.out.println("AlatMandi");
                nam = alman.nama(nam);
                mer = alman.merk(mer);
                har = alman.hargaBeli(har);
                wuj = alman.wujud(wuj);
                color = alman.warna(color);
                System.out.println("-----------------------------");
                System.out.println("nama :"+ nam);
                System.out.println("merk:"+mer);
                System.out.println("harga beli:"+har);
                System.out.println("wujud:"+wuj);
                System.out.println("warna:"+color);
                System.out.println("-----------------------------------");
            }
            if (pil == 2) {      
          System.out.println("AlatTulis");
                nam = altul.nama(nam);
                mer = altul.merk(mer);
                har = altul.hargaBeli(har);
                fung = altul.fungsi(fung);
                D = altul.dimensi(D);
                System.out.println("-----------------------------");
                System.out.println("nama :"+ nam);
                System.out.println("merk:"+mer);
                System.out.println("harga beli:"+har);
                System.out.println("wujud:"+wuj);
                System.out.println("warna:"+color);
                System.out.println("-----------------------------------");
            }
            if (pil == 3) {     
          System.out.println("AlatKesehatan");
                nam = alkes.nama(nam);             
                jakes=alkes.jenis(jakes);
                manf=alkes.manfaat(manf);
                System.out.println("-----------------------------");
                System.out.println("nama :"+ nam);
                System.out.println("merk:"+mer);
                System.out.println("harga beli:"+har);
                System.out.println("wujud:"+wuj);
                System.out.println("warna:"+color);
                System.out.println("-----------------------------------");
            }
        }        
    }
}
