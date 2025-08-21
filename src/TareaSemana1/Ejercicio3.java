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
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double y = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double z = scanner.nextDouble();
        System.out.print("El promedio es " + average(x, y, z)+"\n" );
    }

  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
        }
}
