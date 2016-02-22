package ieagcm.simaski.desarrollo.com.ieag_cm.fragmentos;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import ieagcm.simaski.desarrollo.com.ieag_cm.R;

/**
 * Created by sancasimiro on 15/02/16.
 */
public class FragmentIMC extends Fragment{

    private EditText txtpeso;
    private EditText txtaltura;
    private EditText txtresultado;
    private EditText txttiene;
    private TextView tvresultado;
    private String resul;

    private LinearLayout llresul;
    private LinearLayout lltiene;

    private Button btncalcular;
    private Button btnlimpiar;

    private float IMC;
    private float peso;
    private float altura;


    public FragmentIMC() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nutricion_imc, container, false);

        final Resources res = getResources();
        String texto = res.getString(R.string.tabla);
        String texto2 = res.getString(R.string.formula);

        CharSequence textoInterpretado = Html.fromHtml(texto);
        CharSequence textoInterpretado2 = Html.fromHtml(texto2);

        TextView textView = (TextView) view.findViewById(R.id.tv_intro);
        textView.setText(textoInterpretado);

        TextView textView2 = (TextView) view.findViewById(R.id.tv_formula);
        textView2.setText(textoInterpretado2);

        tvresultado = (TextView) view.findViewById(R.id.tv_resultado);

        llresul = (LinearLayout) view.findViewById(R.id.linear_resultado);
        lltiene = (LinearLayout) view.findViewById(R.id.linear_tiene);

        txtpeso = (EditText) view.findViewById(R.id.et_peso);
        txtaltura = (EditText) view.findViewById(R.id.et_altura);
        txtresultado = (EditText) view.findViewById(R.id.et_resultado);
        txttiene = (EditText) view.findViewById(R.id.et_tiene);

        btnlimpiar = (Button) view.findViewById(R.id.bt_limpiar);
        btncalcular = (Button) view.findViewById(R.id.bt_calcular);
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtpeso.getText().toString().equals("")){
                    // Toast tosat2 = Toast.makeText(getApplicationContext(),"Maldsfsdfsdf", Toast.LENGTH_SHORT ); tosat2.show();
                    CamposVacios();
                }else if(txtaltura.getText().toString().equals("")){
                    CamposVacios();
                }else {
                    //Toast tosat2 = Toast.makeText(getContext(),"Maldsfsdfsdf", Toast.LENGTH_SHORT ); tosat2.show();
                    tvresultado.setVisibility(View.VISIBLE);
                    llresul.setVisibility(View.VISIBLE);
                    lltiene.setVisibility(View.VISIBLE);
                    btnlimpiar.setVisibility(View.VISIBLE);
                    peso = Float.valueOf(txtpeso.getText().toString());
                    altura = Float.valueOf(txtaltura.getText().toString());
                    IMC = peso / ((altura * altura) / 10000);
                    resul = String.valueOf(IMC);
                    txtresultado.setText(resul);
                    if(IMC<16.00){
                        txttiene.setText("Delgadez Severa");
                    }else if(IMC>=16.00 && IMC<16.99){
                        txttiene.setText("Delgadez Moderada");
                    }else if(IMC>=17.00 && IMC<18.49){
                        txttiene.setText("Delgadez Aceptable");
                    }else if(IMC>=18.50 && IMC<24.99){
                        txttiene.setText("Peso Normal");
                    }else if(IMC>=25.00 && IMC<29.99){
                        txttiene.setText("Sobrepeso");
                    }else if(IMC>=30.00 && IMC<34.99){
                        txttiene.setText("Obesidad Tipo I");
                    }else if(IMC>=35.00 && IMC<40.00){
                        txttiene.setText("Obesidad Tipo II");
                    }else if(IMC>40.00){
                        txttiene.setText("Obesidad Tipo III");
                    }
                }
            }
        });


        btnlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    //Toast tosat2 = Toast.makeText(getContext(),"Maldsfsdfsdf", Toast.LENGTH_SHORT ); tosat2.show();
                    txtaltura.setText("");
                    txtpeso.setText("");
                    tvresultado.setVisibility(View.GONE);
                    llresul.setVisibility(View.GONE);
                    lltiene.setVisibility(View.GONE);
                    btnlimpiar.setVisibility(View.GONE);
                    txtaltura.requestFocus();
            }
        });


        return view;
    }


    public void CamposVacios(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        // Setting Dialog Title
        alertDialog.setTitle("Alerta!!!");
        // Setting Dialog Message
        alertDialog.setMessage("Uno o varios datos Obligatorios no han sido llenados.");
        // Setting Icon to Dialog
        //alertDialog.setIcon(R.drawable.delete);
        // On pressing Settings button
        alertDialog.setPositiveButton("OK!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int which) {
                dialog.cancel();
            }
        });
        // Showing Alert Message
        alertDialog.show();
    }

}