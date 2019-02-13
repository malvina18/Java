package ejer_2_Pseudocodigo_Java;
/*
 * 2. Escribe un algoritmo y su correspondiente código en JAVA que pida un carácter en
minúscula al usuario y lo pase a mayúscula. No se pueden utilizar los métodos uppercase y
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
