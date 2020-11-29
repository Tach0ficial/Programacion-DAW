/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 * 
 * @author Carlos Hidalgo Risco
 */

import java.util.Scanner;
public class Array3 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numero = new int [10];

        for (int i = 0; i < numero.length; i++) {
            
            System.out.print("Dime un numero: ");
            int num = s.nextInt();
            numero[i] = num; 
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println();
            System.out.print(numero[i]);
        }
        
	}
}
