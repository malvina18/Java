package repaso;
/*
 * 8. Escribe una función que determine el número de apariciones de una subcadena en una
cadena. Por ejemplo, la función devolverá 3 si usamos la cadena “acabose cayendo
escarbando” buscando la subcadena “ca”.
 */

public class NumerosVeces_SubCadena_8 {

	public static void main(String[] args) {
		String cadena = new String("acabose cayendo escarbando");
		String sub = new String("ca");
		cuentaSubacdena(cadena, sub);
	}
 	public static void cuentaSubacdena(String cad,String subcad)
	{
		int veces=0,posicion=0;
		
		while(posicion!=-1){
			posicion=cad.indexOf(subcad);
			if(posicion!=-1)
			{
				cad=cad.substring(posicion+1);
				veces++;
			}
		}
		System.out.println("Aparece "+veces+" veces");
	}
}
