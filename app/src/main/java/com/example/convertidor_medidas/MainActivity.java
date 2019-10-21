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
    //Variables dedicadas a la conversion de datos
    String datoDeStr;
    double datoDeDbl;
    //Se realiza instancia de la clase calculo
    Calculo cal = new Calculo();
    //Se crea arreglo dedicado a ser menu a mostrar en los spinners como opciones
    String[] comboLongitud = {"Kilómetro","Metro","Centímetro","Milímetro","Micrómetro","Nanómetro",
    "Milla","Yarda","Pie","Pulgada","Milla náutica"};
    //Se crea adaptador dedicado a llenar los combos
    ArrayAdapter llenadoCDatos;

    /**
     * Constructor de la clase
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Se define layout
        setContentView(R.layout.activity_main);
        //Se indican a que controles haran referencia
        datoDe = findViewById(R.id.EDT_DatoDe);
        cDatoDe = findViewById(R.id.COMBO_DatoDe);
        datoA = findViewById(R.id.EDT_DatoA);
        cDatoA = findViewById(R.id.COMBO_DatoA);
        //Se llena el adaptador de datos de acuerdo al arreglo establecido anteriormente
        llenadoCDatos = new ArrayAdapter(this, android.R.layout.simple_spinner_item, comboLongitud);
        llenadoCDatos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Se coloca la informacion del adaptador a ambos combos
        cDatoDe.setAdapter(llenadoCDatos);
        cDatoA.setAdapter(llenadoCDatos);
        //Se coloca por default la segunda opcion en el combo dedicado a que medida convertir
        cDatoA.setSelection(2);
        //Se colocan por default los siguientes valores en ambos editText
        datoDe.setText("1");
        datoA.setText("100");

        /**
         *Escuchador dedicado a la hora de modificar el valor del editText dedicado a recibir
         *el valor de medida a recibir.
         */
        datoDe.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            //Dedicado a ejecutar cuando se cambia texto en el respectivo editText
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Se obtiene valor de dicho editText tranformado a texto
                datoDeStr = datoDe.getText().toString();
                //Si dicho texto no contiene ningun caracter
                if (datoDeStr.matches("")){
                    //Se coloca por default el valor 0 en el editText dedicado a mostrar la conversion
                    datoA.setText("0");
                }else{
                    //Convierte a double el texto recibido
                    datoDeDbl = Double.parseDouble(datoDeStr);
                    //Se coloca el resultado de la conversion obtenido por un metodo en el editText dedicado a mostrar la conversion
                    datoA.setText(cal.Calculo(cDatoDe.getSelectedItemPosition(),cDatoA.getSelectedItemPosition(),datoDeDbl));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        /**
         *Escuchador dedicado a la hora de seleccionar una opción en el 1er combo, para poder ejecutar el metodo
         *dedicado a la conversion de longitud.
        */
        cDatoDe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Se obtiene valor de dicho editText tranformado a texto
                datoDeStr = datoDe.getText().toString();
                //Dicho texto se transforma a double
                datoDeDbl = Double.parseDouble(datoDeStr);
                //Se coloca el resultado de la conversion obtenido por un metodo en el editText dedicado a mostrar la conversion
                datoA.setText(cal.Calculo(cDatoDe.getSelectedItemPosition(),cDatoA.getSelectedItemPosition(),datoDeDbl));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Another interface callback
            }
        });

        /**
         *Escuchador dedicado a la hora de seleccionar una opción en el 2do combo, para poder ejecutar el metodo
         *dedicado a la conversion de longitud.
         */
        cDatoA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Se obtiene valor de dicho editText tranformado a texto
                datoDeStr = datoDe.getText().toString();
                //Dicho texto se transforma a double
                datoDeDbl = Double.parseDouble(datoDeStr);
                //Se coloca el resultado de la conversion obtenido por un metodo en el editText dedicado a mostrar la conversion
                datoA.setText(cal.Calculo(cDatoDe.getSelectedItemPosition(),cDatoA.getSelectedItemPosition(),datoDeDbl));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Another interface callback
            }
        });
    }


}
