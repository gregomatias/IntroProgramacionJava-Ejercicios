package arrayBiDimensional;
import java.util.Random;

public class ArrayBiDimensional{
	
	public static void main(String[] args) {
		
		
				Random rnd = new Random();
		
		//Aleatorios de 1-10 de 3 filas x 4 columnas , imprimir primera fila y columna
		
		int[][] numeros= new int[3][4] ;
		
		for ( int i=0; i<3; i++ ){
		
		
			for ( int j=0;j<4; j++) {
				numeros[i][j]= rnd.nextInt(10)+1;
				
			}
		
		}
		
		for ( int i = 0; i<4; i++ ) {
			System.out.println("Primera Fila: " +numeros[0][i]);
			
		}
		
		for ( int i = 0; i<3; i++ ) {
			System.out.println("Primera columna: " + numeros[i][0]);
			
		}
		




	}
}