/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author helma
 */
public class Producto implements Comparable<Producto> {

    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubro;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio, int stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return rubro;
    }

    public void setCategoria(String rubro) {
        this.rubro = rubro;
    }
//hay q reescribir el EQUALS Y EL SET 
    @Override
    public int compareTo(Producto prod) { //esto determina el orden de los componentes
        if(codigo == prod.codigo){        // y ademas dice si dos componentes son iguales
            return 0;
        }
        else if(codigo > prod.codigo){
            return 1;
        }
        else{
            return -1;
        }
    }
   
}
