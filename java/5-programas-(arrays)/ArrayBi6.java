/*
    Modifica el programa anterior de tal forma que no se repita ningún número en
    el array.
*/

public class ArrayBi6 {

    public static void main(String[] args){

        int[][] num = new int[6][10];
        int maximo = 0;
        int minimo = 1000;
        int filaMax =0;
        int columnaMax =0;
        int filaMin =0;
        int columnaMin =0;
        boolean repetido; 
        

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
                do{
                    num[i][j] = (int) (Math.random()*1000);
                    repetido = false;
                    //comprobacion si se repiten
                    for (int k = 0; k < 6; k++) {
                        for (int x = 0; x < 10; x++) {
                            if (num[i][j] == num[k][x]) {
                                repetido = true;
                            }
                        }
                    }
                }while(repetido);
                
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
                System.out.println(num[i][j]);
			}
        }

        System.out.println("La posicion del numero minimo es: array["+filaMin+"]["+columnaMin+"] --> "+num[filaMin][columnaMin]);
        System.out.println("La posicion del numero maximo es: array["+filaMax+"]["+columnaMax+"] --> "+num[filaMax][columnaMax]);
        
        
	}
}



