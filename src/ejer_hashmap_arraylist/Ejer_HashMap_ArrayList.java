package ejer_hashmap_arraylist;

/**
 *
 * @author lvaqueiroperez
 */
public class Ejer_HashMap_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear
        ClassList miLista = new ClassList();

        ClassHash miHash = new ClassHash();

        //añadir
        //para acceder al ArrayList directamente con su clase, tendría que ser static
        //si no, como es public, utilizando un objeto accedemos a él
//        miLista.putElement("Uno");
//        miLista.putElement("Dos");
//        miLista.putElement("Tres");
//
//        //mostrar
//        MostrarLIst.mostrar(miLista.miLista);

        /*
        crear objeto hash:
        classHash miHash = new ClassHas();
        
        miHash.putValue(10,"uno);
        miHash.putValue(11,"dos);
        miHash.putValue(12,"tres);
        
        para mostrar esto, necesitariamos otro metodo diferente del que ya
        tenemos, ya que el que tenemos no funciona con HashList 
        Lo solucionaremos con un Adapter Hash2List (to)
        Y luego lo mostraremos con el mismo metodo de ClassList
        
        
        
         */
        
        miHash.putValue(10, "uno");
        miHash.putValue(11, "dos");
        miHash.putValue(12, "tres");
        
        Hash2List miHash2List = new Hash2List(miHash);
        
        MostrarLIst.mostrar(miHash2List);
        
    }

}
