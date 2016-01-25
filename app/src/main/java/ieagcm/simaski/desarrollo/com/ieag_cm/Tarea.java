package ieagcm.simaski.desarrollo.com.ieag_cm;

/**
 * Created by sancasimiro on 25/01/16.
 */
public class Tarea {
    private int imagen;
    private String nombre;
    private String horas;

    public Tarea(int imagen, String nombre, String horas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVisitas() {
        return horas;
    }

    public int getImagen() {
        return imagen;
    }
}