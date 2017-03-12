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
	 * @param args parametro del main 	
	 * @throws IOException parametro de validacion 
	 */
	
	//Interaccion con el usuario (implementa los procedimientos del menu, los sets y hace el ingreso de los desarrolladores
	//al sistema 
	public static void main(String[] args) throws IOException {
		try{
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Bienvenido al programa de conjuntos de desarrolladores!");
			System.out.println();
			setMenu();

			int tipoSet = scan.nextInt();
			CollectionFram FactoryDesarrolladores = new CollectionFram(tipoSet);
			System.out.println("Ingrese la cantidad de personas que va a evaluar en el programa: ");
			int cantPersona = scan.nextInt();

			for(int i = 0; i < cantPersona; i ++){
				System.out.println("Escriba el nombre del desarrollador: ");
				String nombre = scan.next();
				System.out.println("Elija la cantidad de conjuntos en los que participará dicha persona: ");
				int cantGrupos = scan.nextInt();
				System.out.println("Ya que los agrego;... Seleccione el conjunto al que quiere agregarla: ");
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
						System.out.println("Porfavor Seleccione al otro conjunto al que quiere agregarla: ");
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
					FactoryDesarrolladores.YjavaNWeb();
					break;
				case 3:
					FactoryDesarrolladores.MovilYWeb_NoJava();
					break;
				case 4:
					FactoryDesarrolladores.webOMovil_NoJava();
					break;
				case 5:
					FactoryDesarrolladores.javaSubWeb();
					break;
				case 6:
					FactoryDesarrolladores.GrupoMasGrande();
					break;
				case 7:
					FactoryDesarrolladores.MASGrandeAscendente();
					break;
				case 8:
					mostrarMenu = false;
					break;
				}
			}
		}catch (Exception e){
			System.out.println("ERROR ; Datos inválidos. Vuelva a comenzar el programa");
		}

	}
	//Procedimiento que muestra los sets 
	public static void setMenu(){
		System.out.println("Seleccione el tipo de SET que utilizara el programa:");
		System.out.println();
		System.out.println("1) HashSet");
		System.out.println("2) TreeSet");
		System.out.println("3) LinkedHashSet");
	}
   //Procedimiento que muestra los conjuntos en el menú 
	public static void conjutosMenu(){
		System.out.println("1) Desarrolladores Web");
		System.out.println("2) Desarrolladores Java");
		System.out.println("3) Desarrolladores Moviles");
	}
	//Las preguntas se muestran en el orden que esta en la hoja de trabajo. 
	public static void menuPrincipal(){
		System.out.println();
		System.out.println("---Bienvenido al Menù Principal del Programa---");
		System.out.println();
		System.out.println("Seleccione la informacion que desea consultar: ");
		System.out.println("1) Desarrolladores con experiencia en Java, web, y Movil");
		System.out.println("2) Desarrolladores con experiencia en Java pero que NO tengan experiencia en web");
		System.out.println("3) Desarrolladores con experiencia en web y Movil, pero SIN experiencia en Java");
		System.out.println("4) Desarrolladores con experiencia en web o Movil, pero SIN experiencia en Java");
		System.out.println("5) El conjunto de desarrolladores Java es un subconjunto de desarrolladores web?");
		System.out.println("6) Cual es el conjunto mas grande? (Mostrar tambien los nombres de los desarrolladores)");
		System.out.println("7) Desplegar lista con los nombres de los desarrolladores del conjunto mas grande en orden ascendente");
		System.out.println("8) Salir del Programa-- No se guardara ningun cambio");
	}
	

	
}