package ejerciciosWhile;

import javax.swing.JOptionPane;

public class Ejercicio2While {
     public static void main(String[] args) {
         String puntaje;
         int ganados=0,empatados=0,perdidos=0;

         puntaje= JOptionPane.showInputDialog("Ingrese el puntaje");

         while (!puntaje.equals("*")) {

            if (puntaje.equalsIgnoreCase("g")){
                ganados++;

            }else if (puntaje.equalsIgnoreCase("e")){
                empatados++;


            } else {
                perdidos++;
            }
            

            puntaje= JOptionPane.showInputDialog("Ingrese el puntaje");

         }

         System.out.println("ganados: "+ganados );
         System.out.println("empatados: "+empatados);
         System.out.println("perdidos: "+perdidos );



        
    }


    
}
