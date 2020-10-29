/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td01;

/**
 *
 * @author bowman
 */
public class Exercice02 {
    
    public static void drawSquare(int n) {
    String s="*";
    s=s.repeat(n);
    for (int i=0; i<n; i++) {
            System.out.println(s);
    }
}
    
    public static void main(String[] args) {
        drawSquare(5);
    }
    
}
