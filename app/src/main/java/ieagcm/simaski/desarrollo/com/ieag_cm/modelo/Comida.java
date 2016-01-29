package ieagcm.simaski.desarrollo.com.ieag_cm.modelo;

import java.util.ArrayList;
import java.util.List;

import ieagcm.simaski.desarrollo.com.ieag_cm.R;

/**
 * Created by sancasimiro on 28/01/16.*/
public class Comida {
    private String horas;
    private String nombre;
    private int idDrawable;

    public Comida(String nombre, String horas, int idDrawable) {
        this.nombre = nombre;
        this.horas = horas;
        this.idDrawable = idDrawable;
    }

    public static final List<Comida> MATERIAS = new ArrayList<Comida>();
    public static final List<Comida> BEBIDAS = new ArrayList<>();
    public static final List<Comida> POSTRES = new ArrayList<>();
    public static final List<Comida> PLATILLOS = new ArrayList<>();

    static {
        MATERIAS.add(new Comida("Contabilidad Basica", "Desde: 08:00am a 09:20am", R.drawable.camarones));
        MATERIAS.add(new Comida("Historia", "Desde: 09:20am a 10:40am", R.drawable.rosca));
        MATERIAS.add(new Comida("Cocina Basica", "Desde: 10:50am a 01:30pm", R.drawable.sushi));
        MATERIAS.add(new Comida("Nutricion", "Desde: 01:40pm a 02:20pm", R.drawable.sandwich));
        MATERIAS.add(new Comida("Higiene", "Desde: 02:20am a 03:00pm", R.drawable.lomo_cerdo));
        MATERIAS.add(new Comida("Ingles", "Desde: 03:00pm a 03:40pm", R.drawable.cafe));
    }

    public String getHoras() {
        return horas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}