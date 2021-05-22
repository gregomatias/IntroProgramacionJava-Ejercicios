package ejerciciosFor;
import javax.swing.JOptionPane;
//import java.util.Random;


public class Ejercicio4For{
	public static void main(String[] args) {
		//5) Dado el sueldo de n personas, se pide obtener: - la cantidad de desocupados, la
		//cantidad que cobran hasta 500$, la cantidad que cobran entre 500 y 1000, la
		//cantidad entre 1000 y 2000, y los que superan los 2000 - el sueldo máximo y el
		//nombre de la persona de sueldo máximo - total de sueldos pagados
		
		double sueldo,sueldoTotal=0,sueldoMaximo=0;
		int[] cantidades= new int[5] ;
		int qDeIntgresos=0;
		String nombreSueldoMaximo="",nombre;
		boolean primeraVez=true;
		
		qDeIntgresos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ingresos"));

		
		 for (int i=0; i<qDeIntgresos; i++) {
			 
			sueldo= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
			nombre=JOptionPane.showInputDialog("Ingrese su nombre");
		 
		if (sueldo<=0){
			
			//Desocupados
			cantidades[0]=cantidades[0]+ 1;
			
		}else if(sueldo>0 && sueldo<=500){
			
			cantidades[1]=cantidades[1]+ 1;
			sueldoTotal=sueldoTotal+sueldo;
			
		}else if(sueldo>500 && sueldo<=1000){
		
		cantidades[2]=cantidades[2]+ 1;
		sueldoTotal=sueldoTotal+sueldo;
		
		}else if(sueldo>1000 && sueldo<=2000){
			cantidades[3]=cantidades[3]+ 1;
			sueldoTotal=sueldoTotal+sueldo;
		
		}else if(sueldo>2000){
			cantidades[4]=cantidades[4]+ 1;
			sueldoTotal=sueldoTotal+sueldo;
		}

		
		if (primeraVez){
			sueldoMaximo=sueldo;
			nombreSueldoMaximo=nombre;
			primeraVez=false;
		} else if (sueldo>sueldoMaximo) {
			sueldoMaximo=sueldo;
			nombreSueldoMaximo=nombre;
		}
		
		
		 }//fin del For
		 
		 System.out.println("Cantidad de desocupados: "+cantidades[0]);
		 System.out.println("cantidad que cobran hasta 500: "+cantidades[1]);
		 System.out.println("la cantidad que cobran entre 500 y 1000: "+cantidades[2]);
		 System.out.println("cantidad entre 1000 y 2000,: "+cantidades[3]);
		 System.out.println("los que superan los 2000: "+cantidades[4]);
		 System.out.println("Sueldo Maximo "+sueldoMaximo);
		 System.out.println("Nombre de la persona sueldo Maximo: "+nombreSueldoMaximo);
		 System.out.println("Sueldos Totales: "+sueldoTotal);
		
	}//Fin del main
	
}