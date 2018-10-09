/*
 * TEMA 2. RECURSIVIDAD
 * Ejercicio 2: Realice un programa que transforme un número en base 10 a binario
 * Fecha: 02/10/2018
 * Alumno: Marco Alejandro Cupul Hau
 */

package ejercicio2_conversion;

import java.util.Scanner;
/**
 *
 * @author Alejandro Cupul
 */
public class Ejercicio2_Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Conversion conversion1 = new Conversion();
        System.out.print("Introduce un número de base 10 (Positivo): ");
        conversion1.Decimal=Teclado.nextInt();
        if (conversion1.Decimal<0)
            System.out.println("ERROR-> Ingrese un decimal positivo");
        else {
            conversion1.Binario=conversion1.binario(conversion1.Decimal);
            System.out.println("El binario es: "+conversion1.Binario);
        }
            
    }
    
}
