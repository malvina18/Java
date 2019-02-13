package pseudocodigo_sec_alt_repetitiva;

public class mostrar_np_P_N_ni_P_N_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1;
		boolean esCero = false;
		System.out.println("Para salir del programa introduzca un cero");
		
		while (!esCero){
			System.out.println("Introduzca un numero");
			num=Entrada.entero();
			if(num == 0){
				esCero=true;
				System.out.println("ha salido del programa");
			}else{
				if(num % 2 ==0){
					System.out.println("El Numero "+ num +" es PAR");
				}else{
					if(num % 2 !=0){
						System.out.println("El Numero "+ num +" es IMPAR");
					}
				}	
			}
			
		}
	}

}
