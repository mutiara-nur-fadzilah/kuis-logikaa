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
public class nilaisama {
    public static void main (String[] args) {
        int [] data1 = {4,8,12,16,20,24};
        int [] data2 = {2,4,8,16,32,64};
        System.out.print ("Data 1 = ");
        for (int k = 0; k<data1.length; k++){
            System.out.print (data1[k] + " ");
        }

        System.out.print ("\nData 2 = ");
        for (int l = 0; l<data2.length; l++){
            System.out.print (data2[l] + " ");
        }
        System.out.print ("\n--------------------------------\nData yang sama = ");
        for (int i = 0; i<data1.length; i++){
            for (int j = 0; j<data2.length; j++){
                if (data1[i]==data2[j])
                System.out.print (data1[i] + " ");
            }
        }             
}
}
