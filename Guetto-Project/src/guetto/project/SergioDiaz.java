/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guetto.project;

import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class SergioDiaz {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String letra;
        System.out.println("Mete una letra y te la paso a mayusculas");
        letra = entrada.nextLine().toUpperCase();
        System.out.println("La letra en mayúsculas es: "+letra);
        
    }
}
