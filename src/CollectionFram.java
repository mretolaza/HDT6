import java.util.Iterator;
import java.util.Set;


/**
 * @author María Mercedes Retolaza, Carne 16339 
 *
 */
public class CollectionFram {
	Set<String> setWebS;
	Set<String> setJavaM;
	Set<String> setMovil;

	public CollectionFram(int tipoSet){
		setWebS   = new FactoryDesarrollo<String>().Setcall(tipoSet);
		setJavaM  = new FactoryDesarrollo<String>().Setcall(tipoSet);
		setMovil = new FactoryDesarrollo<String>().Setcall(tipoSet);
	}

	/**Procedimiento que añade persona en la parte web del programa
	 * @param persona
	 */
	public void addSetWeb(String person){
		setWebS.add(person); }

	/** Procedimiento que añade la persona a la parte movil del programa 
	 * @param persona
	 */
	public void addSetMovil(String person){
		setMovil.add(person);
	}	
	/**Procedimiento que añade persona a la parte de java del programa
	 * @param persona
	 */
	public void addSetJava(String person){
		setJavaM.add(person);
	}

    
	/**
	 * En este procedimiento podemos observar que se llevan a cabo 
	 * las tres intersecciones que el programa pide. 
	 */
	public void InterseccionesTres(){
		Iterator<String> itr = setWebS.iterator();
		while (itr.hasNext()){
			Object element = itr.next();
			Iterator<String> itr2 = setJavaM.iterator();
			while (itr2.hasNext()){
				Object elemet2 = itr2.next();
				if (element.equals(elemet2)){
					Iterator<String> itr3 = setMovil.iterator();
					while(itr3.hasNext()){
						Object element3 = itr3.next();
						if(element.equals(element3)){
							System.out.println(element);}
						}
					}
				}
			}
		} // Fin del primer bloque de instrucciones 

	public void javaNoWeb(){
		Iterator<String> itr = setJavaM.iterator();
		while (itr.hasNext()){
			Object element = itr.next();
			Iterator<String> itr2 = setWebS.iterator();
			boolean exist = false;
			while(itr2.hasNext()){
				Object elemnt2 = itr2.next();
				if(element.equals(elemnt2)){
					exist = true;
				}
			}
			if(!exist){
				System.out.println(element);
			}
		}
	}

	public void webYMovilNoJava(){
		Iterator<String> itr = setWebS.iterator();
		while (itr.hasNext()){
			Object element = itr.next();
			Iterator<String> itr2 = setMovil.iterator();
			while(itr2.hasNext()){
				Object element2 = itr2.next();
				if(element.equals(element2)){
					boolean exist = false;
					Iterator<String> itr3 = setJavaM.iterator();
					while(itr3.hasNext()){
						Object element3 = itr3.next();
						if (element.equals(element3)){
							exist = true;
						}
					}
					if (!exist){
						System.out.println(element);
					}
				}
			}
		}
	}

	public void webOMovilNoJava(){
		Iterator<String> itr = setWebS.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			Iterator<String> itr2 = setJavaM.iterator();
			boolean exist = false;
			while (itr2.hasNext()){
				Object element2 = itr2.next();
				if (element.equals(element2)){
					exist = true;
				}
			}
			if (!exist){
				System.out.println(element);
			}
		}

		itr = setMovil.iterator();
		while (itr.hasNext()){
			Object element = itr.next();
			Iterator<String> itr2 = setWebS.iterator();
			boolean exist = false;
			while (itr2.hasNext()){
				Object element2 = itr2.next();
				if (element.equals(element2)){
					exist = true;
				}
			}
			if (!exist){
				Iterator<String> itr3 = setJavaM.iterator();
				boolean exist2 = false;
				while(itr3.hasNext()){
					Object element3 = itr3.next();
					if(element.equals(element3)){
						exist2 = true;
					}
				}
				if(!exist2){
					System.out.println(element);
				}
			}
		}
	}

	public void javaSubWeb(){
		Boolean[] existArray = new Boolean[setJavaM.size()];
		for(int i = 0; i < existArray.length; i++){
			existArray[i] = false;
		}
		Iterator<String> itr = setWebS.iterator();
		int contador = 0;
		while (itr.hasNext()){
			Object element = itr.next();
			Iterator<String> itr2 = setJavaM.iterator();
			while (itr2.hasNext()){
				Object element2 = itr2.next();
				if(element.equals(element2)){
					existArray[contador] = true;
				}
			}
			contador++;
		}
		boolean isSubconjunto = true;
		for(int i = 0; i < existArray.length; i++){
			if(existArray[i] == false){
				isSubconjunto = false;
			}
		}
		if(isSubconjunto){
			System.out.println("El conjunto de desarrolladores java SI es un subconjunto del conjunto de desarrolladores web.");
		}else{
			System.out.println("El conjunto de desarrolladores java NO es un subconjunto del conjunto de desarrolladores web.");
		}
	}


	public void mostrarTodo(){
		Iterator<String> itr = setWebS.iterator();
		while (itr.hasNext()){
			Object element = itr.next();
			System.out.println(element);
		}
		itr = setJavaM.iterator();
		while (itr.hasNext()){
			Object element = itr.next();
			System.out.println(element);
		}
		itr = setMovil.iterator();
		while (itr.hasNext()){
			Object element = itr.next();
			System.out.println(element);
		}

	}




}