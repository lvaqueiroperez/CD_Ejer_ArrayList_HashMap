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

        ClassList objL = new ClassList();

        ClassHash objH = new ClassHash();
        //poner
        objL.putElement("Hola");
        System.out.println(objL.getElement(0));

        objH.putValue(1, "Ola");
        System.out.println(objH.getValue(1));

        //mostrar
        MostrarLIst objL2 = new MostrarLIst();
        //para acceder al ArrayList directamente con su clase, tendría que ser static
        //si no, como es public, utilizando un objeto accedemos a él
       objL2.mostrar(objL.miLista);
        
    }

}
