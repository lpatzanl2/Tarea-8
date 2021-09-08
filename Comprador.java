package Tarea_8;

public class Comprador {

    public double precioEstablecido = 9.99;
    public int edadEstablecida = 25;


    //Metodos para PRODUCTO
    public boolean igualQueA(Object ayuda) {
        Producto a = (Producto) ayuda;
        return precioEstablecido == a.getPrecio();
    }

    public boolean mayorQue (Object ayuda){
        Producto a = (Producto) ayuda;
        return a.getPrecio() > precioEstablecido;
    }

    public boolean menorQue (Object ayuda){
        Producto a = (Producto) ayuda;
        return a.getPrecio() < precioEstablecido;
    }

    public boolean menorigualQue (Object ayuda){
        Producto a = (Producto) ayuda;
        return a.getPrecio() <= precioEstablecido;
    }

    public boolean mayorigualQue (Object ayuda){
        Producto a = (Producto) ayuda;
        return a.getPrecio() >= precioEstablecido;
    }

    //Medotos Alumno

    public boolean igualQueAlumno (Object ayuda){
        Alumno a2 = (Alumno) ayuda;
        return a2.getEdad() == edadEstablecida;
    }

    public boolean mayorQueAlumno (Object ayuda){
        Alumno a2 = (Alumno) ayuda;
        return a2.getEdad() > edadEstablecida;
     }

    public boolean mayorigualQueAlumno (Object ayuda){
        Alumno a2 = (Alumno) ayuda;
        return a2.getEdad() >= edadEstablecida;
    }

    public boolean menorQueAlumno (Object ayuda){
        Alumno a2 = (Alumno) ayuda;
        return a2.getEdad() < edadEstablecida;
    }

    public boolean menoroigualQueAlumno (Object ayuda){
        Alumno a2 = (Alumno) ayuda;
        return a2.getEdad() <= edadEstablecida;
    }
}
