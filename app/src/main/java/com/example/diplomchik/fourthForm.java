package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthForm extends AppCompatActivity {
    private Button exitToMenu2;
    private Button transition2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_form);
        exitToMenu2 = (Button)findViewById(R.id.exitToMenu2);
        exit_formm();
        transition2 = (Button)findViewById(R.id.transition2);
        exit_form();
    }
    private void exit_formm(){
        exitToMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(fourthForm.this,secondForm.class);
                startActivity(inte);
            }
        });
    }
    private void exit_form(){
        transition2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(fourthForm.this,testMain2.class);
                startActivity(inte);
            }
        });
    }
}
