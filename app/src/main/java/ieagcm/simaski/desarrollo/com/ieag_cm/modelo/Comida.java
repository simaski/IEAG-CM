package ieagcm.simaski.desarrollo.com.ieag_cm.modelo;

import java.util.ArrayList;
import java.util.List;

import ieagcm.simaski.desarrollo.com.ieag_cm.R;

/**
 * Created by sancasimiro on 28/01/16.*/
 public class Comida {
 private float precio;
 private String nombre;
 private int idDrawable;

 public Comida(float precio, String nombre, int idDrawable) {
 this.precio = precio;
 this.nombre = nombre;
 this.idDrawable = idDrawable;
 }

 public static final List<Comida> COMIDAS_POPULARES = new ArrayList<Comida>();
 public static final List<Comida> BEBIDAS = new ArrayList<>();
 public static final List<Comida> POSTRES = new ArrayList<>();
 public static final List<Comida> PLATILLOS = new ArrayList<>();

 static {
 COMIDAS_POPULARES.add(new Comida(5, "Camarones Tismados", R.drawable.camarones));
 COMIDAS_POPULARES.add(new Comida(3.2f, "Rosca Herbárea", R.drawable.rosca));
 COMIDAS_POPULARES.add(new Comida(12f, "Sushi Extremo", R.drawable.sushi));
 COMIDAS_POPULARES.add(new Comida(9, "Sandwich Deli", R.drawable.sandwich));
 COMIDAS_POPULARES.add(new Comida(34f, "Lomo De Cerdo Austral", R.drawable.lomo_cerdo));
 }

 public float getPrecio() {
 return precio;
 }

 public String getNombre() {
 return nombre;
 }

 public int getIdDrawable() {
 return idDrawable;
 }
 }