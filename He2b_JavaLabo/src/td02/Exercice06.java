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
public class Exercice06 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("Entrez un entier a :");
        int a = kbd.nextInt();
        
        int unites = a%10;
        int dizaines = (a/10)%10;
        int centaines = (a/100)%10;
        
        System.out.println("Unites    : "+unites);
        System.out.println("Dizaines  : "+dizaines);
        System.out.println("Centaines : "+centaines);
    }
    
}
