package ejer_2_Pseudocodigo_Java;
/*
 * 2. Escribe un algoritmo y su correspondiente c�digo en JAVA que pida un car�cter en
min�scula al usuario y lo pase a may�scula. No se pueden utilizar los m�todos uppercase y
lowercase.
 */

public class Pasar_caracter_Minus_Mayus_2 {

	public static void main(String[] args) {
		char caracter = ' ';
		
		System.out.println("Introduzca un caracter en minuscula");
		caracter = Entrada.caracter();
		
		if (caracter >= 97 && caracter <= 122) {
			caracter = (char)(caracter-32); 
			System.out.println("El caracter en mayuscula es:"+caracter);
		}else {
			if (caracter >= 65 && caracter <=90 ) {
				caracter = (char)(caracter+32); 
				System.out.println("El caracter en minuscula es:"+caracter);
			}
		}
	}

}
