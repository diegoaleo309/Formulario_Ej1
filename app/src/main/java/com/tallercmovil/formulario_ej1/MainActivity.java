package com.tallercmovil.formulario_ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import com.tallercmovil.formulario_ej1.model.Alumno;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText etNombre, etApellidos, etNumCuenta;


    Spinner spinner;
    DatePicker dateP;
    String carrera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etNumCuenta = findViewById(R.id.etNumCuenta);
        dateP = findViewById(R.id.datePicker1);

        spinner =  findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.carreras, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);




    }

    public void clic(View view) {

        if (validacion()) {

            Intent intent = new Intent(this, MainActivity2.class);
            Alumno alum = new Alumno(etNombre.getText().toString(), etApellidos.getText().toString(), etNumCuenta.getText().toString(), dateP.getDayOfMonth(),dateP.getMonth() ,dateP.getYear() , carrera);
            Bundle bundle = new Bundle();
            bundle.putSerializable("alumno", alum);
            intent.putExtras(bundle);
            startActivity(intent);

        }
    }

    public boolean validacion (){

        if (etNombre.getText().toString().equals("")){

            etNombre.setError("Se requiere un nombre");
            return false;

        }

        if (etApellidos.getText().toString().equals("")){

            etApellidos.setError("Se requiere los apellidos");
            return false;

        }


        if (etNumCuenta.getText().toString().equals("") || etNumCuenta.getText().toString().length()<9){

            etNumCuenta.setError("Se requiere un numero de cuenta de 9 dígitos");
            return false;
        }

        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        carrera =  (String)parent.getItemAtPosition(position);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}