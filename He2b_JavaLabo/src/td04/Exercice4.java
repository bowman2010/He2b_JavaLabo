/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td04;

import FvpLib.Utils;

/**
 *
 * @author bowman
 */
public class Exercice4 {
    
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            int n = Utils.askForInt("Entrez nombre  :");
            if (n%2==0) 
                System.out.println("Nombre pair");
            else 
                System.out.println("Nombre impair");
        }
    }
}
