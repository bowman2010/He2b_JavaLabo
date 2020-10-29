/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev1.td02;

import java.util.Scanner;

/**
 *
 * @author bowman
 */
public class Exercice11 {
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("Entrez le prix d'un article : ");
        int prix = kbd.nextInt();
        
        System.out.print("Entrez le taux de TVA en % : ");
        int tva = kbd.nextInt();
        
        System.out.print("Entrez le nombre de produits : ");
        int nba = kbd.nextInt();
        
        int prixtot = (nba*prix);
        int calcul_tva = prixtot*tva/100;
        int ptvaincl = prixtot+calcul_tva;
                
        System.out.println("Prix HTVA     : "+prixtot);
        System.out.println("TVA           : "+calcul_tva);
        System.out.println("Prix TVA inc. : "+ptvaincl);
    }
    
}
