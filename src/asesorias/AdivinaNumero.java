package asesorias;

import java.util.Random;

import libs.Input;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al juego de 'Adivina el n�mero m�gico'");
		System.out.println("Adivina el n�ero m�gico del 1 al 20. Buena suerte\n");
		
		// Iniciar la respuesta del usuario con cualquier cosa
		int numeroUsuario = 0;
		
		//Creamos un nuero entero entre 1 y 20 al azar
		int numeroSecreto = new Random().nextInt(20)+1;
		
		// inicializamos el n�ero de intentos
		int contadorIntentos = 0;
		
		while (numeroUsuario != numeroSecreto && contadorIntentos < 3 ) {
			// le pedimos al usuario que adivine el numero
			System.out.print("Adivina el n�mero m�gico: ");
			
			//El usuario va a ingresar un n�mero entre 1 y 20
			numeroUsuario = Input.get_int();
			if (numeroUsuario > 0 && numeroUsuario < 21) {
				if (numeroUsuario == numeroSecreto) {
					System.out.println("����Felicidades, Adivinaste el n�mero m�gico!!!! :)");
				} else {
					//si el n�mero est� entre 1 y 20 pero no es el correcto, le desimo al usuario que no lo adivin�
					System.out.println("No adivinaste :(");
					contadorIntentos++;
				}
			} else {
				//si el n�mero no est� entre 1 y 20 le mandamos un mensaje de error
				System.out.println("El n�mero no est� entre 1 y 20");
				contadorIntentos++;
			}
		}
		if (contadorIntentos == 3) {
			System.out.println("No le atinaste. Agotaste tus intentos");
			System.out.println("El n�mero m�gico era: "+numeroSecreto);
		} 
	}
}
