/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guetto.project;
import java.util.Scanner;

/**
 *
 * @author Andrés
 */
public class AndresMoreno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int um, centenas, decenas, unidades, num;
        System.out.println("Por favor, introduzca un número de 4 cifras:");
        num=entrada.nextInt();
        um=num/1000;
        centenas=num%1000/100;
        decenas=(num%1000)%100/10;
        unidades=num%1000%100%10/1;
        System.out.println("La primera cifra es: " + um);
        System.out.println("La segunda cifra es: " + centenas);
        System.out.println("La tercera cifra es: " + decenas);
        System.out.println("La cuarta cifra es: " + unidades);
        System.out.println("Modifico el ejercicio de Andres. Manuel");
    }
}
