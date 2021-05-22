package ejerciciosFor;
import javax.swing.JOptionPane;
//import java.util.Random;

public class Ejercicios3For{


	public static void main (String [] args){

//4) Dados n números enteros, calcular el menor de ellos


		int numeroIngresado,numeroMenor,qDeNumerosAleatorios;
		boolean primeraVez=true;
		numeroIngresado=9;
		numeroMenor=0;
		qDeNumerosAleatorios=2;
		

		for (int i=0;i<qDeNumerosAleatorios;i++){
			
			numeroIngresado=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
			
			if (primeraVez){//El numero menor es el ingresado, solo la primera vez
				numeroMenor=numeroIngresado;
				 primeraVez=false;
			}else {
				if (numeroIngresado<numeroMenor){
				
					numeroMenor=numeroIngresado;
				
				}
			
			}
			

		
		}//Fin del For
		
		System.out.println("El numero menor es: "+ numeroMenor );



	}

}