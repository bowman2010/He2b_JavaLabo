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
public class Exercice5 {

    public static void main(String[] args) {
        double somme = 0;
        int nbc = Utils.askForInt("Nombre de valeurs a entrer : ");
        for (int n=1; n<=nbc; n++) {
            double dd = Utils.askForDouble("Entrez nombre "+n+" : ");
            somme+=dd;
        }

        System.out.println("Somme   = "+somme);
        System.out.println("Moyenne = "+somme/nbc);

    }
}
