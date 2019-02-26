package ejer_hashmap_arraylist;

import java.util.*;

/**
 *
 * @author lvaqueiroperez
 */
public class Hash2List extends ClassList {

    ClassHash miHash = new ClassHash();

    //En el constructor ya hacemos toda la conversion !!!
    //(también se podría hacer en un método)
    
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
