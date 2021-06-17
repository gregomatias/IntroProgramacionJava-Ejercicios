package trabajoPractico;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ahorcado {

	public static void main(String[] args) {

		int numeroRandom;
		String palabraBuscada, incognita, palabra;
		String[] autos = { "volvo", "bmw", "ford", "mazda", "land Rover", "peugeot", "taunus", "saab", "mclaren",
				"ranchero" };
		String[] frutas = { "pera", "banana", "papaya", "guanabana", "mamon", "tomate", "frutilla", "kiwi", "melon",
				"sandia" };
		String[] paises = { "argentina", "holanda", "colombia", "australia", "rusia", "francia", "italia", "peru",
				"japon", "chile" };
		String[] cosas = { "mesa", "pared", "jarra", "silla", "heladera", "pistola", "caja", "piedra", "montura",
				"barco" };
		String letra;
		
		String[] categorias = { "Autos", "Frutas", "Países", "Cosas" };
		String[] dificultades = { "Piece of Cake", "Lest's Rock", "Come Get Some", "Damn Im Good" };
		String[] caracteresPalabraBuscada = { "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" };
		Random rnd = new Random();
		numeroRandom = rnd.nextInt(9); // Cero a 8
		palabraBuscada = "";
		palabra = "";
		incognita = "";
		String fraseEnMensajeCambiante="Comenzo el juego! ";
		boolean finDelJuego = false, ganoElJuego = false;
		int chances = 0;

		// Elijo dificultad
		int idDificultad = JOptionPane.showOptionDialog(null, "Ingrese el nivel de dificultad:", "Click a button",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, dificultades, dificultades[0]);


		// Elijo la categoria
		int idCategoria = JOptionPane.showOptionDialog(null, "Ingrese una categoria:", "Click a button",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, categorias, categorias[0]);

		//El nivel de dificultad se basa en reducir las chances
		switch (idDificultad) {
			case 0:
			chances = 9;
				break;
			case 1:
			chances = 7;
				break;
			case 2:
			chances = 5;
				break;
			case 3:
			chances = 3;
				break;

		}



		//Segun la categoria elegida, busca una palabra que sera la incognita
		switch (idCategoria) {
			case 0:
				palabraBuscada = autos[numeroRandom];
				break;
			case 1:
				palabraBuscada = frutas[numeroRandom];
				break;
			case 2:
				palabraBuscada = paises[numeroRandom];
				break;
			case 3:
				palabraBuscada = cosas[numeroRandom];
				break;

		}

		

		// Le agrego guiones para mostrar la cantidad de letras que tiene la incognita
		for (int i = 0; i < palabraBuscada.length(); i++) {
			incognita = incognita + " _";
		}

		
		// While de chances de adivinar la palabra
		while (finDelJuego == false && chances > 0) {
			

			letra = JOptionPane.showInputDialog(fraseEnMensajeCambiante+"Tenes "+chances+" chances \n"+
				"La incognita es: " + incognita + "\n Por favor, ingresa una Letra");
			incognita = "";
			fraseEnMensajeCambiante="Animo! ";



			//Recorro la palabra 
			incognita =recorreLaIncognitaBuscandoLetra(palabraBuscada,letra,caracteresPalabraBuscada);



			if (palabraBuscada.equalsIgnoreCase(incognita)) { // Si las letras ingresadas coinciden con la palabra
				// buscada
				finDelJuego = true;
				ganoElJuego = true;

			} else {// La palabra no se acerto letra por letra

				//Entonces pregunto:
				int adivinoPregunta = JOptionPane.showOptionDialog(null,
						"La incognita es: " + incognita + "\nAdivinaste la palabra?", "Quit?", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, null, null);

				if (adivinoPregunta == 1) {// Si dice que NO adivino la palabra
					//NO Hace nada, sigue el juego, o termina.

				} else {// Si dice que SI adivino la palabra

					palabra = JOptionPane.showInputDialog("Escriba la palabra que adivino");

					if (palabraBuscada.equalsIgnoreCase(palabra)) {// Valido que la palabra elegida sea igual a la que
						// intenta adivinar

						finDelJuego = true;
						ganoElJuego = true;

					} else {// Non coincide la palbra que pretendia adivinar

						JOptionPane.showMessageDialog(null,"No es la palabra correcta");

					}

				} // fin del if de adivino la palabra

			} // Fin del else de acierto letra por letra

			chances--;// Cada bucle es una chance de adivinar o ganar el juego

		} // Fin del while

		if (ganoElJuego == false) {
			JOptionPane.showMessageDialog(null,
					"Lo siento, perdiste el juego.\n" + "La palabra era: " + palabraBuscada);
		} else {
			JOptionPane.showMessageDialog(null, "Eureca!!! Ganaste el Juego!!!");
			//Puntaje:
			JOptionPane.showMessageDialog(null, "El puntaje obtenido es: "+
			devuelveUnPuntajeAlGanador(palabraBuscada, caracteresPalabraBuscada,idDificultad) );

		}

	}// Fin del void Main

/*#################################################FUNCIONES###########################################################*/


	//Funcion que recorre la palabra en busca de coincidencias con la letra
	public static String recorreLaIncognitaBuscandoLetra(String palabraBuscada,String letra,String caracteresPalabraBuscada[]){

		String incognita="";
		

					// Recorro la palabra en busca de la letra tipeada por el usuario
					for (int i = 0; i < palabraBuscada.length(); i++) {

						if (letra.equalsIgnoreCase(palabraBuscada.substring(i, i + 1))) {
		
							caracteresPalabraBuscada[i] = letra;
		
						}
						incognita = incognita +" "+ caracteresPalabraBuscada[i];
		
					} // Fin del For que recorre la palabra
		return incognita;


	}//Fin de funcion recorre en busca de letra

	//Sistema de puntuacion, Se basa en calcular los guiones/palabra multiplicado por el nivel de dificultad
	public static double devuelveUnPuntajeAlGanador(String palabraBuscada,String caracteresPalabraBuscada[],int idDificultad){

		double cuentaGuiones=0;
		double puntaje=0;
		

					// Recorro la palabra en busca de la letra tipeada por el usuario
					for (int i = 0; i < palabraBuscada.length(); i++) {


						if (caracteresPalabraBuscada[i].equalsIgnoreCase("_")) {
		
							 cuentaGuiones++;
		
						}//fin del if
		
					} // Fin del For que recorre la palabra

		if (cuentaGuiones>0){

		puntaje = (cuentaGuiones/palabraBuscada.length())*100*(idDificultad+1);
		
		}else{
			puntaje=10*(idDificultad+1);
		}
		
		return puntaje;


	}//Fin Sistema de puntuacion

}// Fin de la clase
