package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //creamos una instancia perteneciente a texview
        //clase context ,clase activity hereda de context (por el principio de es un)
//comentarios
        //context
        //activity
        //appConpatActivity

        //main activity extends

        //decirle a esta vista (refencia a textview) ni mas ni menos que cuales son las caracteristicas de nuestra aplicacion (referencia a this)
        TextView mitexto = new TextView(this);
        //metodo settext (establece como string el valor de l texview)
        mitexto.setText("hola hola denuevo angel");
        //mitexto.setText("hola mundo como estais");
        setContentView(mitexto);//vvista que visualizara la actividad asd dacompartir
    }
}