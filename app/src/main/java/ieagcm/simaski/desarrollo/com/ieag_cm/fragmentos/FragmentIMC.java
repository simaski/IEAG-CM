package ieagcm.simaski.desarrollo.com.ieag_cm.fragmentos;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import ieagcm.simaski.desarrollo.com.ieag_cm.R;

/**
 * Created by sancasimiro on 15/02/16.
 */
public class FragmentIMC extends Fragment{

    public FragmentIMC() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nutricion_imc, container, false);

        Resources res = getResources();
        String texto = res.getString(R.string.tabla);

        CharSequence textoInterpretado = Html.fromHtml(texto);

        TextView textView = (TextView) view.findViewById(R.id.tv_intro);
        textView.setText(textoInterpretado);


        return view;
    }


}