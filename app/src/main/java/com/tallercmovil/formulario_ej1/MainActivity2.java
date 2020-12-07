package com.tallercmovil.formulario_ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.tallercmovil.formulario_ej1.model.Alumno;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {

    TextView tvNombre, tvApellidos, tvNumCuenta, tvCarrera, tvEdad;
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
        tvEdad = findViewById(R.id.tvEdad);

        Bundle bundle = getIntent().getExtras();

        Alumno alum = (Alumno) bundle.getSerializable("alumno");

        String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());

        int anioActual = Integer.parseInt(date.substring(0, 4));
        int mesActual = Integer.parseInt(date.substring(5, 7));
        int diaActual = Integer.parseInt(date.substring(8, 10));

        int edad = 0;

        if (anioActual > alum.getAnioNac()) {
            edad = anioActual - alum.getAnioNac() - 1;


            if (mesActual > (alum.getMesNac() + 1)) edad++;

            else if (mesActual == (alum.getMesNac() + 1)) {
                if (diaActual >= alum.getDiaNac()) edad++;
            }


        }

        tvNombre.setText(alum.getNombre());
        tvApellidos.setText(alum.getApellidos());
        tvNumCuenta.setText(alum.getNumCuenta());
        tvCarrera.setText(alum.getCarrera());
        tvEdad.setText(String.format(Locale.getDefault(), "%d", edad));


        String carrera = alum.getCarrera();

        switch (carrera) {

            case "Ingeniería Aeroespacial":
                imagCarrera.setImageResource(R.drawable.aeroespacial);
                break;

            case "Ingeniería Civil":
                imagCarrera.setImageResource(R.drawable.civil);
                break;
            case "Ingeniería Geomática":
                imagCarrera.setImageResource(R.drawable.geomatica);
                break;
            case "Ingeniería Ambiental":
                imagCarrera.setImageResource(R.drawable.ambiental);
                break;
            case "Ingeniería Geofísica":
                imagCarrera.setImageResource(R.drawable.geofisica);
                break;
            case "Ingeniería Geológica":
                imagCarrera.setImageResource(R.drawable.geologica);
                break;
            case "Ingeniería Petrolera":
                imagCarrera.setImageResource(R.drawable.petrolera);
                break;


            case "Ingeniería de Minas y Metalurgía":
                imagCarrera.setImageResource(R.drawable.minas);
                break;

            case "Ingeniería en Computación":
                imagCarrera.setImageResource(R.drawable.computacion);
                break;

            case "Ingeniería Eléctrica Electrónica":
                imagCarrera.setImageResource(R.drawable.electrica);
                break;


            case "Ingeniería en Telecomunicaciones":
                imagCarrera.setImageResource(R.drawable.telecom);
                break;
            case "Ingeniería Industrial":
                imagCarrera.setImageResource(R.drawable.industrial);
                break;

            case "Ingeniería Mecatrónica":
                imagCarrera.setImageResource(R.drawable.mecatronica);
                break;


            case "Ingeniería en Sistemas Biomédicos":
                imagCarrera.setImageResource(R.drawable.biomedicos);
                break;


            case "Ingeniería en Mecánica":
                imagCarrera.setImageResource(R.drawable.mecanica);
                break;

            case "Aerospace Engineering":
                imagCarrera.setImageResource(R.drawable.aeroespacial);
                break;
            case "Civil Engineering":
                imagCarrera.setImageResource(R.drawable.civil);
                break;
            case "Geomatics Engineering":
                imagCarrera.setImageResource(R.drawable.geomatica);
                break;
            case "Enviromental Engineering":
                imagCarrera.setImageResource(R.drawable.ambiental);
                break;
            case "Geophysical Engineering":
                imagCarrera.setImageResource(R.drawable.geofisica);
                break;
            case "Petroleum Engineering":
                imagCarrera.setImageResource(R.drawable.petrolera);
                break;
            case "Mining and Metallurgical Engineering":
                imagCarrera.setImageResource(R.drawable.minas);
                break;

            case "Computer Engineering":
                imagCarrera.setImageResource(R.drawable.computacion);
                break;

            case "Electrical And Electronics Engineering":
                imagCarrera.setImageResource(R.drawable.electrica);
                break;


            case "Telecommunications Engineering":
                imagCarrera.setImageResource(R.drawable.telecom);
                break;
            case "Mechanical Engineering":
                imagCarrera.setImageResource(R.drawable.mecanica);
                break;

            case "Industrial Engineering":
                imagCarrera.setImageResource(R.drawable.industrial);
                break;


            case "Mechatronics Engineering":
                imagCarrera.setImageResource(R.drawable.mecatronica);
                break;

            case "Biomedical Engineering":
                imagCarrera.setImageResource(R.drawable.biomedicos);
                break;




        }
    }
}