package src2.tareas;

import libs.Input;

public class InicialesFacil {

	public static void main(String[] args) {
		// Implemente un programa que, dado el nombre completo de una persona, imprima las iniciales de la personas, como se muestra abajo.
		String nombrecompleto, iniciales;
		char primerainicial, sigienteinicial;
		int posicionespacio;
		
		//Pedir el nombre completo al usuario
		System.out.print("¿Cuales tu nombre completo? ");
		nombrecompleto = Input.get_string();
		
		//sacar iniciales 
		primerainicial = nombrecompleto.charAt(0);
		
		//primero saco la primer posicion
		iniciales = ""+primerainicial;
		
		//en un ciclo, hago lo sigiente: voy a buscar espacio.
		//cuando haya espacios, se termina el ciclo
		//el espacio lo encuentro con el metodo indexof el cual me da la posicion de una cadena String dentro de otra
		posicionespacio = nombrecompleto.indexOf(" ");
		// la condicion para repeteir e sque la posicion no se a-1
		while (posicionespacio >= 0) {
			//cual es el sigiente caracter para poner en iniciales
			sigienteinicial = nombrecompleto.charAt(posicionespacio + 1);
			if (sigienteinicial >= 'A' && sigienteinicial <= 'Z') {
				iniciales = iniciales + sigienteinicial;
			}
			posicionespacio = nombrecompleto.indexOf(" ",posicionespacio + 1);
		}
		
		//guardo la prienmra posicion en una variable que se llame iniciales
		//busco un espacio 
		//la siguiente letra 
		//imprimir iniciales
		
		System.out.println(iniciales);

	}

}
