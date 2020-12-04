/*
    Realiza un programa que rellene un array de 6 filas por 10 columnas con
    números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
    continuación, el programa deberá dar la posición tanto del máximo como del
    mínimo.
*/

public class ArrayBi5 {

    public static void main(String[] args){

		
		
        int[][] num = new int[6][10];
        int maximo = 0;
        int minimo = 1000;
        int filaMax =0;
        int columnaMax =0;
        int filaMin =0;
        int columnaMin =0;

        //introduce los 20 números en el array
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
                num[i][j] = (int) (Math.random()*1000);
                if (num[i][j] > maximo){
                    maximo = num[i][j];
                    filaMax = i; 
                    columnaMax = j;
                }
                if (num[i][j] < minimo){
                    minimo = num[i][j];
                    filaMin = i; 
                    columnaMin = j;
                }
			}
        }

        System.out.println("La posicion del numero minimo es: array["+filaMin+"]["+columnaMin+"] --> "+num[filaMin][columnaMin]);
        System.out.println("La posicion del numero maximo es: array["+filaMax+"]["+columnaMax+"] --> "+num[filaMax][columnaMax]);
        
        
	}
}



