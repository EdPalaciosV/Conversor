package com.example.usuario.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class conversor extends AppCompatActivity {

    EditText ETcampoPeso,ETcampoDolar;
    Button btnConvertir;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_disenio);


        //se enlazan las vistas como se muestra abajo
        ETcampoPeso=findViewById(R.id.campoPeso);
        ETcampoDolar=findViewById(R.id.campoDolar);

        btnConvertir=findViewById(R.id.btn);

        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),ETcampoPeso.getText().toString(),Toast.LENGTH_LONG)
                        .show();
            }
        });




    }
}
