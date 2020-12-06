package com.tallercmovil.formulario_ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.tallercmovil.formulario_ej1.model.Alumno;

public class MainActivity2 extends AppCompatActivity {

    TextView tvNombre, tvApellidos, tvNumCuenta, tvCarrera;
    ImageView imagCarrera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tvNombre = findViewById(R.id.tvNombre);
        tvApellidos = findViewById(R.id.tvApellidos);
        tvNumCuenta = findViewById(R.id.tvNumCuenta);
        tvCarrera = findViewById(R.id.tvCarrera);
        imagCarrera = findViewById(R.id.imgCarrera);

        Bundle bundle = getIntent().getExtras();

        Alumno alum = (Alumno )bundle.getSerializable("alumno");


        tvNombre.setText(alum.getNombre());
        tvApellidos.setText(alum.getApellidos());
        tvNumCuenta.setText(alum.getNumCuenta());
        tvCarrera.setText(alum.getCarrera());



        if(alum.getCarrera().equals("Ingeniería Aeroespacial"))
            imagCarrera.setImageResource(R.drawable.aeroespacial);
        else if (alum.getCarrera().equals("Ingeniería Civil"))
            imagCarrera.setImageResource(R.drawable.civil);
        else if (alum.getCarrera().equals("Ingeniería Geomática"))
            imagCarrera.setImageResource(R.drawable.geomatica);
        else if (alum.getCarrera().equals("Ingeniería Ambiental"))
            imagCarrera.setImageResource(R.drawable.ambiental);
        else if (alum.getCarrera().equals("Ingeniería Geofísica"))
            imagCarrera.setImageResource(R.drawable.geofisica);
        else if (alum.getCarrera().equals("Ingeniería Geológica"))
            imagCarrera.setImageResource(R.drawable.geologica);
        else if (alum.getCarrera().equals("Ingeniería Petrolera"))
            imagCarrera.setImageResource(R.drawable.petrolera);
        else if (alum.getCarrera().equals("Ingeniería de Minas y Metalurgía"))
            imagCarrera.setImageResource(R.drawable.minas);
        else if (alum.getCarrera().equals("Ingeniería en Computación"))
            imagCarrera.setImageResource(R.drawable.computacion);
        else if (alum.getCarrera().equals("Ingeniería Eléctrica Electrónica"))
            imagCarrera.setImageResource(R.drawable.electrica);
        else if (alum.getCarrera().equals("Ingeniería en Telecomunicaciones"))
            imagCarrera.setImageResource(R.drawable.telecom);
        else if (alum.getCarrera().equals("Ingeniería Industrial"))
            imagCarrera.setImageResource(R.drawable.industrial);
        else if (alum.getCarrera().equals("Ingeniería Mecatrónica"))
            imagCarrera.setImageResource(R.drawable.mecatronica);
        else if (alum.getCarrera().equals("Ingeniería en Sistemas Biomédicos"))
            imagCarrera.setImageResource(R.drawable.biomedicos);
        else if (alum.getCarrera().equals("Ingeniería en Mecánica"))
            imagCarrera.setImageResource(R.drawable.mecanica);






    }
}