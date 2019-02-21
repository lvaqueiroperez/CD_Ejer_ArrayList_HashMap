package ejer_hashmap_arraylist;

import java.util.*;

/**
 *
 * @author lvaqueiroperez
 */
public class ClassHash implements InterfaceHash {

    private HashMap<Integer, String> miHash = new HashMap<>();

    @Override
    public void putValue(Integer key, String value) {

        miHash.put(key, value);

    }

    @Override
    public String getValue(Integer key) {

        return miHash.get(key);

    }

}
