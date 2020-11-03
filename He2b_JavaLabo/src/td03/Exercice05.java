/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td03;

import FvpLib.Utils;

/**
 *
 * @author bowman
 */
public class Exercice05 {
    
    public static void main(String[] args) {
        int a = Utils.askForInt("Entrez nombre a : ");
        int b = Utils.askForInt("Entrez nombre b : ");
        int c = Utils.askForInt("Entrez nombre c : ");
        
        System.out.println("a%2 == 0 : "+(a%2 == 0));
        System.out.println("a%2 == 1 : "+(a%2 == 1));
        System.out.println("a%b == 0 : "+(a%b == 0));
        System.out.println("a < b : "+(a < b));
        System.out.println("(a <= b) && (a <= c) : "+((a <= b) && (a <= c)));
        System.out.println("(a < b && b < c) || (a > b && b > c) : "+
            ((a < b && b < c) || (a > b && b > c)));
        
    }
    
}
