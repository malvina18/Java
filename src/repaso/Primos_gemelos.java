package ejer_1_Pseudocodigo_Java;
/*
 *  5. Realiza un programa en JAVA que pida un número al usuario y muestre la figura anterior hasta que llegue al
número de * dado por el usuario. Por ejemplo:
Algunos pares de primos gemelos son:
(3,5) (5,7) (11,13) (17,19) (29,31) (41,43) (59,61) (71,73) (101,103) (107,109).
 */

public class Primos_gemelos {

	public static void main(String[] args) {
		int num1,num2,i=2,j=2;
		
		System.out.println("Introduzca un número entero: ");
		num1=Entrada.entero();
		System.out.println("Introduzca otro número entero mayor que el anterior: ");
		num2=Entrada.entero();
		
		if (num2 - num1 == 2) {
			while (num1 % i != 0 && i<=num1/2){
				i++;
			}
			while (num2 % j != 0 && j<=num2/2){
				j++;
			}
			if (i>num1/2 && j>num2/2){
				System.out.println("Son números primos gemelos");
			}else{
				System.out.println("No son números primos gemelos");
			}
		} else{
			System.out.println("No son números primos gemelos");
		}
	}

}
