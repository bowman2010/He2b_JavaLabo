/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td04;

import FvpLib.Utils;

/**
 *
 * Positifs, négatifs et nuls
 * Écrire un programme qui demande à l’utilisateur le nombre n de valeurs qu’il veut
 * introduire, lit ces n valeurs au clavier et affiche le nombres de valeurs positives, le nombre
 * de valeurs négatives et le nombre de valeurs nulles.
* 
 * @author bowman
 */
public class Exercice6 {
    
    public static void main(String[] args) {
        int nb_positifs = 0;
        int nb_negatifs = 0;
        int nb_nuls = 0;
        
        int nbval = Utils.askForInt("Nombre de valeurs a entrer : ");
        for (int i=1; i<=nbval; i++) {
            double nombre = Utils.askForDouble("Entrez nombre #"+i+" : ");
            if (nombre>0) nb_positifs++;
            else if (nombre<0) nb_negatifs++;
            else nb_nuls++;
        }
        
        System.out.println("positifs : "+nb_positifs);
        System.out.println("negatifs : "+nb_negatifs);
        System.out.println("nuls     : "+nb_nuls);
    }
    
}
