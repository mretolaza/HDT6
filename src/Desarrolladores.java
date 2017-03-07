import java.io.IOException;
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
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Bienvenido al programa de conjuntos de desarrolladores!");
			System.out.println();
			setMenu();

			int tipoSet = scan.nextInt();
			CollectionFram FactoryDesarrolladores = new CollectionFram(tipoSet);
			System.out.println("Ingrese la cantidad de personas que ingresara: ");
			int cantPersona = scan.nextInt();

			for(int i = 0; i < cantPersona; i ++){
				System.out.println("Escriba el nombre del desarrollador: ");
				String nombre = scan.next();
				System.out.println("A cuantos conjuntos quiere agregar a esta persona?: ");
				int cantGrupos = scan.nextInt();
				System.out.println("Seleccione el conjunto al que quiere agregarla: ");
				conjutosMenu();
				int tipoConjunto = scan.nextInt();
				switch (tipoConjunto){
				case 1:
					FactoryDesarrolladores.addSetWeb(nombre);
					break;
				case 2:
					FactoryDesarrolladores.addSetJava(nombre);
					break;
				case 3:
					FactoryDesarrolladores.addSetMovil(nombre);
					break;
				}
				if (cantGrupos > 1){
					for (int i2 = 0; i2 < cantGrupos - 1; i2++){
						System.out.println("Seleccione el otro conjunto al que quiere agregarla: ");
						conjutosMenu();
						tipoConjunto = scan.nextInt();
						switch (tipoConjunto) {
						case 1:
							FactoryDesarrolladores.addSetWeb(nombre);
							break;
						case 2:
							FactoryDesarrolladores.addSetJava(nombre);
							break;
						case 3:
							FactoryDesarrolladores.addSetMovil(nombre);
							break;
						}
					}
				}
			}
			boolean mostrarMenu = true;
			while (mostrarMenu){
				menuPrincipal();
				int pregunta = scan.nextInt();
				switch (pregunta){
				case 1:
					FactoryDesarrolladores.tresIntersecciones();
					break;
				case 2:
					FactoryDesarrolladores.javaNoWeb();
					break;
				case 3:
					FactoryDesarrolladores.webYMovilNoJava();
					break;
				case 4:
					FactoryDesarrolladores.webOMovilNoJava();
					break;
				case 5:
					FactoryDesarrolladores.javaSubWeb();
					break;
				case 6:
					FactoryDesarrolladores.masGrande();
					break;
				case 7:
					FactoryDesarrolladores.masGrandeAscendente();
					break;
				case 8:
					mostrarMenu = false;
					break;
				}
			}
		}catch (Exception e){
			System.out.println("Ha ingresado un dato invalido! Por favor reinicie el programa y vuelva a intentarlo!");
		}

	}
	public static void menuPrincipal(){
		System.out.println();
		System.out.println("---Bienvenido al Menù Principal del Programa---");
		System.out.println();
		System.out.println("Seleccione la informacion que desea consultar: ");
		System.out.println("1) Desarrolladores con experiencia en Java, web, y celulares");
		System.out.println("2) Desarrolladores con experiencia en Java pero que no tengan experiencia en web");
		System.out.println("3) Desarrolladores con experiencia en web y celulares, pero sin experiencia en Java");
		System.out.println("4) Desarrolladores con experiencia en web o celulares, pero sin experiencia en Java");
		System.out.println("5) El conjunto de desarrolladores Java es un subconjunto de desarrolladores web?");
		System.out.println("6) Cual es el conjunto mas grande? (Mostrar tambien los nombres de los desarrolladores)");
		System.out.println("7) Desplegar lista con los nombres de los desarrolladores del conjunto mas grande en orden ascendente");
		System.out.println("8) Salir del Programa");
	}
	
	public static void setMenu(){
		System.out.println("Seleccione el tipo de SET que utilizara el programa:");
		System.out.println();
		System.out.println("1) HashSet");
		System.out.println("2) TreeSet");
		System.out.println("3) LinkedHashSet");
	}

	public static void conjutosMenu(){
		System.out.println("1) Desarrolladores Web");
		System.out.println("2) Desarrolladores Java");
		System.out.println("3) Desarrolladores Moviles");
	}

	
}