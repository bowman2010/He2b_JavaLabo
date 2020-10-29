/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev1.td03;

import java.util.Scanner;

/**
 *
 * @author bowman
 */
public class Exercice01 {
    
    public static void main(String[] args) {
        System.out.print("Entrez votre age : ");
        Scanner kbd = new Scanner(System.in);
        int age = kbd.nextInt();
        if (age>=18) System.out.println("Vous etes majeur");
                else System.out.println("Vous etes mineur");
    }
    
}
