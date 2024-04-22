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
public class utsno2a {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Input angka: ");
        int n = inputan.nextInt();

        System.out.println("\nPattern A");
        polaA(n);
        inputan.close();
    }

    // Pola A
    public static void polaA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
