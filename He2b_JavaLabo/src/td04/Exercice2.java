/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td04;

import FvpLib.Utils;

/**
 * Écrire un programme qui demande à l’utilisateur la longueur d’une ligne et affiche une
 * ligne (une suite de tirets ’-’) de cette longueur.
 * 
 * @author bowman
 */
public class Exercice2 {
    
    public static void main(String[] args) {
        int n = Utils.askForInt("Nombre de tirets a afficher : ");
        for (int i=1; i<=n; i++) 
            System.out.print("-");
        System.out.println("");
    }
    
}
