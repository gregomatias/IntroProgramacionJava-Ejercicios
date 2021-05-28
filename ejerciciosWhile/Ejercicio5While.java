package ejerciciosWhile;

import javax.swing.JOptionPane;

public class Ejercicio5While {

    public static void main(String[] args) {
        /*
        	5) En una universidad se hará un relevamiento entre una cantidad no determinada de
			alumnos.
			Se desea obtener
			a) porcentaje de la población femenina
			b) porcentaje población masculina
			c) mejor promedio(Nota) cuatrimestral de la población femenina
			d) mejor promedio(Nota) cuatrimestral de la población masculina
			Los datos que se ingresan son: sexo, promedio, matricula. Para indicar el fin se ingresa un 0
            Camino Feliz
        */

        String sexo;
        int matricula,cuentaFemenino=0,cuentaMasculino=0,i=0;
        double promedioFemenino=0,promedioMasculino=0,nota,totalNotasMasculina=0,totalNotasFemenina=0;

        
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la matricula"));
        

        while (matricula!=0) {
        
            sexo=JOptionPane.showInputDialog("Ingrese M para Masculino F-Para Femenino");
            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota"));
            
            if(sexo.equalsIgnoreCase("m")){
                cuentaMasculino++;
                totalNotasMasculina=totalNotasMasculina+nota;
                
                if(i==0){

                }else if (nota>promedioMasculino) {
                    promedioMasculino=nota;

                }//Fin If mejor nota masculina


            } else{
                cuentaFemenino++;
                totalNotasFemenina=totalNotasFemenina+nota;  
                
                if(i==0){

                }else if (nota>promedioFemenino) {
                    promedioMasculino=nota;

                }



            }

            matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Matricula"));

        }//fin del while
        System.out.println("Mejor promedio Femenino: "+promedioFemenino);
        System.out.println("Mejor promedio Masculino: "+promedioMasculino);
        System.out.println("Porcentaje Femenino: "+((cuentaFemenino/(cuentaMasculino+cuentaFemenino))*100));
        System.out.println("Porcentaje Masculino: "+((cuentaMasculino/(cuentaMasculino+cuentaFemenino))*100));




        
    }
    
}
