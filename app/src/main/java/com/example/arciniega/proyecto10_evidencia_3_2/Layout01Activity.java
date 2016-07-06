package com.example.arciniega.proyecto10_evidencia_3_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Layout01Activity extends AppCompatActivity {
    // Declaración de Variables
    private Button btnMain;
    private Button btnActivity2;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout01);

        btnMain = (Button)findViewById(R.id.btnMain);
        btnActivity2 = (Button)findViewById(R.id.btnLayout2);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarActivityMain(v);
            }
        });

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarActivity02(v);
            }
        });
    }

    public void llamarActivity02(View view){

        intent = new Intent(this, Layout02Activity.class);
        startActivity(intent);
    }

    public void llamarActivityMain(View view){

        intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
