/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.logika;

/**
 *
 * @author MOKLET-2
 */
public class GanjilGenap2 {
    public static void main(String[] args) {
        int angka[] = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("\t Ganjil dan Genap Array \n");
        System.out.println("\n Genap : ");
        for (int i = 0; i < 10; i++){
            if (angka[i] % 2 == 0){
                System.out.println(angka[i] + ",");
            }
        }
        
        System.out.println("\n Ganjil : ");
        for (int j = 0; j < 10; j++){
            if (angka[j] % 2 != 0) {
                System.out.println(angka[j] + ",");
            }
        }
    }
}
