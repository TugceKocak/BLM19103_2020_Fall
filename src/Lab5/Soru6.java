/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Tugce Kocak
 */
public class Soru6 {
    public static void main(String[] args) {
         for (int i = 1; i < 6; i++) {
            for (int j = 1; j <10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
         
         // ucgen sekli
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
            
}
