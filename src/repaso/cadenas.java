package repaso;

import java.util.Scanner;

public class cadenas {

	public static void main(String[] args) {
		// creando cadena
		String cadena = new String("");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		;
		System.out.println("Introduzca una cadena");
		cadena = sc.next();

		String cadVuelta = cadenas.darVueltacadena(cadena);
		System.out.println("La cadena al reves es: " + cadVuelta + "\n");
		
		// vocales
		int cadVuelta1 = cadenas.contarVocales(cadena);
		System.out.println("La cadena tiene: " + cadVuelta1 + " vocales");
		
		//  cantidad de numeros
		int cadVuelta2 = cadenas.contarNumeros(cadena);
		System.out.println("La cadena tiene; " + cadVuelta2 + " numeros");
		
		//numero mayor repetido
		
		String num = cadenas.cualSeRepiteMas(cadena);
		System.out.println(num);
		

	}

	// DAR VUELTA A UNA CADENA
	public static String darVueltacadena(String cad) {
		String cadenaInvertida = new String("");
		for (int i = cad.length() - 1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + cad.charAt(i);
		}
		return cadenaInvertida;

	}

	public static int contarVocales(String cad) {
		int cantidadVocales = 0;
		// char cad2 [] = cadena.toCharArray();
		cad = cad.toLowerCase();
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == 'a' || cad.charAt(i) == 'e' || cad.charAt(i) == 'i' 
					|| cad.charAt(i) == 'o'
					|| cad.charAt(i) == 'u'){
				cantidadVocales++;
			}
		}

		return cantidadVocales;

	}
	
	public static int contarNumeros(String cad) {
		int cantidadNum = 0;
		// char cad2 [] = cadena.toCharArray();
		cad = cad.toLowerCase();
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == '1' || cad.charAt(i) == '2' || cad.charAt(i) == '3' 
					|| cad.charAt(i) == '4'|| cad.charAt(i) == '5'
					|| cad.charAt(i) == '6' || cad.charAt(i) == '7'
					|| cad.charAt(i) == '8' || cad.charAt(i) == '9' || cad.charAt(i) == '0'){
				cantidadNum++;
			}
		}
		return cantidadNum;
	}

	public static String cualSeRepiteMas (String cad ) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		String string = new String();
		cad = cad.toLowerCase();
		
		for (int j = 0; j < cad.length(); j++) {
			
			switch (cad.charAt(j)) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			}
		}
		if (a > e || a < i || a > o || a > u ) {
			string = "La vocal que mas se repite es la a: " + a + " veces";
			return string;
		}else if (e > a || e < u || e > i || e > o ) {
			string = "La vocal que mas se repite es la e: " + e + " veces";
			return string;
		}else if (i > a || i < e || i > o || e > u ) {
			string = "La vocal que mas se repite es la i: " + i + " veces";
			return string;
		}else if (o > a || o < e || o > i || o > u ) {
			string = "La vocal que mas se repite es la o: " + o + " veces";
			return string;
		}else if (u > a || u < e || u > i || u > o ) {
			string = "La vocal que mas se repite es la u: " + u + " veces";
			return string;
		}
		return string = "No hay vocales" ;
	}
}
