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
    static void HollowTriangle(int n){
        //int a, b;
        if (n >= 1) {
            if (n%2 == 0) {
                System.out.println("Parameter harus berupa angka ganjil!");
            } else {
                int a, b; 
                for (a = 1; a <= n; a++) { 
                    for (b = 1; b < a; b++) { 
                        System.out.print(" "); 
                    } 

                    for (b = 1; b <= (n*2 - (2*a - 1)); b++) { 
                        if (a == 1 || b == 1 ||  
                            b == (n*2 - (2*a - 1))) { 
                            System.out.print("o"); 
                        } 
                        else { 
                            System.out.print("x"); 
                        } 
                    } 
                    System.out.println(); 
                }
            }
        }else{
            System.out.println("Parameter harus berupa angka ganjil!");
        }
    }
    
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            //int a, b;
            System.out.println("Masukkan nilai N : ");
            int N = Integer.parseInt(br.readLine());
            HollowTriangle(N);
        } catch(IOException | NumberFormatException ex){
            System.out.println("Parameter harus berupa angka ganjil!");
        }
    }
}
