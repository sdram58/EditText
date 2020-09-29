package com.catata.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText nombre, password;
    Button btnLogin;
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.nombreUsuario);
        password = (EditText)findViewById(R.id.password);

        nombre.setText("Paco");

        btnLogin = (Button)findViewById(R.id.button);
        cb = (CheckBox) findViewById(R.id.checkBox);

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox cb = (CheckBox)view;
                if(cb.isChecked()){
                    nombre.setError("Marcado");
                }else{
                    nombre.setError("desmarcado");
                }
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nombre.getText().toString()!=""){
                    nombre.setError("Campo Vacío");
                }
            }
        });


    }

    public void elegirOpcion(View view) {
        RadioButton rb = (RadioButton)view;

        switch (rb.getId()){
            case R.id.opcion1:{
                Log.i("RADIO", "Opcion 1");
                nombre.setText("Opcion1");
                break;
            }
            case R.id.opcion2:{
                Log.i("RADIO", "Opcion 2");
                break;
            }
        }

    }
}