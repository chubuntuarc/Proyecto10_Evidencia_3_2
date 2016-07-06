package com.example.arciniega.proyecto10_evidencia_3_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Layout02Activity extends AppCompatActivity {
    // Declaración de Variables
    private Button btnActivity1;
    private Button btnMain;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout02);

        btnActivity1 = (Button)findViewById(R.id.btnLayout1);
        btnMain = (Button)findViewById(R.id.btnMain);

        btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarActivity01(v);
            }
        });

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarActivityMain(v);
            }
        });
    }

    public void llamarActivity01(View view){

        intent = new Intent(this, Layout02Activity.class);
        startActivity(intent);
    }

    public void llamarActivityMain(View view){

        intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
