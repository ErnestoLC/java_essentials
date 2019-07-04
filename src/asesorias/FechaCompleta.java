package asesorias;

import libs.Input;

public class FechaCompleta {

	public static void main(String[] args) {
		// le pedimos al usuario la fech
	
		// 02/03/1990
		// 2 de Marzo de 1990
		// primero pedir al usuario la fecha
		System.out.print("Ingresa la fecha");
		String fecha=Input.get_string();
		// separar los dias, mes y anio
		//split
		String[] arregloFecha =  fecha.split("/");
		// sacar la equivalencia del mes: 1 - Enero, 2 - Febrero
		String dia = arregloFecha[0];
		String mes = arregloFecha[1];
		
		String anio = arregloFecha[2];
		boolean fechaValida = checarFecha(dia, mes, anio);
		if(fechaValida) {
			int mesNumerico = Integer.parseInt(mes);
			String mesPalabra = sacarMesPalabra(mesNumerico);
			
			// imprimir la fecha concatenando los valores.
			System.out.println("Hoy es: " + dia + " de "+ mesPalabra + " de " + anio);
		}
	}

	private static boolean checarFecha(String dia, String mes, String anio) {
		// TODO Auto-generated method stub
		int diaNum  = 0;
		int mesNum = 0;
		int anioNum = 0;
		boolean fechaValida = true;
		try {
			diaNum = Integer.parseInt(dia);
			mesNum = Integer.parseInt(mes);
			anioNum = Integer.parseInt(dia);
		} catch(java.lang.NumberFormatException nfe) {
			fechaValida = false;
		}
		
		
		if(mesNum < 1 || mesNum > 12){
			
			fechaValida = false;
		}
		//checar el dia
		if(mesNum == 1 || mesNum == 3 || mesNum == 5 || mesNum ==7 || mesNum == 8 || mesNum == 10 || mesNum == 12) {
			if(diaNum <1 || diaNum > 31) {
			
				fechaValida = false;
			}
		} else if(mesNum == 4 || mesNum == 6 || mesNum == 9 || mesNum == 11 ) {
			if(diaNum <1 || diaNum > 30) {
			
				fechaValida = false;
			}
		} else {
			if(esBisiesto(anioNum)) {
				if(diaNum <1 || diaNum > 29) {
					
					fechaValida = false;
				}
			} else {
				if(diaNum <1 || diaNum > 28) {
					
					fechaValida = false;
				}
			}
			
		}
		if(!fechaValida) {
			System.out.println("Fecha Invalida");
		}
		return fechaValida;
	}

	private static boolean esBisiesto(int anioNum) {
		// TODO Auto-generated method stub
		return false;
	}

	private static String sacarMesPalabra(int mesNumerico) {
		String[] meses = new String[] {"", "Enero",
				"Febrero",
				"Marzo", 
				"Abril",
				"Mayo",
				"Junio",
				"Julio",
				"Agosto",
				"Septiembre",
				"Octubre",
				"Noviembre",
				"Diciembre"};
		return meses[mesNumerico];	}
int[] numeros = {1,2,3,4,5,6,7,8,9,0};
double[] numerosDouble = {1.0,2.0,3,4,5,6,7,8,9,0.0};
}
