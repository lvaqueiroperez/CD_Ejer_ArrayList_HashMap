package ejer_hashmap_arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lvaqueiroperez
 */
public class MostrarLIst {

    public void mostrar(ArrayList<String> lista) {

        //hacemos la lista publica para poder acceder a ella cómodamente
        //podemos crear un ArrayList adicional donde meter el index y el
        //valor del arraylist como parte de un objeto (arraylist de objetos??)
        JOptionPane.showMessageDialog(null, lista);

    }

}
