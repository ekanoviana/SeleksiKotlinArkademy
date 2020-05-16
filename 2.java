/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.reflect.Array;
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
        
        int kata_len = kata.length();
        for (int i=0; i<kata_len; i++) {
            total_per_karakter[(int )kata.charAt(i)]++;
        }
        
        int jumlahAngka = 0;
        System.out.println();
        for (int i=0; i<JUMLAH_KARAKTER; i++) {
            if (total_per_karakter[i] > 0) {
                if ((char)i >= '0' && (char)i <= '9') {
                    jumlahAngka = total_per_karakter[i];
                } 
            }
        }
        
        int jumlahKata = 0;
        int i = 0;
        while (i < kata.length()) {
            while (i < kata.length() && kata.charAt(i) == ' ') i++; 
 
            if (i < kata.length() && kata.charAt(i) != ' ') {
                jumlahKata++;
                while (i < kata.length() && kata.charAt(i) != ' ' && kata.charAt(i) != 1) i++;   
            }
        }
        int jumlahString = jumlahKata - jumlahAngka;
        System.out.print(jumlahString + "/" + jumlahKata);
        
}
}
