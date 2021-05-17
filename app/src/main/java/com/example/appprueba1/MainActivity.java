package com.example.appprueba1;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int ACTIVITY_TWO=1;
    private Button boton;
    private TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.boton1);
        texto = findViewById(R.id.textoInicio);
        boton.setText("Ir al contador");
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivityForResult(intent, ACTIVITY_TWO);
            }
        });
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
       super.onActivityResult(requestCode,resultCode,data);
       if(requestCode == ACTIVITY_TWO){
           texto.setText("Has clicado: "+ resultCode+ " veces");
       }

    }
}

