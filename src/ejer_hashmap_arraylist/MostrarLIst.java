package ejer_hashmap_arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase principal creada para mostrar por pantalla los ArrayList
 *
 * @author lvaqueiroperez
 */
public class MostrarLIst {

    /**
     * Método que muestra un ArrayList introducido como parámetro de la clase
     * ClassList
     *
     * @param lista
     */
    public static void mostrar(ClassList lista) {

        System.out.println("index" + "  " + "value");
        //hacemos la lista publica para poder acceder a ella cómodamente
        for (int i = 0; i < lista.miLista.size(); i++) {

            System.out.println(i + "  " + lista.miLista.get(i));

        }
    }

}
