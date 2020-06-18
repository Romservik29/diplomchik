package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondForm extends AppCompatActivity {
    private Button button_two;
    private Button button_three;
    private Button button_four;
    private Button button_five;
    private Button button_six;
    private Button button_seven;
    private Button button_eight;
    private Button temsExitToMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_form);
        button_two = (Button)findViewById(R.id.button_two);
        main_formm();
        button_three = (Button)findViewById(R.id.button_three);
        main_formmm();
        button_four = (Button)findViewById(R.id.button_four);
        main_formmmm();
        button_five = (Button)findViewById(R.id.button_five);
        main_formmmmm();
        button_six = (Button)findViewById(R.id.button_six);
        main_formmmmmm();
        button_seven = (Button)findViewById(R.id.button_seven);
        main_formmmmmmm();
        button_eight = (Button)findViewById(R.id.button_eight);
        main_formmmmmmmm();
        temsExitToMenu = (Button)findViewById(R.id.temsExitToMenu);
        main_formback();

    }
    private void main_formm() {
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(secondForm.this, thirdForm.class);
                startActivity(inte);
            }
        });
    }
    private void main_formmm(){
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(secondForm.this, fourthForm.class);
                startActivity(inte);
            }
        });
    }
    private void main_formmmm(){
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondForm.this, fifthForm.class);
                startActivity(intent);
            }
        });
    }
    private void main_formmmmm(){
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(secondForm.this, sixthForm.class);
                startActivity(intentt);
            }
        });
    }
    private void main_formmmmmm(){
        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttt = new Intent(secondForm.this, seventhForm.class);
                startActivity(intenttt);
            }
        });
    }
    private void main_formmmmmmm(){
        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentttt = new Intent(secondForm.this, eigthForm.class);
                startActivity(intentttt);
            }
        });
    }

    private void main_formmmmmmmm(){
        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttttt = new Intent(secondForm.this, ninethForm.class);
                startActivity(intenttttt);
            }
        });
    }
    private void main_formback(){
        temsExitToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttttt = new Intent(secondForm.this, testsTems.class);
                startActivity(intenttttt);
            }
        });
    }
}