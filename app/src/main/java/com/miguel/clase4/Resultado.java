package com.miguel.clase4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    String voto,nombre,cedula,fecha;
    TextView name,cc,date,votacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        name = findViewById(R.id.nombre);
        cc = findViewById(R.id.cedula);
        date = findViewById(R.id.f_nacimiento);
        votacion = findViewById(R.id.voto);

        Intent recibirDatos = getIntent();
        voto = recibirDatos.getStringExtra("voto");
        nombre = recibirDatos.getStringExtra("nombre");
        cedula = recibirDatos.getStringExtra("cedula");
        fecha = recibirDatos.getStringExtra("f_nacimiento");


        name.setText(nombre);
        cc.setText(cedula);
        date.setText(fecha);
        votacion.setText(voto);

    }
}