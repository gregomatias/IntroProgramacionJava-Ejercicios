package ejerciciosWhile;

import javax.swing.JOptionPane;

public class Ejercicio6While {

    public static void main(String[] args) {
        /*
         * 6) En una escuela se debe determinar cuales son los alumnos que tienen
         * aptitudes para formar el nuevo equipo de básquet: Se pide imprimir: a) Total
         * de alumnas relevadas b) cantidad de alumnas que tienen aptitudes para formar
         * el equipo: altura >= 1.73 y peso entre 55 y 83 kg c) porcentaje que
         * representa la cantidad anterior con respecto al total de alumnas relevadas d)
         * total de alumnos varones relevadas e) cantidad de alumnos que tienen
         * aptitudespara formar el equipo: altura >= 1.83 y peso entre 73 y 105 kg f)
         * porcentaje que representa la cantidad anterior con respecto al total de
         * alumnos varones relevados g) total de alumnos relevados Este programa
         * finalizará con la pregunta ¿ingresa otro registro?
         * 
         */

        int totalAlumnasRelevadas = 0, alumnasConAptitudes = 0;
        int totalAlumnosRelevados = 0, alumnosConAptitudes = 0;
        double altura = 0, peso = 0;
        String sexo = "";
        String nuevoIngreso;

        nuevoIngreso = JOptionPane.showInputDialog("Desea Ingresar un registro?");

        while (nuevoIngreso.equalsIgnoreCase("s")) {
            sexo = JOptionPane.showInputDialog("Ingrese el sexo F-Femenino M-Masculino");
            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en cms"));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los Kgms"));

            if (sexo.equalsIgnoreCase("f")) {// Poblacion Femenina
                totalAlumnasRelevadas++;
                if (altura >= 173 && peso >= 55 && peso <= 83) {
                    alumnasConAptitudes++;
                }

            } else {// Poblacion Masculina
                totalAlumnosRelevados++;
                if (altura >= 183 && peso >= 73 && peso <= 105) {
                    alumnosConAptitudes++;

                }

            }

            nuevoIngreso = JOptionPane.showInputDialog("Desea Ingresar otro registro?");
        } // Fin del While
        System.out.println("a-Total de alumnas relevadas: " + totalAlumnasRelevadas);
        System.out.println("b-Total de alumnas con aptitudes: " + alumnasConAptitudes);
        System.out.println(
                "c-Porcentaje de alumnas con aptitudes: " + (alumnasConAptitudes / totalAlumnasRelevadas * 100));
        System.out.println("d-Total de alumnos relevados: " + totalAlumnosRelevados);
        System.out.println("e-Total de alumnos con aptitudes: " + alumnosConAptitudes);
        System.out.println(
                "f-Porcentaje de alumnos con aptitudes: " + (alumnosConAptitudes / totalAlumnosRelevados * 100));
        System.out.println("g-Total Alumnos General: " + (totalAlumnasRelevadas + totalAlumnosRelevados));

    }// Fin del void main

}
