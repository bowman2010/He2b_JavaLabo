/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td03;

import FvpLib.Utils;

/**
 * Le type de triangle
 * Écrivez un programme qui demande à l’utilisateur la longueur des 3 côtés d’un triangle
 * et affiche s’il est : équilatéral (tous égaux), isocèle (2 égaux) ou quelconque.
 * @author bowman
 */
public class Exercice07 {
    
    public static void main(String[] args) {
        System.out.println("Tpe de triangle");
        double cote1 = Utils.askForDouble("Longueur coté 1 : ");
        double cote2 = Utils.askForDouble("Longueur coté 2 : ");
        double cote3 = Utils.askForDouble("Longueur coté 3 : ");
        
        if ((cote1==cote2)&&(cote1==cote3)) 
            System.out.println("Ce triangle est equilateral");
        else if ((cote1==cote3)||(cote1==cote2))
            System.out.println("Ce triangle est isocele");
        else 
            System.out.println("Ce triangle est quelconque");
    }
    
}
