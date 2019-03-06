package ejer_hashmap_arraylist;

import java.util.*;

/**
 * Clase que implementa la Interfaz Hash, crea un HashMap y define los métodos
 *
 * @author lvaqueiroperez
 */
public class ClassHash implements InterfaceHash {

    //hacemos el hashmap public para poder usarlo en otras clases
    public HashMap<Integer, String> miHash = new HashMap<>();

    @Override
    public void putValue(Integer key, String value) {

        miHash.put(key, value);

    }

    @Override
    public String getValue(Integer key) {

        return miHash.get(key);

    }

}
