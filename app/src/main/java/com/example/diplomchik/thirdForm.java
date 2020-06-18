package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdForm extends AppCompatActivity {
    private Button exitToMenu;
    private Button transition1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_form);
        exitToMenu = (Button)findViewById(R.id.exitToMenu);
        exit_form();
        transition1 = (Button)findViewById(R.id.transition1);
        exit_form2();
    }
    private void exit_form(){
        exitToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(thirdForm.this,secondForm.class);
                startActivity(inte);
            }
        });
    }
    private void exit_form2(){
        transition1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(thirdForm.this,testsMain.class);
                startActivity(inte);
            }
        });
    }
}
