import java.util.Iterator;
import java.util.Set;

/**
 *Esta clase es la collection Fram (que es la que lleva el control puede ser llamada tambien 
 *controlador) es la que tiene todos los metodos necesarios para realizar las preguntas
 *que sean elegidas por el usuario en el menu principal.  
 *Debemos de tener presente que Los atributos se inicializan con un Factory 
 *en el constructor de la clase, para que el usuario elija que tipo de Set desea utilizar.
 * @author Marìa Mercedes Retolaza Reyna, 16339 
 */
/**
 * @author Marìa Mercedes Retolaza Reyna, 16339 
 *
 */
public class CollectionFram {
	Set<String> setWeb;
	Set<String> setJava;
	Set<String> setMovil;

	public CollectionFram(int tipoSet){
		setWeb   = new FactoryDesarrollo<String>().Setcall(tipoSet);
		setJava  = new FactoryDesarrollo<String>().Setcall(tipoSet);
		setMovil = new FactoryDesarrollo<String>().Setcall(tipoSet);
	}

	/**
	 * Agrega el nombre de un desarrollador al set de desarrolladores Web.
	 * @param persona El nombre del desarrollador
	 */
	public void addSetWeb(String persona){
		setWeb.add(persona);
	}

	/**
	 * Agrega el nombre de un desarrollador al set de desarrolladores Java.
	 * @param persona El nombre del desarrollador
	 */
	public void addSetJava(String persona){
		setJava.add(persona);
	}

	/**
	 * Agrega el nombre de un desarrollador al set de desarrolladores moviles.
	 * @param persona El nombre del desarrollador
	 */
	public void addSetMovil(String persona){
		setMovil.add(persona);
	}

	/**
	 * Metodo que muestra los nombres de los desarrolladores con experiencia en los tres luagres de 
	 * desarrolo. 
	 */
	public void tresIntersecciones(){
		System.out.println("Los desarrolladores que presentan experiencia en las TRES àreas son:"); Iterator<String> itr = setWeb.iterator();
		while (itr.hasNext()){
			Object element = itr.next(); Iterator<String> itr2 = setJava.iterator();
			while (itr2.hasNext()){
				Object elemet2 = itr2.next();
				if (element.equals(elemet2)){
					Iterator<String> itr3 = setMovil.iterator();
					while(itr3.hasNext()){
						Object element3 = itr3.next();
						if(element.equals(element3)){
							System.out.println(element);
						}
					}
				}
			}
		}
	}// end que finaliza el primer bloque 

	/**
	 * Metodo que muestra los nombres de los desarrolladores que tienen experiencia en Java, pero que no tienen 
	 * experienca en el àrea Web.
	 */
	public void YjavaNWeb(){
		System.out.println("Los Desarrolladores con experiencia en Java pero NO en Web son los "
				+ "siguientes:");
		Iterator<String> itr = setJava.iterator();
		while (itr.hasNext()){
			Object element = itr.next();Iterator<String> itr2 = setWeb.iterator();
			boolean exist = false;
			while(itr2.hasNext()){
				Object elemnt2 = itr2.next();
				if(element.equals(elemnt2)){
					exist = true;}
			}if(!exist){
				System.out.println(element);
			}
		}
	}// End del segundo Bloque 

	/**
	 * Metodo que muestra los nombres de los desarrolladores que tienen experiencia en Web y
	 *  Desarrollo movil pero no tienen experiencia en JAVA.
	 */
	public void MovilYWeb_NoJava(){
		System.out.println("Los desarrolladores con experiencia en Web  & Movil, pero NO en JAVA son"
				+ "los siguientes:");
		Iterator<String> itr = setWeb.iterator();
		while (itr.hasNext()){
			Object element = itr.next(); Iterator<String> itr2 = setMovil.iterator();
			while(itr2.hasNext()){
				Object element2 = itr2.next();
				if(element.equals(element2)){
					boolean exist = false;
					Iterator<String> itr3 = setJava.iterator();
					while(itr3.hasNext()){
						Object element3 = itr3.next();
						if (element.equals(element3)){
							exist = true;}
					}
					if (!exist){
						System.out.println(element);
					}
				}
			}
		}
	}// End del tercer bloque 

