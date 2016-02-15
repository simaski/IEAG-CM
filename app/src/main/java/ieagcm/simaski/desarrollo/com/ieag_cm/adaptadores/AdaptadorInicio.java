package ieagcm.simaski.desarrollo.com.ieag_cm.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import ieagcm.simaski.desarrollo.com.ieag_cm.R;
import ieagcm.simaski.desarrollo.com.ieag_cm.actividades.ActividadEvalContabilidad;
import ieagcm.simaski.desarrollo.com.ieag_cm.actividades.ActividadPrincipal;
import ieagcm.simaski.desarrollo.com.ieag_cm.modelo.Comida;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by sancasimiro on 28/01/16.
 */
public class AdaptadorInicio extends RecyclerView.Adapter<AdaptadorInicio.ViewHolder> {

    private static Context sContext;
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // Campos respectivos de un item
        public TextView nombre;
        public TextView horas;
        public ImageView imagen;
        private String mItem;
        private TextView mTextView;
        private static final String TAG = "LogsAndroid";

        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(this);
            horas = (TextView) v.findViewById(R.id.precio_comida);
            nombre = (TextView) v.findViewById(R.id.nombre_comida);
            imagen = (ImageView) v.findViewById(R.id.miniatura_comida);
        }

        public void setItem(String item) {
            mItem = item;
            mTextView.setText(item);
        }

        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick " + getAdapterPosition() + " " + mItem);

            switch (getAdapterPosition()) {
                case 0:
                    Intent intent = new Intent(view.getContext(), ActividadEvalContabilidad.class);
                    view.getContext().startActivity(intent);
                    break;
                case 1:
                    Log.d(TAG, "Historia " + getAdapterPosition() + " " + mItem);
                    break;
                case 2:
                    Log.d(TAG, "Cocina " + getAdapterPosition() + " " + mItem);
                    break;
                case 3:
                    Log.d(TAG, "Nutricion " + getAdapterPosition() + " " + mItem);
                    break;
                case 4:
                    Log.d(TAG, "Nutricion " + getAdapterPosition() + " " + mItem);
                    break;
                case 5:
                    Log.d(TAG, "Nutricion " + getAdapterPosition() + " " + mItem);
                    break;
            }
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