package com.example.appprueba1;

import android.app.Activity;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int ACTIVITY_TWO=1;
    private int ACTIVITY_THREE=2;
    private Button boton, botonDesc;
    private TextView texto;


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == ACTIVITY_TWO && resultCode== Activity.RESULT_OK){
            texto.setText("Has clicado: "+ data.getIntExtra("result",-1)+ " veces");
        }
        if(requestCode == ACTIVITY_THREE && resultCode== Activity.RESULT_OK){
            texto.setText("Quedan: "+ data.getIntExtra("result",-1)+ " veces");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.boton1);
        botonDesc=findViewById(R.id.boton2);
        texto = findViewById(R.id.textoInicio);
        boton.setText("Ir al contador");

        botonDesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_3.class);
                startActivityForResult(intent, ACTIVITY_THREE);
            }
        });

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivityForResult(intent, ACTIVITY_TWO);
            }
        });
    }

}

