package ejer_1_Pseudocodigo_Java;
/*
 * 7. Escribe un algoritmo y su correspondiente c�digo en JAVA que le pida un n�mero al usuario e imprima la
cantidad de cada uno de esos d�gitos que hay en el n�mero.
Por ejemplo:
Si el usuario introduce el n�mero 5432891123, el programa responder�:
Cifra 0: hay 0 en su n�mero
Cifra 1: hay 2 en su n�mero
Cifra 2: hay 2 en su n�mero
Cifra 3: hay 2 en su n�mero
Cifra 4: hay 1 en su n�mero
Cifra 5: hay 1 en su n�mero
Cifra 6: hay 0 en su n�mero
Cifra 7: hay 0 en su n�mero
Cifra 8: hay 1 en su n�mero
Cifra 9: hay 1 en su n�mero.
 */

public class Imprimer_cantidad_digitos_7 {

	public static void main(String[] args) {
		int num, cifra, o=0, i=0, j=0, k=0, c=0, t=0, y=0, e=0, b=0, p=0;
		
		System.out.println("Introduzca un n�mero");
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
		System.out.println("Cifra 0: Hay "+o+" en su n�mero");
		System.out.println("Cifra 1: Hay "+i+" en su n�mero");
		System.out.println("Cifra 2: Hay "+j+" en su n�mero");
		System.out.println("Cifra 3: Hay "+k+" en su n�mero");
		System.out.println("Cifra 4: Hay "+c+" en su n�mero");
		System.out.println("Cifra 5: Hay "+t+" en su n�mero");
		System.out.println("Cifra 6: Hay "+y+" en su n�mero");
		System.out.println("Cifra 7: Hay "+e+" en su n�mero");
		System.out.println("Cifra 8: Hay "+b+" en su n�mero");
		System.out.println("Cifra 9: Hay "+p+" en su n�mero");
	}
}
