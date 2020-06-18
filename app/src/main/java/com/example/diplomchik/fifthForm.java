package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fifthForm extends AppCompatActivity {
    private Button exitToMenu3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_form);
        exitToMenu3 = (Button)findViewById(R.id.exitToMenu3);
        exit_form2();
    }
    private void exit_form2(){
        exitToMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(fifthForm.this,secondForm.class);
                startActivity(inte);
            }
        });
    }
}
