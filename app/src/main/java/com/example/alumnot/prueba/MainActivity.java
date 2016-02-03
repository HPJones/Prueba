package com.example.alumnot.prueba;

import android.app.Activity;
import android.content.Intent;
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


        Intent i = new Intent(MainActivity.this,actividad2.class);

        i.putExtra("nombre",nombre.getText().toString());
        i.putExtra("passd",passw.getText().toString());
        startActivity(i);

    }




}
