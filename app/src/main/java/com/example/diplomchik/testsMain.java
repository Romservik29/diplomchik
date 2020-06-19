package com.example.diplomchik;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class testsMain extends AppCompatActivity {
    private RadioGroup rdgrp1;
    private Button btn_check1;
    private TextView test1otvet1;
    private int integratedCounter = 0;
    private RadioGroup rdgrp2;
    private Button btn_check2;
    private TextView test1otvet2;
    private RadioGroup rdgrp3;
    private Button btn_check3;

    private TextView test1otvet3;
    private RadioGroup rdgrp4;
    private Button btn_check4;
    private TextView test1otvet4;
    private TextView result_test;
    private global_varueble counter;
    private RadioGroup rdgrp5;
    private Button btn_check5;
    private TextView test1otvet5;
    private Button exitToMenu8;
    public ArrayList answers = new ArrayList();
    private  static  final  String TAG = "testsMain";

    private  FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference answersRef = db.document("/answers/test1");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tests_main);
        btn_check1 = (Button)(findViewById(R.id.btn_check1));
        rdgrp1 = (RadioGroup)(findViewById(R.id.rdgrp1));
        test1otvet1 = (TextView)(findViewById(R.id.test1otvet1));
        checkButton1();
        btn_check2 = (Button)(findViewById(R.id.btn_check2));
        rdgrp2 = (RadioGroup)(findViewById(R.id.rdgrp2));
        test1otvet2 = (TextView)(findViewById(R.id.test1otvet2));
        checkButton2();
        btn_check3 = (Button)(findViewById(R.id.btn_check3));
        rdgrp3 = (RadioGroup)(findViewById(R.id.rdgrp3));
        test1otvet3 = (TextView)(findViewById(R.id.test1otvet3));
        btn_check4 = (Button)(findViewById(R.id.btn_check4));
        rdgrp4 = (RadioGroup)(findViewById(R.id.rdgrp4));
        test1otvet4 = (TextView)(findViewById(R.id.test1otvet4));
        checkButton4();
        btn_check5 = (Button)(findViewById(R.id.btn_check5));
        rdgrp5 = (RadioGroup)(findViewById(R.id.rdgrp5));
        test1otvet5 = (TextView)(findViewById(R.id.test1otvet5));
        checkButton5();
        exitToMenu8 = (Button)(findViewById(R.id.exitToMenu8));
        exit_form();
        counter = ((global_varueble)getApplicationContext());
        result_test= (TextView) findViewById(R.id.result_view);
        checkButton3();
    }
    public void disableRadioGroup(RadioGroup group)
    {
        for (int i = 0; i<group.getChildCount(); i++)
        {
            RadioButton btn = (RadioButton)group.getChildAt(i);
            btn.setEnabled(false);
        }
    }

    public void checkButton1() {
        btn_check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final int checkedRadioButtonId = rdgrp1.getCheckedRadioButtonId();
                        RadioButton selectedBtn = (RadioButton) findViewById(checkedRadioButtonId);
                        String radioButtonValue = selectedBtn.getText().toString();
                        disableRadioGroup(rdgrp1);
                        answers.add(radioButtonValue);
                        }

                    }
                
        );
    }
    public void checkButton4() {
        btn_check4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final int checkedRadioButtonId = rdgrp4.getCheckedRadioButtonId();
                        RadioButton selectedBtn = (RadioButton) findViewById(checkedRadioButtonId);
                        String radioButtonValue = selectedBtn.getText().toString();
                        disableRadioGroup(rdgrp4);
                        answers.add(radioButtonValue);
                        Toast.makeText(testsMain.this, (String)answers.get(1)  ,Toast.LENGTH_SHORT).show();
                     }
                }
        );
    }
    public void checkButton5() {
        btn_check5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final int checkedRadioButtonId = rdgrp5.getCheckedRadioButtonId();
                        RadioButton selectedBtn = (RadioButton) findViewById(checkedRadioButtonId);
                        String radioButtonValue = selectedBtn.getText().toString();
                        disableRadioGroup(rdgrp5);     
                        answers.add(radioButtonValue);
                    }
                }
        );
    }
    public void checkButton2() {
        btn_check2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final int checkedRadioButtonId = rdgrp2.getCheckedRadioButtonId();
                        RadioButton selectedBtn = (RadioButton) findViewById(checkedRadioButtonId);
                        String radioButtonValue = selectedBtn.getText().toString();
                        answers.add(radioButtonValue);
                        Toast.makeText(testsMain.this, (String)answers.get(3)  ,Toast.LENGTH_SHORT).show();
                        disableRadioGroup(rdgrp2);
                    }
                }
        );
    }

    public void checkButton3() {
        btn_check3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final int checkedRadioButtonId = rdgrp3.getCheckedRadioButtonId();
                        RadioButton selectedBtn = (RadioButton) findViewById(checkedRadioButtonId);
                        String radioButtonValue = selectedBtn.getText().toString();
                        answers.add(radioButtonValue);
                        disableRadioGroup(rdgrp3);

                        answersRef.get()
                        .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                  DocumentSnapshot document = task.getResult();
                                  int countCorrectAnswers = 0;
                                  List<String> group = (List<String>) document.get("answers");
                                  for(int i =0;i<5;i++){
                                      String a =  group.get(i);
                                      String b = (String) answers.get(i);
                                      if(a.equals(b)) {countCorrectAnswers++;};
                                  }
                                Toast.makeText(testsMain.this, ""+countCorrectAnswers  ,Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                            Toast.makeText(testsMain.this, "Что-то пошло не так!"  ,Toast.LENGTH_SHORT).show();
                            }
                        });    
                    }
                }
        );
    }
    private void exit_form(){
        exitToMenu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testsMain.this,testSelect.class);
                startActivity(inte);
            }
        });
    }
}