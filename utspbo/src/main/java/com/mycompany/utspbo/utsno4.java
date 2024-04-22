
package com.mycompany.utspbo;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class utsno4 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        balok balok1 = new balok(1, 1, 1);
        balok balok2 = new balok(30, 40, 50);
        balok balok3 = new balok(25, 35, 45);
        System.out.println("Balok dengan panjang : " + balok1.panjang + 
                ", lebar : " + balok1.lebar + " dan tinggi : " + balok1.tinggi +
                ". Luasnya : " + balok1.getLuas() + ", sedangkan kelilingnya : " 
                + balok1.getKeliling() + " dan volumenya : " + balok1.getVolume());
        System.out.println("Balok dengan panjang : " + balok2.panjang + 
                ", lebar : " + balok2.lebar + " dan tinggi : " + balok2.tinggi +
                ". Luasnya : " + balok2.getLuas() + ", sedangkan kelilingnya : " 
                + balok2.getKeliling() + " dan volumenya : " + balok2.getVolume());
        System.out.println("Balok dengan panjang : " + balok3.panjang + 
                ", lebar : " + balok3.lebar + " dan tinggi : " + balok3.tinggi +
                ". Luasnya : " + balok3.getLuas() + ", sedangkan kelilingnya : " 
                + balok3.getKeliling() + " dan volumenya : " + balok3.getVolume());
        inputan.close();
    }
}

class balok {
    int panjang;
    int lebar;
    int tinggi;
    public balok() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }
    public balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }
    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }
    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    public int getVolume() {
        return panjang * lebar * tinggi;
    }
}