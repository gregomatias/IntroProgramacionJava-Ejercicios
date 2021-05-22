package ejerciciosFor;
import javax.swing.JOptionPane;
import java.util.Random;

public class Ejercicios1For{


	public static void main (String [] args){

//2) Generar al azar 20 números en el intervalo (0-100), imprimir la cantidad de ceros
//que salieron

		int count,numeroRandom,qDeNumerosAleatorios;
		Random rnd = new Random();
		count=0;
		qDeNumerosAleatorios=100;
		

		for (int i=0;i<qDeNumerosAleatorios;i++){
			numeroRandom = rnd.nextInt(101); //Cero a 100
			
			if (numeroRandom==0){
				count=count+1;
				
			}
		
		}//Fin del For
		
		JOptionPane.showMessageDialog(null,"Hubo "+ count +" ceros entre "+ qDeNumerosAleatorios + " numeros aleatorios." );



	}

}