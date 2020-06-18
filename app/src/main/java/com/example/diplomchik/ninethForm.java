package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ninethForm extends AppCompatActivity {
    private Button exitToMenu7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineth_form);
        exitToMenu7 = (Button)findViewById(R.id.exitToMenu7);
        exit_form2();
    }
    private void exit_form2(){
        exitToMenu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(ninethForm.this,secondForm.class);
                startActivity(inte);
            }
        });
    }
}
