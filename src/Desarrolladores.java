import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

import java.util.Scanner;

public class Desarrolladores {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		FactoryDesarrollo<String> FactoryDesarrolladores = new FactoryDesarrollo<String>();
		
		
		System.out.println("Bienvendio al programa de Desarrolladores");
		
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