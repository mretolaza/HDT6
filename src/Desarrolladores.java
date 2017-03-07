import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

import java.util.Scanner;

/**
 * @author Marìa Mercedes Retolaza Reyna, Carne 16339 
 * Esta clase es el programa principal; Este se encarga de realizar las llamadas 
 * a las otras clases. 
 *
 */
public class Desarrolladores {

	/**
	 * Esta es la parte principal del programa, es donde el usuario puede interactuar 
	 * con el programa y el puede elegir la opciòn que desea observar segun lo que el 
	 * necesite. 
	 * Se implementa IOExcepction para validaciòn del programa. 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		FactoryDesarrollo<String> FactoryDesarrolladores = new FactoryDesarrollo<String>();

		//Mensaje de bienvenida al programa 
		System.out.println("Bienvendio al programa de Desarrolladores");
		System.out.println("A continuaciòn Eliga una opciòn de lo que desea "
				+ "realizar:");

		//Java
		System.out.println("Presione 1 para usar HashSet");

		//Android
		System.out.println("Presione 2 para usar TreeSet");

		//IOS
		System.out.println("Presione 3 para usar LinkedHashSet");
		int opcion = s.nextInt();


		FactoryDesarrolladores.Setcall(opcion);

	}

}