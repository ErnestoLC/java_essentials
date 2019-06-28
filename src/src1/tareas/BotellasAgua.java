package src1.tareas;

import libs.Input;

public class BotellasAgua {

	public static void main(String[] args) {
		//Implementa un programa que reporte el uso de agua de un usuario que dura x minutos en la 
		//ducha expresado en botellas de agua.
		int minutos,botellas;
		
		System.out.print("Minutos: ");
		minutos = Input.get_int();
		
		botellas = minutos * 12;
		
		System.out.println("Botellas: " + botellas);

	}

}
