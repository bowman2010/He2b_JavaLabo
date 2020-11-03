/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td04;

import FvpLib.Utils;

/**
 * écrivez un programme qui demande à l’utilisateur un nombre entier n et affiche :
 * - les nombres de 1 à n ;
 * - les nombres pairs qui sont compris entre 1 et n ;
 * - les nombres de -n à n ;
 * - les multiples de 5 qui sont compris entre 1 et n ;
 * - les multiples de n compris entre 1 et 100.
 * 
 * @author bowman
 */
public class Exercice1 {
    
    public static void main(String[] args) {
        int n = Utils.askForInt("Entrez un entier n : ");
        
        System.out.println("Nombres de 1 a n :");
        for (int i=1; i<=n; i++) 
            System.out.print(""+i+",");
        System.out.println("\n");

        System.out.println("Nombres pairs de 1 a n :");
        for (int i=2; i<=n; i+=2) 
            System.out.print(""+i+",");
        System.out.println("\n");

        System.out.println("Nombres de -n a n :");
        for (int i=-n; i<=n; i++) 
            System.out.print(""+i+",");
        System.out.println("\n");

        System.out.println("multiples de 5 entre 1 et n :");
        for (int i=5; i<=n; i+=5) 
            System.out.print(""+i+",");
        System.out.println("\n");

        System.out.println("Multiples de n entre 1 et 100 :");
        for (int i=n; i<=100; i+=n) 
            System.out.print(""+i+",");
        System.out.println("\n");


        
    }
    
}
