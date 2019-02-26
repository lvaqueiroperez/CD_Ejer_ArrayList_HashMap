package ejer_hashmap_arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lvaqueiroperez
 */
public class MostrarLIst {

    public static void mostrar(ClassList lista) {
   
        System.out.println("index"+"  "+"value");   
        //hacemos la lista publica para poder acceder a ella cómodamente
        for (int i = 0; i < lista.miLista.size(); i++) {

            System.out.println(i+"  "+lista.miLista.get(i));

        }
    }

}
