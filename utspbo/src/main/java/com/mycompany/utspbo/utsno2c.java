/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class utsno2c {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Input angka: ");
        int n = inputan.nextInt();

        System.out.println("\nPattern C");
        polaC(n);


        inputan.close();
    }
    
        public static void polaC(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    
}