	/**
	 * Metodo que muestra los nombres de los desarrolladores que tienen experiencia en 
	 * Web o Movil (Esto no es incluyente), pero tienen experiencia alguna en Java.
	 */
	public void webOMovil_NoJava(){
		System.out.println("Los desarrolladores con experiencia en Web O Movil, "
				+ "pero no en java son los siguientes:");
		Iterator<String> itr = setWeb.iterator();
		while(itr.hasNext()){
			Object element = itr.next();Iterator<String> itr2 = setJava.iterator();
			boolean exist = false;
			while (itr2.hasNext()){
				Object element2 = itr2.next();
				if (element.equals(element2)){
					exist = true;
				}
			}
			if (!exist){
				System.out.println(element);}
		}

		itr = setMovil.iterator();
		while (itr.hasNext()){
			Object element = itr.next();
			Iterator<String> itr2 = setWeb.iterator();
			boolean exist = false;
			while (itr2.hasNext()){Object element2 = itr2.next();
			if (element.equals(element2)){
				exist = true;
			}
			}
			if (!exist){
				Iterator<String> itr3 = setJava.iterator();
				boolean exist2 = false;
				while(itr3.hasNext()){Object element3 = itr3.next();
				if(element.equals(element3)){
					exist2 = true;
				}
				}
				if(!exist2){
					System.out.println(element);}
			}
		}
	}// end del bloque 

	/**
	 * Metodo que muestra si el conjunto de desarrolladores java es un subconjunto 
	 * del conjunto de desarrolladores web.
	 * Para este procedimiento se realizo un vector de boolean que servirà para una 
	 * sencilla ubicacion de los desarroladores 
	 */
	public void javaSubWeb(){
		Boolean[] existArray = new Boolean[setJava.size()];
		for(int i = 0; i < existArray.length; i++){
			existArray[i] = false;
		}
		Iterator<String> itr = setWeb.iterator();
		int contador = 0;
		while (itr.hasNext()){
			Object element = itr.next();Iterator<String> itr2 = setJava.iterator();
			while (itr2.hasNext()){
				Object element2 = itr2.next();
				if(element.equals(element2)){
					existArray[contador] = true;
					}
				}
			contador++;
		}boolean isSubconjunto = true;
		for(int i = 0; i < existArray.length; i++){
			if(existArray[i] == false){
				isSubconjunto = false;}
		}
		if(isSubconjunto){
			System.out.println("El conjunto de desarrolladores java SI es un subconjunto"
					+ " del conjunto que esta conformado por los desarroladores web.");
		}else{
			System.out.println("El conjunto de desarrolladores java NO es un subconjunto del "
					+ "conjunto de desarrolladores web. Puede intentar con otro conjunto de personas mas tarde");
		}
	}

	/**
	 * Metodo que muestra cual es el conjunto de desarrolladores que tienen un mayor grupo y
	 *  los nombres de los desarrolladores de dicho conjunto.
	 */
	public void GrupoMasGrande(){
		Set<String> setMasGrande = null;
		String nombreConjunto = "";
		if (setWeb.size() > setJava.size() && setWeb.size() > setMovil.size()){
			setMasGrande = setWeb;
			nombreConjunto = "Web";
		}else if (setJava.size() > setWeb.size() && setJava.size() > setMovil.size()){
			setMasGrande = setJava;
			nombreConjunto = "Java";
		}else if (setMovil.size() > setWeb.size() && setMovil.size() > setJava.size()){
			setMasGrande = setMovil;
			nombreConjunto = "Movil";
		}

		if(setMasGrande != null){
			System.out.println("El conjunto mas grande es el conjunto de desarrolladores " + nombreConjunto + ".");
			System.out.println("Los nombres de los desarrolladores son: ");
			Iterator<String> itr = setMasGrande.iterator();
			while (itr.hasNext()){
				Object element = itr.next();
				System.out.println(element);
			}
		}else{
			System.out.println("Existen varios conjuntos del mismo tamaño!");
		}
	}// end del bloque 

	public void MASGrandeAscendente(){
		Set<String> setMasGrande = null;
		if (setWeb.size() > setJava.size() && setWeb.size() > setMovil.size()){
			setMasGrande = setWeb;
		}else if (setJava.size() > setWeb.size() && setJava.size() > setMovil.size()){
			setMasGrande = setJava;
		}else if (setMovil.size() > setWeb.size() && setMovil.size() > setJava.size()){
			setMasGrande = setMovil;
		}

		if(setMasGrande != null){
			Iterator<String> itr = setMasGrande.iterator();
			Object[] desarrolladores = new Object[setMasGrande.size()];
			int contador = 0;
			while (itr.hasNext()){
				Object element = itr.next();
				desarrolladores[contador] = element;
				contador++;
			}
			System.out.println("Los nombres de los desarrolladores del conjunto mas en orden ascendente son:");
			for (int i = desarrolladores.length-1; i > -1 ; i--){
				System.out.println(desarrolladores[i]);
			}
		}


	}

}// end del programa 