/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan24;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan24 {

    /**
     * @param args the command line arguments
     */
    
    private static void bandingkan(int a,int b){
        if (a < b) {
            System.out.println(a+" Lebih kecil dari "+b);
        }else if (a > b) {
            System.out.println(a+" Lebih besar dari "+b);
        }else{
            System.out.println(a+" Sama dengan "+b);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String ulangi;
        do {            
            System.out.println("======Program Perbandingan Nilai======");
            System.out.print("Masukkan Nilai Pertama : ");
            int nilai1 = sc.nextInt();
            System.out.print("Masukkan Nilai Kedua : ");
            int nilai2 = sc.nextInt();
            bandingkan(nilai1, nilai2);
            System.out.print("\nUlangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = sc.next();
            ulangi = ulangi.toLowerCase();
            System.out.println();
        } while (ulangi.equals("ya"));
    }
    
}
