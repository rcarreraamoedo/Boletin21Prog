
package boletin21;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Boletin21 {


    public static void main(String[] args) {
     ArrayList<Libros> listaLibros = new ArrayList();
    int opcion;
    Metodos obx = new Metodos();
    do {
    opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU****\n 1 --> Engadir Libro\n 2 --> Amosar Libros\n 3 --> Borrar Libros\n 4 --> Buscar Libros\n 5 --> Modificar Libros"));
    switch (opcion) {
        case 1: 
            listaLibros.add(obx.crearLibros());
            break;
        case 2:
            obx.amosar(listaLibros);
            break;
        case 3:
            obx.borrarLibros(listaLibros);
            break;
        case 4:
            obx.buscarLibros(listaLibros);
            break;
        case 5:
            obx.modificarLibros(listaLibros);
            break;
    }
    } while (opcion != 6);
    }
}
