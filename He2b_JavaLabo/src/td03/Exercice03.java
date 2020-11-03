/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td03;

import FvpLib.Utils;

/**
 * Maximum de 2 nombres
 * Écrivez un programme qui demande à l’utilisateur deux nombres et affiche le plus grand des deux.
 * Exemple : si l’utilisateur entre 7,5 et 2,3 le programme affiche 7,5.
 * @author bowman
 */
public class Exercice03 {
    
    public static void main(String[] args) {
        double nb1 = Utils.askForDouble("Entrez un premier nombre : ");
        double nb2 = Utils.askForDouble("Entrez un second nombre : ");
        if (nb2>nb1) nb1=nb2;
        System.out.println("Le plus grand nombre est : "+nb1);
        
    }
    
}
