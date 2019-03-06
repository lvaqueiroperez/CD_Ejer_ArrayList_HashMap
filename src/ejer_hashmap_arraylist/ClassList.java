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

    @Override
    public void putElement(String value) {

        miLista.add(value);

    }

    @Override
    public String getElement(int pos) {

        return miLista.get(pos);

    }

}
