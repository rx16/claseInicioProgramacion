package com.example.rx16.claseinicioprogramacion;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int valor = 0;
    TextView txtValor;

    private Button buttonSumar;
    private Button buttonRestar;
    private Button buttonZooMenos;
    private Button buttonZooMas;
    private Button buttonOcultar;
    private Button buttonReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*
    //Muestreo por pantalla
        Toast.makeText(this, "ON Create se ejecuto", Toast.LENGTH_SHORT).show();
    //Muestreo por consola
        Log.i("CICLO_VIDA", "onCreate: ");
    */
        txtValor = findViewById(R.id.texViewNum);

        //Asignamos valor 0
        txtValor.setText(String.valueOf(valor));

        buttonSumar = findViewById(R.id.buttonSuma);
        buttonRestar = findViewById(R.id.buttonResta);
        buttonZooMas = findViewById(R.id.buttonZooMas);
        buttonZooMenos = findViewById(R.id.buttonZooMenos);
        buttonOcultar = findViewById(R.id.buttonOcultar);
        buttonReset = findViewById(R.id.buttonReset);

        buttonOcultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ocultar();
            }
        });
    }

    public void sumar(){
        valor++;
        txtValor.setText(String.valueOf(valor));
    }

    public void restar(View v) {
        if (valor > 0) {
            valor--;
            txtValor.setText(String.valueOf(valor));
        }
    }
    public void zoomMas(View v){
        txtValor.setTextSize(30.0f);
    }

    public void zoomMenos(View v){
        txtValor.setTextSize(10.0f);
    }

    public void ocultar(){
        txtValor.setVisibility(View.INVISIBLE);
    }

    public void reset(View v){
        txtValor.setText("0");
        txtValor.setVisibility(View.VISIBLE);
    }

    /*
    @Override
    protected void onStart() {
        super.onStart();

        //Muestreo por pantalla
        Toast.makeText(this, "ON Start se ejecuto", Toast.LENGTH_SHORT).show();
        //Muestreo por consola
        Log.i("CICLO_VIDA", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        //Muestreo por pantalla
        Toast.makeText(this, "ON Resume se ejecuto", Toast.LENGTH_SHORT).show();
        //Muestreo por consola
        Log.i("CICLO_VIDA", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        //Muestreo por pantalla
        Toast.makeText(this, "ON Restart se ejecuto", Toast.LENGTH_SHORT).show();
        //Muestreo por consola
        Log.i("CICLO_VIDA", "onRestart: ");
    }
    */
}
