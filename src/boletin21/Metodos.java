package boletin21;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Metodos {
        
    public Libros crearLibros() {
        Libros x = new Libros(boletin21.PedirDatos.pedirString("Nome do Libro: "), boletin21.PedirDatos.pedirString(" Autor: "), boletin21.PedirDatos.pedirInt(" Prezo: "), boletin21.PedirDatos.pedirInt(" Unidades: "));
        return x;
    }
    
    public void amosar(ArrayList<Libros> lista) {
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
}
    public void borrarLibros(ArrayList<Libros> lista) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(" Unidades: "));
        for (int i = 0; i < lista.size(); i++) {
            if (num == lista.get(i).getUnidades());
            lista.remove(lista.get(i));
        }
    }
    public void buscarLibros(ArrayList<Libros> lista) {
        String nome = JOptionPane.showInputDialog("Titulo libro ");
        for (Libros x : lista) {
            if (nome.equals(x.getNomeLibro())) {
                System.out.println(nome + " ten como prezo " + x.getPrecio());
            } else {
                System.out.println("El Libro no aparece en nuestra base de datos");
            }
        }
    }
    public void modificarLibros(ArrayList<Libros> lista) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(" Unidades: "));
        for (int i = 0; i < lista.size(); i++) {
            if (num == lista.get(i).getPrecio());
            lista.add(lista.get(i));
        }
    }
}
