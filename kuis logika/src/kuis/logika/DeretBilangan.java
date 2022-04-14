/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.logika;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class DeretBilangan {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Deret Bilangan");
        System.out.println("Masukan Bilangan Awal");
        int awal = sc.nextInt();
        System.out.println("Masukan Bilangan Akhir");
        int akhir = sc.nextInt();
        int total = 0;
        int jmlh = 1 -awal+akhir;
        System.out.println("Total Bilangan"+""+"="+"");
        while (awal <= akhir){
            System.out.println(awal+"");
            System.out.println("+");
            System.out.println("");
            total += awal;
            awal++;
        }
        System.out.println("="+""+total);
        System.out.println("/nJumlah Bilangan ="+ jmlh);
    }
}