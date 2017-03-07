import java.util.Iterator;
import java.util.Set;


/**
 * @author María Mercedes Retolaza, Carne 16339 
 *
 */
public class CollectionFram {
    Set setWeb;
    Set setJava;
    Set setMovil;

    public CollectionFram(int tipoSet){
        setWeb   = new FactoryDesarrollo().Setcall(tipoSet);
        setJava  = new FactoryDesarrollo().Setcall(tipoSet);
        setMovil = new FactoryDesarrollo().Setcall(tipoSet);
    }

    public void addSetWeb(String persona){
        setWeb.add(persona);
    }

    public void addSetJava(String persona){
        setJava.add(persona);
    }

    public void addSetMovil(String persona){
        setMovil.add(persona);
    }

    public void tresIntersecciones(){
        Iterator itr = setWeb.iterator();
        while (itr.hasNext()){
            Object element = itr.next();
            Iterator itr2 = setJava.iterator();
            while (itr2.hasNext()){
                Object elemet2 = itr2.next();
                if (element.equals(elemet2)){
                    Iterator itr3 = setMovil.iterator();
                    while(itr3.hasNext()){
                        Object element3 = itr3.next();
                        if(element.equals(element3)){
                            System.out.println(element);
                        }
                    }
                }
            }
        }
    }

    public void javaNoWeb(){
        Iterator itr = setJava.iterator();
        while (itr.hasNext()){
            Object element = itr.next();
            Iterator itr2 = setWeb.iterator();
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
        Iterator itr = setWeb.iterator();
        while (itr.hasNext()){
            Object element = itr.next();
            Iterator itr2 = setMovil.iterator();
            while(itr2.hasNext()){
                Object element2 = itr2.next();
                if(element.equals(element2)){
                    boolean exist = false;
                    Iterator itr3 = setJava.iterator();
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
        Iterator itr = setWeb.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            Iterator itr2 = setJava.iterator();
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
            Iterator itr2 = setWeb.iterator();
            boolean exist = false;
            while (itr2.hasNext()){
                Object element2 = itr2.next();
                if (element.equals(element2)){
                    exist = true;
                }
            }
            if (!exist){
                Iterator itr3 = setJava.iterator();
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
        Boolean[] existArray = new Boolean[setJava.size()];
        for(int i = 0; i < existArray.length; i++){
            existArray[i] = false;
        }
        Iterator itr = setWeb.iterator();
        int contador = 0;
        while (itr.hasNext()){
            Object element = itr.next();
            Iterator itr2 = setJava.iterator();
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
        Iterator itr = setWeb.iterator();
        while (itr.hasNext()){
            Object element = itr.next();
            System.out.println(element);
        }
        itr = setJava.iterator();
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