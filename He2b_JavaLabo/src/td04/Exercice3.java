/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td04;

import FvpLib.Utils;

/**
 * Moyenne
 * Écrivez un programme qui demande à l’utilisateur 5 valeurs et affiche la somme de ces
 * valeurs et la moyenne de ces valeurs.
 * 
 * @author bowman
 */
public class Exercice3 {
    
    public static void main(String[] args) {
        double somme = 0;
        for (int n=1; n<=5; n++) {
            double dd = Utils.askForDouble("Entrez nombre "+n+" : ");
            somme+=dd;
        }
        
        System.out.println("Somme   = "+somme);
        System.out.println("Moyenne = "+somme/5);
        
    }
    
}
