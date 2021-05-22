package ejerciciosWhile;
import javax.swing.JOptionPane;
public class Ejercicio1While{
	
	public static void main(String[] args){

/*
Se tiene la nota de un grupo de estudiantes. Se pide determinar cuantos aprobaron
(nota> 4), de estos cuantos deben presentar tp (nota >= 7) y cuantos rinden escrito (nota
<7) y cuantos desaprobaron
Para finalizar se ingresar una nota negativa
*/
	double nota=0;
	int abrobados=0,presentanTp=0,rindenEscrito=0,desaprobados=0;
	do {
		nota= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota:"));
		
		
		if (nota>4){
			abrobados=abrobados+1;
		} else if (nota>=0){
			desaprobados=desaprobados+1;
		}
		if (nota>=7){
			presentanTp=presentanTp+1;
		}
		if (nota>0&&nota<7){
			rindenEscrito=rindenEscrito+1;
		}
		
		System.out.println("Nota: "+nota);//imprime para control
	}while(nota>=0);

	System.out.println("Aprobados: "+abrobados);
	System.out.println("Desaprobados: "+desaprobados);
	System.out.println("Presentan TP: "+presentanTp);
	System.out.println("Rinden Escrito: "+rindenEscrito);

	}//Fin del Main
}