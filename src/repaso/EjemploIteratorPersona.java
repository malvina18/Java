package Ejemplos_Iterator;

import java.util.*;

public class EjemploIteratorPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Persona> listaPersonas=new ArrayList();
		
		listaPersonas.add(new Persona("Juan","Martinez",32));
		listaPersonas.add(new Persona("Pepa","Bueno",19));
		listaPersonas.add(new Persona("Arturo","Valls",99));
		listaPersonas.add(new Persona("Ainhoa","Arteta",37));
		
		//Creación del iterador para el arrayList listaPersonas
		Iterator<Persona>it=listaPersonas.iterator();
		
		//Me creo un objeto auxiliar
		Persona perAux=null;
		
		while(it.hasNext())
		{
			//Guardo en el objeto auxiliar el contenido de la siguiente posición en el arrayList
			//Si no lo hacemos y usamos varias veces it.next() dentro del bucle, seguiría recorriendo el arrayList.
			perAux=it.next();
			
			//uso el objeto que acabo de obtener del arrayList.
			System.out.println("Nombre: "+perAux.getNombre());
			System.out.println("Apellidos: "+perAux.getApellidos());
			System.out.println("Edad: "+perAux.getEdad());
			System.out.println("\n\n");
		}
		
		
	}

}
