package ejer_hashmap_arraylist;

import java.util.*;

/**
 * Clase que implementa la Interfaz List, crea un ArrayList y define los métodos
 *
 * @author lvaqueiroperez
 */
public class ClassList implements InterfaceList {

    //hacemos el ArrayList público para poder usarlo en otras clases
    public ArrayList<String> miLista = new ArrayList<String>();

    /**
     * Método para añadir un nuevo elemento al ArrayList
     *
     * @param value recibe el valor a añadir
     */
    @Override
    public void putElement(String value) {

        miLista.add(value);

    }

    /**
     * Método para retornar un valor del ArrayList según su posición
     *
     * @param pos recibe la posición
     * @return retorna el valor del ArrayList en esa posición
     */
    @Override
    public String getElement(int pos) {

        return miLista.get(pos);

    }

}
