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
public class utsno2d {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Input angka: ");
        int n = inputan.nextInt();

        System.out.println("\nPattern D");
        polaD(n);

        inputan.close();
    }
    
       public static void polaD(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
