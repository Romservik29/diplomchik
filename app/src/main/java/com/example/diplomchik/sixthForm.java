package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sixthForm extends AppCompatActivity {
    private Button exitToMenu4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_form);
        exitToMenu4 = (Button)findViewById(R.id.exitToMenu4);
        exit_form3();
    }
    private void exit_form3(){
        exitToMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(sixthForm.this,secondForm.class);
                startActivity(inte);
            }
        });
    }
}