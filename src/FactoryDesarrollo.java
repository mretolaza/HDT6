import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Marìa Mercedes Retolaza Reyna, Carne 16339 
 * Esta clase hace las llamadas a los difentes procedimientos 
 * que estan establecidos para la realizacion de dicha hoja. 
 * @param <E>
 */
public class FactoryDesarrollo<E> {

	/** Procedimiento que identifica que llamada se esta realizando 
	 * implementando las diferentes opciones del programa. 
	 * @param opcion
	 * @return La opcion (el procedimiento segun lo que el usuario selecciona) Si 
	 * en dado caso elige otra cosa que no este en el programa; entonces no devuelve nada. 
	 */
	public Set<E> Setcall(int opcion) {
		switch(opcion) {
		case 1:
			return new HashSet<E>();
		case 2:
			return new TreeSet<E>();
		case 3:
			return new LinkedHashSet<E>();
		default:
			return null;
		}

	}
}