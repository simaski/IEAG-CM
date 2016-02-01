package ieagcm.simaski.desarrollo.com.ieag_cm.actividades;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ieagcm.simaski.desarrollo.com.ieag_cm.R;
import ieagcm.simaski.desarrollo.com.ieag_cm.adaptadores.AdaptadorEvaluaciones;
import ieagcm.simaski.desarrollo.com.ieag_cm.ui.DecoracionLineaDivisoria;

/**
 * Created by sancasimiro on 01/02/16.
 */
public class ActividadEvalHigiene extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eval_contabilidad);

        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.contenedor_evaluaciones, new FragmentoConfiguracion());
        ft.commit();

        /*FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.contenedor_evaluaciones, new FragmentoConfiguracion());
        ft.commit();*/

        agregarToolbar();
    }

    private void agregarToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static class FragmentoConfiguracion extends Fragment {

        private LinearLayoutManager linearLayout;

        public FragmentoConfiguracion() {

        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_grupo_items, container, false);

            RecyclerView reciclador = (RecyclerView) view.findViewById(R.id.reciclador);
            linearLayout = new LinearLayoutManager(getActivity());
            reciclador.setLayoutManager(linearLayout);

            AdaptadorEvaluaciones adaptador = new AdaptadorEvaluaciones();
            reciclador.setAdapter(adaptador);
            reciclador.addItemDecoration(new DecoracionLineaDivisoria(getActivity()));

            return view;
        }

    }
}