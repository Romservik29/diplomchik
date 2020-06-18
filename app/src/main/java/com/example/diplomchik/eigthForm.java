package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eigthForm extends AppCompatActivity {
    private Button exitToMenu6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eigth_form);
        exitToMenu6 = (Button)findViewById(R.id.exitToMenu6);
        exit_form2();
    }
    private void exit_form2(){
        exitToMenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(eigthForm.this,secondForm.class);
                startActivity(inte);
            }
        });
    }
}