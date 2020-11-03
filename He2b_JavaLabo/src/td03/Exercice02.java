/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td03;

import FvpLib.Utils;

/**
 * Pair ou impair - if/else
 * Écrivez un programme qui demande à l’utilisateur un nombre entier et affiche "ce nombre
 * est pair" ou "ce nombre est impair" selon le cas.
 * @author bowman
 */
public class Exercice02 {


    public static void main(String[] args) {
        int nb = Utils.askForInt("Entrez un nombre entier : ");
        if (nb%2==0) System.out.println("Ce nombre est pair");
        else System.out.println("Ce nombre est impair");
    }
    
}
