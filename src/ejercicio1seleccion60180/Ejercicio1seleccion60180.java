/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion60180;

import java.util.Scanner;

/**
 *
 * @author 60180
 */
public class Ejercicio1seleccion60180 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Elabore un programa que lea tres números enteros e imprima el mayor de ellos
        
        Scanner sc = new Scanner(System.in);    
        int Numero1, Numero2, Numero3;
        System.out.println("Introdusca primer número: ");
        Numero1 = sc.nextInt();
        System.out.println("Introdusca segundo número: ");
        Numero2 = sc.nextInt();
        System.out.println("Introdusca tercer número: ");
        Numero3 = sc.nextInt();
        if (Numero1 > Numero2) {
            if(Numero1 > Numero3) {
                System.out.println("El numero mayor es: " + Numero1);
            } else { 
                System.out.println("El numero mayor es: " + Numero3);
            }
        } else if (Numero2 > Numero3) {
           System.out.println("El numero mayor es: " + Numero2); 
        } else {
           System.out.println("El numero mayor es: " + Numero3); 
        }
        
    }
    
}
