/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td01;

/**
 *
 * @author bowman
 */

public class Exercice03 {

    public static void pyramid(int base) {
        // Works only for odd numbers
        if (base%2==0) base++;
        
        int nbp = 1;
        int i=1;
        int shift = (base-nbp)/2;

        while (i<base) {
            for (int p=1; p<shift; p++)  System.out.print(" ");
            for (int p=1; p<=nbp; p++)   System.out.print("*");
            System.out.println("");
            nbp+=2;
            i++;
        }
    }

    public static void main(String[] args) {
        pyramid(5);
    }
}
