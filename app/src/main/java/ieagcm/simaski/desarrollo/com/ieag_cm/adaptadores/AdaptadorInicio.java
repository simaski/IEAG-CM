package ieagcm.simaski.desarrollo.com.ieag_cm.adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import ieagcm.simaski.desarrollo.com.ieag_cm.R;
import ieagcm.simaski.desarrollo.com.ieag_cm.modelo.Comida;

/**
 * Created by sancasimiro on 28/01/16.
 */
public class AdaptadorInicio extends RecyclerView.Adapter<AdaptadorInicio.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public TextView nombre;
        public TextView horas;
        public ImageView imagen;

        public ViewHolder(View v) {
            super(v);
            horas = (TextView) v.findViewById(R.id.precio_comida);
            nombre = (TextView) v.findViewById(R.id.nombre_comida);
            imagen = (ImageView) v.findViewById(R.id.miniatura_comida);
        }
    }

    public AdaptadorInicio() {
    }

    @Override
    public int getItemCount() {
        return Comida.MATERIAS.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_lista_inicio, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Comida item = Comida.MATERIAS.get(i);

        Glide.with(viewHolder.itemView.getContext())
                .load(item.getIdDrawable())
                .centerCrop()
                .into(viewHolder.imagen);
        viewHolder.horas.setText(item.getHoras());
        viewHolder.nombre.setText(item.getNombre());

    }


}