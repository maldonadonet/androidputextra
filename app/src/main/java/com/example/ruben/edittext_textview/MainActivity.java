package com.example.ruben.edittext_textview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button accion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciar elementos
       input = (EditText)findViewById(R.id.input);
       accion = (Button)findViewById(R.id.boton);

        //Crear los listener
       accion.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String dato;
               dato = input.getText().toString();
               Intent intent = new Intent(MainActivity.this,Informe.class);
               intent.putExtra("DATO",dato);
               startActivity(intent);

           }
       });
    }
}
