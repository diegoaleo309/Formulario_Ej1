package com.tallercmovil.formulario_ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.tallercmovil.formulario_ej1.model.Alumno;

public class MainActivity2 extends AppCompatActivity {

    TextView tvNombre, tvApellidos, tvNumCuenta, tvCarrera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tvNombre = findViewById(R.id.tvNombre);
        tvApellidos = findViewById(R.id.tvApellidos);
        tvNumCuenta = findViewById(R.id.tvNumCuenta);
        tvCarrera = findViewById(R.id.tvCarrera);

        Bundle bundle = getIntent().getExtras();

        Alumno alum = (Alumno )bundle.getSerializable("alumno");


        tvNombre.setText(alum.getNombre());
        tvApellidos.setText(alum.getApellidos());
        tvNumCuenta.setText(alum.getNumCuenta());
        tvCarrera.setText(alum.getCarrera());



        



    }
}