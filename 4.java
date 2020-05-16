/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main
{
    private static final int JUMLAH_KARAKTER = 256;
    private static int[] total_per_karakter = new int[JUMLAH_KARAKTER];
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("\nMasukan string : ");
        String kata = s.nextLine();
        kata = kata.toLowerCase();
 
        // inisialisasikan setiap karakter berjumlah 0 buah
        for (int i=0; i<JUMLAH_KARAKTER; i++) {
            total_per_karakter[i] = 0;
        }
 
        // hitung jumlah setiap karakter
        int kata_len = kata.length();
        for (int i=0; i<kata_len; i++) {
            total_per_karakter[(int )kata.charAt(i)]++;
        }
 
        // tampilkan jumlah setiap karakter
        System.out.println();
        for (int i=0; i<JUMLAH_KARAKTER; i++) {
            if (total_per_karakter[i] > 1) {
                if (((char)i >= 'a' && (char)i <= 'z')) {
                    System.out.println((char) i + " : " + total_per_karakter[i]);
                } 
            }
        }
    }
}
