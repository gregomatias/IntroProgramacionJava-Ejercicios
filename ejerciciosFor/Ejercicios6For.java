package ejerciciosFor;
import javax.swing.JOptionPane;
//import java.util.Random;


public class Ejercicios6For {
	public static void main (String[] args){
		
		/*Dados n números enteros calcular el rango. Rango: es la diferencia entre el
		número mayor y el menor */
		
		
		int min=0,qDeIntgresos=0,max=0,numero=0,rango=0;
		boolean primeraVez=true;
		qDeIntgresos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ingresos"));
		
		for (int i=0;i<qDeIntgresos;i++){
			numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			if (primeraVez){
				min=numero;
				max=numero;
				primeraVez=false;
			}
			if (numero<min){
				min=numero;
			}//fin del max
			if (numero>max){
				max=numero;
			}//fin del min
		}//fin del for
		rango=max-min;
		System.out.println("Rango: "+rango);
		
	}//Fin del mail
	
}