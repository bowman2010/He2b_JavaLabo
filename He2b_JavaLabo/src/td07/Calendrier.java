/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td07;

import FvpLib.Utils;

/**
 *
 * @author g57411
 */
public class Calendrier {
    public static String nomDuMois(int m) {
        String[] monthNames = {
            "janvier",
            "fevrier",
            "mars",
            "avril",
            "mai",
            "juin",
            "juillet",
            "aout",
            "septembre",
            "octobre",
            "novembre",
            "decembre"
        };
        if (m<1 || m>12) return "";
        return (monthNames[m-1]);
    }
    
    public static void afficherTitre(int mois, int annee) {
        System.out.println("===========================");
        System.out.println("      "+nomDuMois(mois)+" "+annee);
        System.out.println("===========================");
    }

    public static void afficherEntete() {
        System.out.println("Lu  Ma  Me  Je  Ve  Sa  Di");
    }
    
    public static void afficherMois(int decalage, int nombreJours) {
        int pos;
        int day = 1;
        
        for (pos=1; pos <= decalage; pos++) {
            System.out.print("    ");
        }
        while (pos <= 7) {
            System.out.printf("%-4d", day);
            day ++; pos++;
        }
        
        while (day <= nombreJours) {
            if (pos>7) {
                    System.out.println();
                    pos = 1;
            }
            System.out.printf("%-4d", day);
            day ++; pos++;
            
        }
        System.out.println();
    }
    
    public static boolean estBisextile(int annee) {
        if (annee%400 == 0) return true;
        return ( (annee%4 == 0) && (annee%100 != 0) );
    }
    
    public static int nombreJours(int mois, int annee) {
        int[] nbjrs = { 
            31, // Janvier
            28, // Fevrier
            31, // Mars
            30, // Avril
            31, // Mai
            30, // Juin
            31, // Juillet
            31, // Aout,
            30, // Septembre
            31, // Octobre
            30, // Novembre
            31, // Decembre 
        };
        
        if (estBisextile(annee)) nbjrs[1] = 29; 
        return nbjrs[mois];
    }

    public static int numeroJour(int jour, int mois, int annee) {
        int J = annee/100;
        int K = annee%100;
        int h = (jour + ((mois+1)*13)/5) + K + K/4 + J/4 + 5*J + 5;
        return h;
    }
    
    public static boolean valid_month (int month) {
        return ((month>=1) && (month<=12));
    }

    
    
    public static void main(String[] args) {
        boolean valid=false;
        int year;
        int month;

        while (valid==false) {
            year  = Utils.askForInt("Annee  : ");
            month = Utils.askForInt("Month  : ");
                
            if   (valid_month(month)){
                    afficherTitre(month, year);
                    afficherEntete();
                    afficherMois(1, 28);
                }
            }
        } 
    
    
}

