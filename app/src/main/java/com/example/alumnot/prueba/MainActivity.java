package com.example.alumnot.prueba;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void cambiar(View v){
        EditText nombre = (EditText) findViewById(R.id.editText);
        EditText passw = (EditText) findViewById(R.id.editText2);



        TextView nombre1 = (TextView) findViewById(R.id.textView);
        TextView nombre2 = (TextView) findViewById(R.id.textView2);


        nombre1.setText(nombre.getText());
        nombre2.setText(passw.getText());

        System.out.print("hola");




    }


}
