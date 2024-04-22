
package com.mycompany.utspbo;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class utsno1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan tiga digit integer: ");
        int number = inputan.nextInt();

        if (isPalindrome(number))
            System.out.println(number + " adalah palindrom");
        else
            System.out.println(number + " bukan palindrom");

        inputan.close();
    }
    
    public static boolean isPalindrome(int number) {
        int digit1 = number / 100;
        int digit3 = number % 10;

        return (digit1 == digit3); 
    }

}
