package com.example.ruben.edittext_textview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Informe extends AppCompatActivity {
    TextView tfinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe);

        //Instancia de los objetos
        tfinal = (TextView) findViewById(R.id.respuesta);

        //Creamos los eventos
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            String respuesta = (String) bundle.get("DATO");
            tfinal.setText(respuesta);
        }
    }
}
