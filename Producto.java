package Tarea_8;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

public class Producto{

    public int identifier;
    public String nombre;
    public double precio;


    public Producto(int identifie, String nombre, double precio){
        this.identifier = identifier;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
