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
public class Exercice04 {
        
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("Entrez le rayon : ");
        double r = kbd.nextDouble();
        double perimetre = 2*Math.PI*r;
        double aire = Math.PI * r*r;
        
        System.out.println("Perimetre du cercle: "+perimetre);
        System.out.println("Aire du cercle: "+aire);
        
    }
    
}
