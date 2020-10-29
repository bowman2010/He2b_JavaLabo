/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td02;

import java.util.Scanner;

/**
 *
 * @author bowman
 */
public class Exercice09 {
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("Entrez le nombre d'heures : ");
        int heures = kbd.nextInt();
        
        System.out.print("Entrez le nombre de minutes :");
        int minutes = kbd.nextInt();
        
        System.out.print("Entrez le nombre de secondes :");
        int secondes = kbd.nextInt();
        
        int secondes_tot = heures*3600+minutes*60+secondes;
        
        System.out.println("Nombre de secondes : "+secondes_tot);

    }
    
}
