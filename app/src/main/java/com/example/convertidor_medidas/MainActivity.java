package com.example.convertidor_medidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.MathContext;
/**
 * Creado por Humberto Sebastian Valera Castro el 10.10.19.
 */
public class MainActivity extends AppCompatActivity {
    //Controles
    private EditText datoDe;
    private Spinner cDatoDe;
    private EditText datoA;
    private Spinner cDatoA;
    String datoDeStr;
    double datoDeDbl;
    Calculo cal = new Calculo();
    String[] comboLongitud = {"Kilómetro","Metro","Centímetro","Milímetro","Micrómetro","Nanómetro",
    "Milla","Yarda","Pie","Pulgada","Milla náutica"};
    ArrayAdapter llenadoCDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datoDe = findViewById(R.id.EDT_DatoDe);
        cDatoDe = findViewById(R.id.COMBO_DatoDe);
        datoA = findViewById(R.id.EDT_DatoA);
        cDatoA = findViewById(R.id.COMBO_DatoA);
        llenadoCDatos = new ArrayAdapter(this, android.R.layout.simple_spinner_item, comboLongitud);
        llenadoCDatos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        cDatoDe.setAdapter(llenadoCDatos);
        cDatoA.setAdapter(llenadoCDatos);
        cDatoA.setSelection(2);
        datoDe.setText("1");
        datoA.setText("100");
        datoDe.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                datoDeStr = datoDe.getText().toString();
                if (datoDeStr.matches("")){
                    datoA.setText("0");
                }else{
                    datoDeDbl = Double.parseDouble(datoDeStr);
                    datoA.setText(cal.Calculo(cDatoDe.getSelectedItemPosition(),cDatoA.getSelectedItemPosition(),datoDeDbl));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        /**
         *Escuchador dedicado a la hora de seleccionar una opoción en el 1er combo, para poder ejecutar el metodo
         *dedicado a la conversion de longitud.
        */
        cDatoDe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                datoDeStr = datoDe.getText().toString();
                datoDeDbl = Double.parseDouble(datoDeStr);
                datoA.setText(cal.Calculo(cDatoDe.getSelectedItemPosition(),cDatoA.getSelectedItemPosition(),datoDeDbl));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Another interface callback
            }
        });

        /**
         *Escuchador dedicado a la hora de seleccionar una opción en el 2s0 combo, para poder ejecutar el metodo
         *dedicado a la conversion de longitud.
         */
        cDatoA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                datoDeStr = datoDe.getText().toString();
                datoDeDbl = Double.parseDouble(datoDeStr);
                datoA.setText(cal.Calculo(cDatoDe.getSelectedItemPosition(),cDatoA.getSelectedItemPosition(),datoDeDbl));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Another interface callback
            }
        });
    }


}
