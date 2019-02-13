package pseudocodigo_sec_alt_repetitiva;

public class media_num_posit_9 {

	public static void main(String[] args) {
		int num = 0,suma = 0, i =0, media_nP = 0;
		
		System.out.println("Para salir del programa introduzca un numero negativo ");
		while(num >= 0){
			System.out.println("Introduza un numero entero  positivo");
			num = Entrada.entero();
			if(num >= 0){
				suma += num;	
				i++;
			}
		}
		media_nP = suma / i;
		
		System.out.println("La media de los numeros positivos introducidos es: "+ media_nP);
	}
}
