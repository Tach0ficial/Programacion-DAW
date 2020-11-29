
/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * @author Carlos Hidalgo Risco
 */

import java.util.Scanner;
public class Array5 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numero = new int [10];
        // pide los datos
        for (int i = 0; i < 10; i++) {
            
            System.out.print("Dime un numero: ");
            int num = s.nextInt();
            numero[i] = num; 
        }
        // ordenar el array de mayor a menor
        for(int i=0;i<(numero.length-1);i++){
            for(int j=i+1;j<numero.length;j++){
                if(numero[i]>numero[j]){
                    //Intercambiamos valores
                    int variableauxiliar=numero[i];
                    numero[i]=numero[j];
                    numero[j]=variableauxiliar;
                }
            }
        }
        // imprime el resultado
        System.out.print("Minimo-->");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]+" ");
        }
        System.out.print("<--Maximo");
        
	}
}
