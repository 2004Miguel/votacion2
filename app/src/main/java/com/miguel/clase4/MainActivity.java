package com.miguel.clase4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nomb, cedula, nacimiento;
    Button A, B, C;

    String voto, name, id, naci;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomb = findViewById(R.id.nombre);
        cedula=findViewById(R.id.cedula);
        nacimiento = findViewById(R.id.f_nacimiento);
        A = findViewById(R.id.votacionA);
        B = findViewById(R.id.votacionB);
        C = findViewById(R.id.votacionC);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto = "A";
                name=nomb.getText().toString();
                id=cedula.getText().toString();
                naci=nacimiento.getText().toString();
                Intent enviar_datos = new Intent(MainActivity.this, Resultado.class);
                enviar_datos.putExtra("voto", voto);
                enviar_datos.putExtra("nombre", name);
                enviar_datos.putExtra("cedula", id);
                enviar_datos.putExtra("f_nacimiento", naci);
                startActivity(enviar_datos);
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto = "B";
                name=nomb.getText().toString();
                id=cedula.getText().toString();
                naci=nacimiento.getText().toString();
                Intent enviar_datos = new Intent(MainActivity.this, Resultado.class);
                enviar_datos.putExtra("voto", voto);
                enviar_datos.putExtra("nombre", name);
                enviar_datos.putExtra("cedula", id);
                enviar_datos.putExtra("f_nacimiento", naci);

                startActivity(enviar_datos);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto = "C";
                name=nomb.getText().toString();
                id=cedula.getText().toString();
                naci=nacimiento.getText().toString();
                Intent enviar_datos = new Intent(MainActivity.this, Resultado.class);
                enviar_datos.putExtra("voto", voto);
                enviar_datos.putExtra("nombre", name);
                enviar_datos.putExtra("cedula", id);
                enviar_datos.putExtra("f_nacimiento", naci);
                startActivity(enviar_datos);
            }
        });

    }

}