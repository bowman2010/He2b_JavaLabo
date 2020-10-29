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
public class Exercice10 {
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("Entrez un montant en Euros: ");
        int montant = kbd.nextInt();
        System.out.print("Interets a 2% sur un an = "+(montant*2/100)+" Euros");
        
    }
    
}
