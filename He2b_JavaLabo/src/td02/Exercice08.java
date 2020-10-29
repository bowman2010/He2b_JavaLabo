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
public class Exercice08 {
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("Entrez un nombre de secondes :");
        int sec = kbd.nextInt();
        System.out.println("Ca donne "+(sec/60)+" minutes");
    }
    
}
