package com.example.arciniega.proyecto10_evidencia_3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // Declaración de Variables
    private Button btnActivity1;
    private Button btnActivity2;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity1 = (Button)findViewById(R.id.btnLayout1);
        btnActivity2 = (Button)findViewById(R.id.btnLayout2);

        btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarActivity01(v);
            }
        });

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarActivity02(v);
            }
        });
    }

    public void llamarActivity01(View view){

        intent = new Intent(this, Layout01Activity.class);
        startActivity(intent);
    }

    public void llamarActivity02(View view){

        intent = new Intent(this, Layout02Activity.class);
        startActivity(intent);

    }
}
