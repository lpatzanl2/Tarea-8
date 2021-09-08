package Tarea_8;

public class Alumno {
    public String carnet, nombreAlm;
    public int edad;

    public Alumno(String carnet, String nombreAlm, int edad) {
        this.carnet = carnet;
        this.nombreAlm = nombreAlm;
        this.edad = edad;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombreAlm;
    }

    public void setNombre(String nombre) {
        this.nombreAlm = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
