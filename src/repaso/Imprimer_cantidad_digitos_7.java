package ejer_1_Pseudocodigo_Java;
/*
 * 7. Escribe un algoritmo y su correspondiente código en JAVA que le pida un número al usuario e imprima la
cantidad de cada uno de esos dígitos que hay en el número.
Por ejemplo:
Si el usuario introduce el número 5432891123, el programa responderá:
Cifra 0: hay 0 en su número
Cifra 1: hay 2 en su número
Cifra 2: hay 2 en su número
Cifra 3: hay 2 en su número
Cifra 4: hay 1 en su número
Cifra 5: hay 1 en su número
Cifra 6: hay 0 en su número
Cifra 7: hay 0 en su número
Cifra 8: hay 1 en su número
Cifra 9: hay 1 en su número.
 */

public class Imprimer_cantidad_digitos_7 {

	public static void main(String[] args) {
		int num, cifra, o=0, i=0, j=0, k=0, c=0, t=0, y=0, e=0, b=0, p=0;
		
		System.out.println("Introduzca un número");
		num=Entrada.entero();
		
		while(num>0){
			cifra=num%10;

			switch (cifra){
				case 0:
					o++;
					break;
				case 1:
					i++;
					break;
				case 2:
					j++;
					break;
				case 3:
					k++;
					break;
				case 4:
					c++;
					break;
				case 5:
					t++;
					break;
				case 6:
					y++;
					break;
				case 7:
					e++;
					break;
				case 8:
					b++;
					break;
				case 9:
					p++;
					break;
				}
			num=num/10;
					
		}
		System.out.println("Cifra 0: Hay "+o+" en su número");
		System.out.println("Cifra 1: Hay "+i+" en su número");
		System.out.println("Cifra 2: Hay "+j+" en su número");
		System.out.println("Cifra 3: Hay "+k+" en su número");
		System.out.println("Cifra 4: Hay "+c+" en su número");
		System.out.println("Cifra 5: Hay "+t+" en su número");
		System.out.println("Cifra 6: Hay "+y+" en su número");
		System.out.println("Cifra 7: Hay "+e+" en su número");
		System.out.println("Cifra 8: Hay "+b+" en su número");
		System.out.println("Cifra 9: Hay "+p+" en su número");
	}
}
