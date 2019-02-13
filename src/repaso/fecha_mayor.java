package Ejercicios_Ampliacion_pseudocodigo;
/*
 * EJERCICIO 2. Diseña un algoritmo en pseudocódigo que pida al usuario una fecha (día en formato
entero, mes en formato cadena, año en formato entero) y luego pida otra fecha (día en formato entero,
mes en formato cadena, año en formato entero) y muestre por pantalla la fecha mayor de ambas.
 */

import Practica_2.Entrada;

public class fecha_mayor {

	public static void main(String[] args) {
		int dia1 = 0, dia2 = 0, anyo1 = 0, anyo2 = 0, meses1 = 0, meses2 = 0;
		String mes1 = " ", mes2 = " ";
		
		System.out.println("Introduzca una dia" );
		dia1 =Entrada.entero();
		System.out.println("Introduzca una mes en formato cadena" );
		mes1 = Entrada.cadena();
		System.out.println("Introduzca una año" );
		anyo1 = Entrada.entero();
		
		System.out.println("Introduzca una dia" );
		dia2 =Entrada.entero();
		System.out.println("Introduzca una mes en formato cadena" );
		mes2 = Entrada.cadena();
		System.out.println("Introduzca una año" );
		anyo2 = Entrada.entero();
		
		switch (mes1) {
		case "enero":
			meses1 =meses1 +1;
			break;
		case "febrero":
			meses1 =meses1 +2;
			break;
		case "marzo":
			meses1 =meses1 +3;
			break;
		case "abril":
			meses1 =meses1 +4;
			break;
		case "mayo":
			meses1 =meses1 +5;
			break;
		case "junio":
			meses1 =meses1 +6;
			break;
		case "julio":
			meses1 =meses1 +7;
			break;
		case "agosto":
			meses1 =meses1 +8;
			break;
		case "septiembre":
			meses1 =meses1 +9;
			break;
		case "octubre":
			meses1 =meses1 +10;
			break;
		case "noviembre":
			meses1 =meses1 +11;
			break;
		case "diciembre":
			meses1 =meses1 +12;
			break;
			
		}
		
		switch (mes2) {
		case "enero":
			meses2 =meses2 + 1;
			break;
		case "febrero":
			meses2 =meses2 + 2;
			break;
		case "marzo":
			meses2 =meses2 +3;
			break;
		case "abril":
			meses2 =meses2 +4;
			break;
		case "mayo":
			meses2 =meses2 +5;
			break;
		case "junio":
			meses2 =meses2 +6;
			break;
		case "julio":
			meses2 =meses2 +7;
			break;
		case "agosto":
			meses2 =meses2 +8;
			break;
		case "septiembre":
			meses2 =meses2 +9;
			break;
		case "octubre":
			meses2 =meses2 +10;
			break;
		case "noviembre":
			meses2 =meses2 +11;
			break;
		case "diciembre":
			meses2 =meses2 +12;
			break;
			
		}
		if (anyo1 > anyo2){
			System.out.println("La fecha mayor es:"+dia1+"/"+meses1+"/"+anyo1); 
		}else{ 
			if (anyo2 > anyo1){
				System.out.println("La fecha mayor es:"+dia2+"/"+meses2+"/"+anyo2);
			}else{
				if (anyo1 == anyo2){
					if (meses1 == meses2){
						if (dia1 > dia2){
							System.out.println("La fecha mayor es:"+dia1+"/"+meses1+"/"+anyo1); 
						}else{
							System.out.println("La fecha mayor es:"+dia2+"/"+meses2+"/"+anyo2);
						}
					}else{
						if (anyo1 == anyo2){
							if (meses1 > meses2){
								System.out.println("La fecha mayor es:"+dia1+"/"+meses1+"/"+anyo1); 
							}else{
								System.out.println("La fecha mayor es:"+dia2+"/"+meses2+"/"+anyo2);
							}
						}
					}
				}
			}
		}
	}
}
