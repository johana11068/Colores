package com.example.aula7.colores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private String name = "johana";
    //float numero = 0.2f;

    TextView textViewName;
    Button buttonOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cual es el primer metodo que se ejecuta en un mainActivity = onCreate
        // R = entrar recursos de app
        textViewName = (TextView) findViewById(R.id.id_tv_name);//ref a los objetos
        buttonOpen = (Button) findViewById(R.id.id_btn_open);

        buttonOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewName.setText("Johana Romero");
                Toast.makeText(MainActivity.this, "Hola Mundo", Toast.LENGTH_SHORT).show();//msn alerta
            }
        });
    }
}
