/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author monic
 */
public class Name {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Escribe tu nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Mi nombre es: " + nombre);
                
                
    }
    
}
