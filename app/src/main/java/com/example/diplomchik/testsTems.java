package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class testsTems extends AppCompatActivity {
    private Button tems;
    private Button tests;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests_tems);
        tems = (Button)findViewById(R.id.tems);
        major_form();
        tests = (Button)findViewById(R.id.tests);
        major_formm();
    }
    private void major_form(){
        tems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testsTems.this,secondForm.class);
                startActivity(inte);
            }
        });
    }
    private void major_formm(){
        tests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testsTems.this,testSelect.class);
                startActivity(inte);
            }
        });
    }
}
