
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Ejercicio1 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa el radio: ");
  double radio = scanner.nextDouble();
  double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
        scanner.close();
    }
            
}
