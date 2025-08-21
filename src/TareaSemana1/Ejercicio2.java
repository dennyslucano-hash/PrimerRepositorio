package TareaSemana1;


import *;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Ejercicio2 {
    public static void main(String[] args) { // Se define el método principal.
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner.

        System.out.println("Ingrese la temperatura en grados Celsius:"); // Se solicita la entrada al usuario.
        double celsius = scanner.nextDouble(); // Se lee la temperatura en Celsius.

        double fahrenheit = (celsius * (9.0 / 5.0)) + 32; // Se aplica la fórmula de conversión.

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit); // Se muestra el resultado.

        scanner.close(); // Se cierra el objeto Scanner.
   }     
}
