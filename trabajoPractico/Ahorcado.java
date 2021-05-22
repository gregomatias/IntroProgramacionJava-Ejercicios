package trabajoPractico;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ahorcado {

	public static void main(String[] args) {

		int numeroRandom, largo;
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
		String[] caracteresPalabraBuscada = { " _", " _", " _", " _", " _", " _", " _", " _", " _", " _" };
		String[] categorias = { "Autos", "Frutas", "Paises", "Cosas" };
		Random rnd = new Random();
		numeroRandom = rnd.nextInt(9); // Cero a 8
		palabraBuscada = "";
		palabra = "";
		incognita = "";
		boolean finDelJuego = false, ganoElJuego = false;
		int chances = 8;
		// Elijo la categoria
		int idCategoria = JOptionPane.showOptionDialog(null, "Ingrese una categoria:", "Click a button",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, categorias, categorias[0]);

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

		largo = palabraBuscada.length();

		// Le agrego guiones para mostrar la cantidad de letras que tiene la incognita
		for (int i = 0; i < largo; i++) {
			incognita = incognita + " _";
		}

		letra = JOptionPane.showInputDialog("La palabra es: " + incognita + " Ingresa una Letra");

		// Hay 7 posibilidades para resolver la palabra
		while (finDelJuego == false && chances > 0) {
			incognita = "";

			// Rrecorro la palabra en busca de la letra tipeada por el usuario
			for (int i = 0; i < largo; i++) {

				if (letra.equalsIgnoreCase(palabraBuscada.substring(i, i + 1))) {

					caracteresPalabraBuscada[i] = letra;

				}
				incognita = incognita + caracteresPalabraBuscada[i];

			} // Fin del For que recorre la palabra

			if (palabraBuscada.equalsIgnoreCase(incognita)) { // Si las letras ingresadas coinciden con la palabra
				// buscada
				finDelJuego = true;
				ganoElJuego = true;

			} else {// La palabra no se acerto letra por letra

				int adivinoPregunta = JOptionPane.showOptionDialog(null,
						"La palabra es: " + incognita + " Adivinaste la palabra?", "Quit?", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, null, null);

				if (adivinoPregunta == 1 && chances > 1) {// Si dice que NO adivino la palabra

					letra = JOptionPane.showInputDialog(incognita + " Ingresa una Letra");

				} else {// Si dice que SI adivino la palabra

					palabra = JOptionPane.showInputDialog("Escriba la palabra que adivino");

					if (palabraBuscada.equalsIgnoreCase(palabra)) {// Valido que la palabra elegida sea igual a la que
																	// intenta
						// adivinar
						finDelJuego = true;
						ganoElJuego = true;

					} else if (chances > 1) {// Non coincide la palbra adivinada

						letra = JOptionPane
								.showInputDialog("La palabra no es correcta. \n" + incognita + " Ingresa una Letra");

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
		}

	}// Fin del void Main

}// Fin de la clase
