package Repaso_everis;

public class QuitarVocalesNUmCaracter extends Object {

	public static void main(String[] args) {
		
		String cadena = new String(" la madre de juan");
		String cadena1 = cadena.quitarCaracteres(cadena):
		system.out.println("Cadena sin caracteres :" cadena1);
	}

	public static String quitarCaracteres(String cadena, char c) {
		//String cad1 = new String("");
		//char[] cad = new String();
		String remplazado = new String("");
		char[] cad = cadena.toCharArray();
		for (int i = 0; i < cad.length; i++) {
			if (cad[i] == c) {
				 //remplazado = cad.replace(cad[i], "");
			}
		}
		
		return remplazado;

	}

}
