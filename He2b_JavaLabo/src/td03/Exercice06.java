/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td03;

import FvpLib.Utils;

/**
 * Maximum de 3 nombres
 * Écrivez un programme qui demande à l’utilisateur trois nombres et affiche le maximum des trois. 
 * @author bowman
 */
public class Exercice06 {
    
    public static void main(String[] args) {
        double nb1 = Utils.askForDouble("Entrez nombre a : ");
        double nb2 = Utils.askForDouble("Entrez nombre b : ");
        double nb3 = Utils.askForDouble("Entrez nombre c : ");
        
        if (nb2>nb1) nb1=nb2;
        if (nb3>nb1) nb1=nb3;
        System.out.println("Le maximum est : "+nb1);
        
    }
    
}
