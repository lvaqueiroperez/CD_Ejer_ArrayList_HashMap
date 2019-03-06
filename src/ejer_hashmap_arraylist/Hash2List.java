package ejer_hashmap_arraylist;

import java.util.*;

/**
 * Clase que hereda de ClassList donde se crea el Adapter que convertirá los
 * HashMap en ArrayLists
 *
 * @author lvaqueiroperez
 */
public class Hash2List extends ClassList {

    ClassHash miHash = new ClassHash();

    /**
     * Método del Adapter que recibe como parámetro un elemento del tipo de la
     * Clase problemática
     *
     * @param hashAConvertir
     */
    public Hash2List(ClassHash hashAConvertir) {
        //key Set solo pasa las claves !!!!
        Iterator it = hashAConvertir.miHash.keySet().iterator();

        while (it.hasNext()) {
            //COMO HEREDA DE CLASSLIST, HEREDA TODO SUS ATRIBUTOS PUBLICOS, 
            //PUDIENDO USARLOS AQUÍ COMO SI FUERAN DE LA CLASE
            //en este ejemplo solo pasamos las claves al ArrayList !!!
            miLista.add(hashAConvertir.miHash.get(it.next()));

        }

    }

}
