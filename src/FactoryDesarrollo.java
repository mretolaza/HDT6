import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;



public class FactoryDesarrollo<E> {

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