/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guetto.project;

import java.util.Scanner;

/**
 *
 * @author Sergio Diaz Real
 */
public class SergioDiazReal {
    public static void main(String[] args){
        System.out.println("Introduce una letra y la paso a mayuscula");
        Scanner entrada = new Scanner(System.in);
        String letra;
        letra = entrada.nextLine().toUpperCase();
        System.out.println("Has metido la "+letra);
        
    }
}
