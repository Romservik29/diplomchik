package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seventhForm extends AppCompatActivity {
    private Button exitToMenu5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_form);
        exitToMenu5 = (Button)findViewById(R.id.exitToMenu5);
        exit_form2();
    }
    private void exit_form2(){
        exitToMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(seventhForm.this,secondForm.class);
                startActivity(inte);
            }
        });
    }
}