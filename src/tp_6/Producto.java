/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_6;

/**
 *
 * @author Usuario
 */
public class Producto {
    private String Categoria;
    private String nombre;
    private int precio;

    public Producto(String Categoria, String nombre, int precio) {
        this.Categoria = Categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "Categoria=" + Categoria + '}';
    }
    
    
}
