/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Main
{
    static void triangle(int n){
        int a, b;
        if (n >= 1) {
                for (a = 0; a <= n; a++){
                    for (b = 0; b < a; b++) {
                        System.out.print("#");
                    }
                    System.out.println();
                }
            }else{
                System.out.print("Parameter harus angka dan positif!");
            }
    }
    
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            //int a, b;
            System.out.println("Masukkan nilai N : ");
            int N = Integer.parseInt(br.readLine());
            triangle(N);
        } catch(IOException | NumberFormatException ex){
            System.out.println("Parameter harus angka dan positif!");
        }
	}
}
