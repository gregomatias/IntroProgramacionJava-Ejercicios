package ejerciciosFor;
//import javax.swing.JOptionPane;
import java.util.Random;

public class Ejercicios2For{


	public static void main (String [] args){

//3) Generar 100 números al azar y verificar la cantidad que salieron entre 0 y 25, la
//cantidad entre 26 y 50, la cantidad entre 51 y 75 y la cantidad entre 76 y 100


		int countCeroVeintiCinco,countVeintiSeisCincuenta,countCincuentayUnoSetentayCinco,countSetentaYSeisCien,numeroRandom,qDeNumerosAleatorios;
		countCeroVeintiCinco=0;
		countVeintiSeisCincuenta=0;
		countCincuentayUnoSetentayCinco=0;
		countSetentaYSeisCien=0;
		Random rnd = new Random();
		qDeNumerosAleatorios=100;
		

		for (int i=0;i<qDeNumerosAleatorios;i++){
			numeroRandom = rnd.nextInt(101); //Cero a 100
			
			if (numeroRandom>=0&& numeroRandom<26){
				countCeroVeintiCinco++;
				
			}else if (numeroRandom>25&& numeroRandom<51){
				countVeintiSeisCincuenta++;
			
			}else if  (numeroRandom>50&& numeroRandom<76) {
				countCincuentayUnoSetentayCinco++;
			}else {
				countSetentaYSeisCien++;
			}
		
		}//Fin del For
		
		System.out.println("Cantidad que salieron entre 0 y 25: "+countCeroVeintiCinco );
		System.out.println("Cantidad que salieron entre 26 y 50: "+countVeintiSeisCincuenta );
		System.out.println("Cantidad que salieron entre 51 y 75: "+countCincuentayUnoSetentayCinco );
		System.out.println("Cantidad que salieron entre 76 y 100: "+countSetentaYSeisCien );



	}

}