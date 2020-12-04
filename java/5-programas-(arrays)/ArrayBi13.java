package arrays;
/**
	Realiza un programa que calcule la estatura media, m�nima y m�xima en
	cent�metros de personas de diferentes pa�ses. El array que contiene los
	nombres de los paises es el siguiente: pais = {�Espa�a�, �Rusia�, �Jap�n�,
	�Australia�}.
	Los datos sobre las estaturas se deben simular mediante un
	array de 4 filas por 10 columnas con n�meros aleatorios generados al azar entre
	140 y 210.
	Los decimales de la media se pueden despreciar. Los nombres de
	los pa�ses se deben mostrar utilizando el array de pa�ses (no se pueden escribir
	directamente).
	Arrays 134
	
	Ejemplo:
	MED MIN MAX
	Espa�a: 178 165 148 185 155 141 165 149 155 201 | 164 141 201
	Rusia: 179 189 208 167 186 174 152 192 173 179 | 179 152 179
	Jap�n: 173 182 168 170 181 197 146 168 166 177 | 172 146 177
	Australia: 172 170 187 186 197 143 190 199 187 191 | 182 143 191
	@author Carlos Hidalgo Risco
*/

public class ArrayBi13 {

public static void main(String[] args){

		//inicializamos las variables que vamos a usar
	    int[][] num = new int[4][10];
	    String[] paises = {"Espa�a","Rusia","Jap�n","Australia"};
	    int media = 0;
	    int min = 210;
	    int max = 140;
	    
	    for (int i = 0; i < 4; i++) {
	    	System.out.print(paises[i]+": ");
			for (int j = 0; j < 10; j++) {
				num[i][j] = (int) (Math.random()*(210-140+1)+140);
				System.out.print(num[i][j]+" ");
				media += num[i][j];
				if(num[i][j] > max){
					max = num[i][j];
				}
				if(num[i][j] < min){
					min = num[i][j];
				}
			}
			//media
			System.out.print(" | "+media/10);
			//min
			System.out.print(" "+min);
			//max
			System.out.print(" "+max);
			//salto de linea
			System.out.println();
			//ponemos los terminos de media max y min como los inicializamos.
			media=0;
			min = 210;
			max = 140;
		}
	}
}

