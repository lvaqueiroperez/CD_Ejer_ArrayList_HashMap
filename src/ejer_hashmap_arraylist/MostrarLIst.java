package ejer_hashmap_arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lvaqueiroperez
 */
public class MostrarLIst {

    public void mostrar(ArrayList<String> lista) {

        for (int i = 0; i < lista.size(); i++) {

            JOptionPane.showMessageDialog(null, lista.indexOf(i));
            
        }

    }

}
