package trabajoPractico;
import java.util.Random;
import javax.swing.JOptionPane;

public class Ahorcado {

	public static void main(String[] args) {

		int numeroRandom,largo;
		String elegido,incognita,palabra;
		String []autos= {"volvo", "bmw", "ford", "mazda","land Rober","peugeot","taunus","saab","mc laren", "ranchero"};
		String []frutas= {"pera", "banana", "papaya", "guanabana","mamon","tomate","frutilla","kiwi","melon", "sandia"};
		String []paises= {"argentina", "holanda", "colombia", "australia","rusia","francia","italia","peru","japon", "chile"};
		String []cosas= {"mesa", "pared", "jarra", "silla","heladera","pistola","caja","piedra","montura", "barco"};
		String letra;
		String []incognitaArray={" _"," _"," _"," _"," _"," _"," _"," _"," _"," _"};
		 String[] categorias = {"Autos", "Frutas", "Paises", "Cosas"};
		 Random rnd = new Random();
		 numeroRandom = rnd.nextInt(9); //Cero a 8
		elegido="";
		incognita="";
		//Elijo la categoria
		int idCategoria = JOptionPane.showOptionDialog(null, "Ingrese una categoria:",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, categorias, categorias[0]);

		
		switch(idCategoria){
			case 0:
			elegido=autos[numeroRandom];
			break;
			case 1:
			elegido=frutas[numeroRandom];
			break;
			case 2:
			elegido=paises[numeroRandom];
			break;
			case 3:
			elegido=cosas[numeroRandom];
			break;
			
		
		}
		
		
		
		largo=elegido.length();
	
	//Le agrego guiones para mostrar la cantidad de letras que tiene la incognita
		for(int i=0;i<largo;i++){
			incognita=incognita+" _";
			}
		
		letra=JOptionPane.showInputDialog("La palabra es: "+incognita+" Ingresa una Letra");
		
		
		//Hay 7 posibilidades para resolver la  palabra
		for (int e=0;e<6;e++){
		incognita="";	
		
		//Rrecorro la palabra en busca de la letra tipeada por el usuario
		for(int i=0;i<largo;i++){
			
			if (letra.equalsIgnoreCase(elegido.substring(i,i+1))){
			
			incognitaArray[i]=letra;

			}
			incognita=incognita+incognitaArray[i];
		
		}
		int adivinoPregunta = JOptionPane.showOptionDialog(null, 
		"La palabra es: "+incognita+" Adivinaste la palabra?", "Quit?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		
		if(adivinoPregunta==1 && e<5 ){//Si dice que NO adivino la palabra y todavia tiene chances 
		
		letra=JOptionPane.showInputDialog(incognita +" Ingresa una Letra");
		
		}else{//Si dice que SI adivino la palabra 
		
		palabra=JOptionPane.showInputDialog("Escriba la palabra que adivino");
		
		if (elegido.equalsIgnoreCase(palabra)){//Valido que la palbra elegida sea igual a la que intenta adivinar
			JOptionPane.showMessageDialog(null, "Eureca!!! Ganaste el Juego!!!");
			break;
			
		} else if(e<5){//Non coincide la palbra adivinada
		
			letra=JOptionPane.showInputDialog("La palabra no es correcta. \n"+incognita+" Ingresa una Letra");
			
		} else {//No adivino la palabra y no tiene chances
		
			JOptionPane.showMessageDialog(null, "Lo siento, perdiste el juego.\n"+ "La palabra era: " + elegido);
		}
		
		}
		
		
		
		}//Fin delo for del juego
		
		
		
		

	}

}
