package ieagcm.simaski.desarrollo.com.ieag_cm.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ieagcm.simaski.desarrollo.com.ieag_cm.R;

/**
 * Created by sancasimiro on 29/01/16.
 */
public class FragmentAsigContabilidad extends Fragment {

    public FragmentAsigContabilidad() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_asignaciones, container, false);
    }
}