package repaso;

/*
 * 1. Realiza una función que reciba como parámetro una cadena y devuelva la misma
cadena sin espacios en blanco.
 */
public class Devolver_cadena_1 {

	public static void main(String[] args) {
		String cadena = new String("");
		String cadena1 = new String("");

		cadena = pedirCadena();
		System.out.println("La cadena introducida por el usuario es:"+ cadena);
		System.out.println();
		
		System.out.println("DEVOLVIENDO CADENA");
		cadena1 = devuelveCadenaSinEspacios(cadena);
		System.out.println("La cadena sin espacio es "+cadena1 );

	}
	public static String pedirCadena () {
		String cadenaUsuario = new String("");
		
		System.out.println("Introduzca una cadena");
		//cadenaUsuario = Entrada.cadena().toLowerCase().trim();
		
		return cadenaUsuario;
	}
	
	public static String devuelveCadenaSinEspacios(String cadena) {
		String cad = new String("");
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' '){
				cad += cadena.charAt(i);
			}
		}
		return cad;
		
	}
//	public static String devolverCadenaSinEspacios(String cad1) {
//		String cad2 = new String();
//		cad2 =cad1.replaceAll(" ", "");
//		
//		return cad2;
//	}

}
