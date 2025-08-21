/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2Sesion2EjemploMatch;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejemplo2 {
   public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("\n Ingrese un numero para calcular la raiz cuadrada:");
        double numero = scanner.nextDouble();
        double raizcuadrada = Math.sqrt(numero);
        System.out.println("la raiz cuadrada de" +numero+"es" + raizcuadrada);
        scanner.close();
     }   
}
