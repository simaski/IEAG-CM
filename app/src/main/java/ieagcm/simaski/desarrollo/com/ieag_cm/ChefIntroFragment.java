package ieagcm.simaski.desarrollo.com.ieag_cm;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sancasimiro on 25/01/16.
 */
public class ChefIntroFragment extends Fragment {

    public ChefIntroFragment() {
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
        View v = inflater.inflate(R.layout.fragment_chef_intro, container, false);

        Resources res = getResources();
        String texto = res.getString(R.string.intro);

        CharSequence textoInterpretado = Html.fromHtml(texto);

        TextView textView = (TextView) v.findViewById(R.id.tv_intro);
        textView.setText(textoInterpretado);

        return v;

    }

}
