package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class testSelect extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button testExitToMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_select);
        button = (Button)findViewById(R.id.button);
        major_form();
        button2 = (Button)findViewById(R.id.button2);
        major_form2();
        button3 = (Button)findViewById(R.id.button3);
        major_form3();
        button4 = (Button)findViewById(R.id.button4);
        major_form4();
        button5 = (Button)findViewById(R.id.button5);
        major_form5();
        button6 = (Button)findViewById(R.id.button6);
        major_form6();
        button7 = (Button)findViewById(R.id.button7);
        major_form7();
        testExitToMenu = (Button)findViewById(R.id.testExitToMenu);
        major_form8();

    }
    private void major_form(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testSelect.this,testsMain.class);
                startActivity(inte);
            }
        });
    }
    private void major_form2(){
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testSelect.this,testMain2.class);
                startActivity(inte);
            }
        });
    }
    private void major_form3(){
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testSelect.this,testMain3.class);
                startActivity(inte);
            }
        });
    }
    private void major_form4(){
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testSelect.this,testMain4.class);
                startActivity(inte);
            }
        });
    }
    private void major_form5(){
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testSelect.this,testMain5.class);
                startActivity(inte);
            }
        });
    }
    private void major_form6(){
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testSelect.this,testMain6.class);
                startActivity(inte);
            }
        });
    }
    private void major_form7(){
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testSelect.this,testMain7.class);
                startActivity(inte);
            }
        });
    }
    private void major_form8(){
        testExitToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testSelect.this,testsTems.class);
                startActivity(inte);
            }
        });
    }
}
