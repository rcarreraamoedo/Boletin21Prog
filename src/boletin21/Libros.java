
package boletin21;

public class Libros {
    private String nomeLibro;
    private String autor;
    private int precio;
    private int unidades;

    public Libros() {
    }

    public Libros(String nomeLibro, String autor, int precio, int unidades) {
        this.nomeLibro = nomeLibro;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "nomeLibro=" + nomeLibro + ", autor=" + autor + ", precio=" + precio + ", unidades=" + unidades;
    }
    
    public int compareTo(Object o) {
        Libros x = (Libros) o;
        if (this.nomeLibro.compareToIgnoreCase(x.nomeLibro) == 0) {
            return 0;
        } else if (this.nomeLibro.compareToIgnoreCase(x.nomeLibro) > 0) {
            return 1;
        } else {
            return -1;
        }

    }
}
