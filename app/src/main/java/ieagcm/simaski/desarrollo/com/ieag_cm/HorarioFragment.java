package ieagcm.simaski.desarrollo.com.ieag_cm;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by sancasimiro on 25/01/16.
 */
public class HorarioFragment extends Fragment {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    public HorarioFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_horario, container, false);

        // Inicializar Animes
        List items = new ArrayList();

        items.add(new Tarea(R.drawable.contabilidad, "Contabilidad Basica", "08:00 a 09:20 am"));
        items.add(new Tarea(R.drawable.historia, "Historia", "09:20 a 10:40 am"));
        items.add(new Tarea(R.drawable.receso, "Receso", "10:40 a 10:50 am"));
        items.add(new Tarea(R.drawable.cocina, "Cocina Basica", "10:50 a 01:30 pm"));
        items.add(new Tarea(R.drawable.receso, "Receso", "01:30 a 01:40 pm"));
        items.add(new Tarea(R.drawable.nutricion, "Nutricion", "01:40 a 02:20 pm"));
        items.add(new Tarea(R.drawable.higiene, "Higiene y Manipulacion", "02:20 a 03:00 pm"));
        items.add(new Tarea(R.drawable.ingles, "Ingles", "03:00 a 03:40 pm"));

// Obtener el Recycler
        recycler = (RecyclerView) v.findViewById(R.id.lista);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new TareaArrayAdapter(items);
        recycler.setAdapter(adapter);
        return v;

    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_clear) {
            //Limpiar todos los elementos
            adaptador.clear();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    /*public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Tarea tareaActual = (Tarea)adaptador.getItem(position);
        String msg = "Elegiste la tarea:\n"+tareaActual.getNombre()+"-"+tareaActual.getHora();
        Toast.makeText(getActivity(),msg, LENGTH_SHORT).show();

    }*/


}