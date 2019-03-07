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

    /**
     * Método para introducir un nuevo campo en el HashMap creado (key,value)
     *
     * @param key recibe la clave
     * @param value recibe el valor
     */
    @Override
    public void putValue(Integer key, String value) {

        miHash.put(key, value);

    }

    /**
     * Método para retornar el campo del HashMap especificado por la clave
     * puesta como parámetro de entrada
     *
     * @param key recibe la clave a buscar
     * @return retorna el valor de esa clave
     */
    @Override
    public String getValue(Integer key) {

        return miHash.get(key);

    }

}
