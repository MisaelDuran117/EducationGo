package com.example.proyectoeducationgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button registro;
    private Button iniciarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registro=(Button)findViewById(R.id.registro);
        registro.setOnClickListener(this);

        iniciarSesion=(Button)findViewById(R.id.Login);
        iniciarSesion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.registro:
                Intent intent= new Intent(this,Registro.class);
                startActivity(intent);
            break;
            case R.id.Login:
                Intent intent2= new Intent(this,Principal.class);
                startActivity(intent2);
                break;
    }
    }

}