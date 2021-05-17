package com.example.appprueba1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_3 extends AppCompatActivity {
    private Button botonDesc, botonSalir;
    private TextView texto;
    private int cien=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        botonSalir =findViewById(R.id.btnSalir);
        botonDesc = findViewById(R.id.boton1);
        texto = findViewById(R.id.textoInicio);
        botonDesc.setText("Clicame para restar");

        botonDesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cien-=1;
                texto.setText("Quedan  "+ cien + " veces para llegar a 0");
            }
        });
        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent= new Intent();
                returnIntent.putExtra("result",cien );
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }


}