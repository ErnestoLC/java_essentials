package asesorias;

import libs.Input;

public class Monedas {

	public static void main(String[] args) {
		// Pedir al usuario que nos de un número fraccional
		// 1.45
		System.out.print("Cambio?: ");
		double cambioTotal = Input.get_double();
		
		// convertirlo a entero multiplicandolo por 100
		// 145
		int cambioCentavos = (int) (cambioTotal * 100);
		
		//necesito un contador de monedas
		int contadorMonedas = 0;
		
		// monedas de 25 de 10 de 5 y 1 centabo
		// Saca cuantas monedas de 25 centavos
		int monedas25Centavos = cambioCentavos/25;
		contadorMonedas = contadorMonedas + monedas25Centavos;
		int restoCentavos = cambioCentavos % 25;
		
		// cuanto sobra? 20
		// 2 monedas de 10 centabos que son 20 c
		int monedas10Centavos = restoCentavos/10;
		contadorMonedas = contadorMonedas + monedas10Centavos;
		restoCentavos = restoCentavos % 10;
		// cuanto sobra ¿? 0
		int monedas5Centavos = restoCentavos/5;
		contadorMonedas = contadorMonedas + monedas5Centavos;
		restoCentavos = restoCentavos % 5;
		
		int monedas1Centavos = restoCentavos/1;
		contadorMonedas = contadorMonedas + monedas1Centavos;
		
		System.out.println("Necesito "+contadorMonedas+" monedas para dar cambio de "+cambioTotal);
		System.out.println("Monedas de 25 centavos: "+monedas25Centavos);
		System.out.println("Monedas de 10 centavos: "+monedas10Centavos);
		System.out.println("Monedas de 5 centavos: "+monedas5Centavos);
		System.out.println("Monedas de 1 centavos: "+monedas1Centavos);
	}

}
