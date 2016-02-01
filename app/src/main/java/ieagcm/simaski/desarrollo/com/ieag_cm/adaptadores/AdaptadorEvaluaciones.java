package ieagcm.simaski.desarrollo.com.ieag_cm.adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ieagcm.simaski.desarrollo.com.ieag_cm.R;

/**
 * Created by sancasimiro on 01/02/16.
 */
public class AdaptadorEvaluaciones extends RecyclerView.Adapter<AdaptadorEvaluaciones.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public TextView direccion;
        public TextView departamento;
        public TextView ciudad;
        public TextView telefono;

        public ViewHolder(View v) {
            super(v);
            direccion = (TextView) v.findViewById(R.id.texto_direccion);
            departamento = (TextView) v.findViewById(R.id.texto_departamento);
            ciudad = (TextView) v.findViewById(R.id.texto_ciudad);
            telefono = (TextView) v.findViewById(R.id.texto_telefono);
        }
    }


    public AdaptadorEvaluaciones() {
    }

    @Override
    public int getItemCount() {
        return Direccion.DIRECCIONES.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_lista_evaluaciones, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Direccion item = Direccion.DIRECCIONES.get(i);
        viewHolder.direccion.setText(item.numeroDireccion);
        viewHolder.departamento.setText(item.departamento);
        viewHolder.ciudad.setText(item.ciudad);
        viewHolder.telefono.setText(item.telefono);

        Higiene item1 = Higiene.HIGIENES.get(i);
        viewHolder.direccion.setText(item1.numeroHigiene);
        viewHolder.departamento.setText(item1.departamento);
        viewHolder.ciudad.setText(item1.ciudad);
        viewHolder.telefono.setText(item1.telefono);
    }

    /**
     * Modelo de datos para probar el adaptador
     */
    public static class Direccion {
        public String numeroDireccion;
        public String departamento;
        public String ciudad;
        public String telefono;

        public Direccion(String numeroDireccion, String departamento,
                         String ciudad, String telefono) {
            this.numeroDireccion = numeroDireccion;
            this.departamento = departamento;
            this.ciudad = ciudad;
            this.telefono = telefono;
        }

        public final static List<Direccion> DIRECCIONES = new ArrayList<Direccion>();

        static {
            DIRECCIONES.add(new Direccion("1er Parcial escrito", "Individual", "15%", "06/02/2016"));
            DIRECCIONES.add(new Direccion("2da evaluación", "juego didáctico/debate grupal", "20%", "27/02/2016"));
            DIRECCIONES.add(new Direccion("3er parcial Ejercicio práctico", "Pareja", "15%", "19/03/2016"));
            DIRECCIONES.add(new Direccion("Trabajo Final por E-mail", "Individual", "15%", "19/03/2016"));
            DIRECCIONES.add(new Direccion("Caja chica semanal y Entrega de Libro Diario", "Todo el grupo", "20%", "02/04/2016"));
            DIRECCIONES.add(new Direccion("Intervenciones", "Todo el grupo", "5%", "Trimestre"));
            DIRECCIONES.add(new Direccion("Asistencias", "Todo el grupo", "10%", "Trimestre"));
        }
    }

    public static class Higiene {
        public String numeroHigiene;
        public String departamento;
        public String ciudad;
        public String telefono;

        public Higiene(String numeroHigiene, String departamento,
                         String ciudad, String telefono) {
            this.numeroHigiene = numeroHigiene;
            this.departamento = departamento;
            this.ciudad = ciudad;
            this.telefono = telefono;
        }

        public final static List<Higiene> HIGIENES = new ArrayList<Higiene>();

        static {
            HIGIENES.add(new Higiene("1er Parcial escrito", "Individual", "15%", "06/02/2016"));
            HIGIENES.add(new Higiene("2da evaluación", "juego didáctico/debate grupal", "20%", "27/02/2016"));
            HIGIENES.add(new Higiene("3er parcial Ejercicio práctico", "Pareja", "15%", "19/03/2016"));
            HIGIENES.add(new Higiene("Trabajo Final por E-mail", "Individual", "15%", "19/03/2016"));
            HIGIENES.add(new Higiene("Caja chica semanal y Entrega de Libro Diario", "Todo el grupo", "20%", "02/04/2016"));
            HIGIENES.add(new Higiene("Intervenciones", "Todo el grupo", "5%", "Trimestre"));
            HIGIENES.add(new Higiene("Asistencias", "Todo el grupo", "10%", "Trimestre"));
        }
    }


}

/*PROGRAMACIÓN PERÍODO I-2016/ CONTABILIDAD BÁSICA

        Semana	Fecha	Trimestre I
        Semana 1	16-ene	Introducción / bienvenida/ Inicio Tema 1. Teoría de Contabilidad
        Semana 2	23-ene	Tema 1. Cont. Teoría de Contabilidad, PCGA
        Semana 3	30-ene	Tema 1. Cont. Teoría de Contabilidad, PCGA
        Semana 4	06-feb	1er parcial escrito, individual 15% 
        Semana 5	13-feb	Tema 2. Teoría de cuentas
        Semana 6	20-feb	Tema 2. Practica de cuentas
        Semana 7	27-feb	2da evaluación,: juego didáctico/debate grupal 20%
        Semana 8	05-mar	Teoría asientos contables de libro diario
        Semana 9	12-mar	Tema 3. Practica asientos contables de libro diario
        Semana 10	19-mar	3er parcial Ejercicio práctico en pareja 15%  /  Trabajo Final por email 15%
        Semana 11	02-abr	Caja chica semanal y Entrega de Libro Diario 20%   
        Semana 12	09-abr	EXÁMENES FINALES DE COCINA
        Trimestre	Intervenciones 5% y Asistencia 10%*/
