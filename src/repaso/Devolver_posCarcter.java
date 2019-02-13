package repaso;
/*
 * 2. Realiza un algoritmo que se le pase como parámetro una cadena y un carácter y
devuelva un vector que contenga todas las posiciones de la cadena donde está dicho
carácter.
 */

public class Devolver_posCarcter {

	public static void main(String[] args) {
		String cadena = new String("malvini");
		char caracter = 'i';
		
//		System.out.println("Introduzca una cadena");
//		cadena = Entrada.cadena().toLowerCase();
//		System.out.println("Introduzca el caracter que quieres saber su posicion");
//		caracter = Entrada.caracter();
		
		int [] vectorPosicion = vectorPosiciones(cadena, caracter);
		System.out.println("El caracter "+caracter+", de la cadena,"+cadena+" esta en la posiciones:");
		MisFunciones.imprimirVector(vectorPosicion);
		
//		for (int i = 0; i < vectorPosicion.length; i++) {
//			System.out.println("El caracter "+caracter+", se encuentra en las posiciones "
//							+vectorPosicion[i]+" de la cadena "+cadena);
//			
//		}
		
	}
	public static int[] vectorPosiciones (String cad, char c) {
		//paso la cadena a un vectorde caracteres
		char vectorDeCaracters []= cad.toCharArray();
		int pos = 0, contadorcaracter= 0;
		//saco las veces que aparece ese csracteren el vector
		for (int i = 0; i < vectorDeCaracters.length; i++) {
			if (vectorDeCaracters[i] == c ) {
				contadorcaracter++;
			}
		}
		//luego me creo un vector y le paso el numerodeVces que aparece el caracter .Busco las posiciones donde aparecen
		int [] vecPosiciones = new int [contadorcaracter];
		int j = 0;
		for (int i = 0; i < vectorDeCaracters.length; i++) {
			if (vectorDeCaracters[i] == c){
				pos = i;
				vecPosiciones[j]=pos;
				j++;
			}
			
		}
		
		return vecPosiciones;
		
	}
	//otra manera
	public static int []  devolverVectorDePosicionesDeLaCadena(String cad1, char caracter ) {
		
		int numeroVecesApareceCaracterEnCadena=0;
		int posicionCaracter=0;
		String cadenaAux = new String();
		char cad2 []= cad1.toCharArray();
		
		while (cad1.indexOf(caracter) != -1) {
			posicionCaracter= cad1.indexOf(caracter);
			cad1 = cad1.substring(posicionCaracter + 1, cad1.length());
			numeroVecesApareceCaracterEnCadena ++;
			cadenaAux = cadenaAux + posicionCaracter;
			
		}
		int[] posiciones = new int[numeroVecesApareceCaracterEnCadena];
		int j=0;
		for (int i = 0; i < cad2.length; i++) {
			if (caracter==cad2[i]){
				posiciones[j]=i;
				j++;
			}
		}
		
		return posiciones;
	}
}
