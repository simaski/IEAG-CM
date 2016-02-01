package ieagcm.simaski.desarrollo.com.ieag_cm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import ieagcm.simaski.desarrollo.com.ieag_cm.actividades.ActividadEvalContabilidad;
import ieagcm.simaski.desarrollo.com.ieag_cm.R;

/**
 * Created by sancasimiro on 29/01/16.
 */
public class FragmentAsigContabilidad extends Fragment implements View.OnClickListener{

    public FragmentAsigContabilidad() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_asignaciones, container, false);

        CardView card = (CardView) view.findViewById(R.id.card0);
        card.setOnClickListener(this);

        CardView card1 = (CardView) view.findViewById(R.id.card1);
        card1.setOnClickListener(this);

        CardView card2 = (CardView) view.findViewById(R.id.card2);
        card2.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.card0:
                // TODO Auto-generated method stub
                //Toast.makeText(getActivity(),"Tarjeta 1",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), ActividadEvalContabilidad.class));
                break;
            case R.id.card1:
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(),"Tarjeta 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.card2:
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(),"Tarjeta 2",Toast.LENGTH_SHORT).show();
                break;
            case View.NO_ID:
            default:
                // TODO Auto-generated method stub
                break;
        }
    }
}