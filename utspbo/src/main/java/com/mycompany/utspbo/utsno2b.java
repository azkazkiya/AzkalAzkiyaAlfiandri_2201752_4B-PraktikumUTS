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
public class utsno2b {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Input angka: ");
        int n = inputan.nextInt();

        System.out.println("\nPattern B");
        polaB(n);

        inputan.close();
    }
    
 
    public static void polaB(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
