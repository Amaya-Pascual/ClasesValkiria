package com.example.appprueba1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private Button boton, botonSalir;
    private TextView texto;
    private int contadorClic=0;

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CURSO  ANDROID", "ONRESUME ACTIVITY2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CURSO  ANDROID", "ONSTOP ACTIVITY2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CURSO  ANDROID", "ESTOY EN ONPAUSE ACTIVITY2");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d("CURSO ANDROID", "ESTOY EN ONCREATE ACTIVITY2");
        botonSalir =findViewById(R.id.btnSalir);
        boton = findViewById(R.id.boton1);
        texto = findViewById(R.id.textoInicio);
        boton.setText("Clicame");

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorClic+=1;
                texto.setText("Boton clicado "+ contadorClic + " veces");
            }
        });
        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent= new Intent();
                returnIntent.putExtra("result",contadorClic );
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}