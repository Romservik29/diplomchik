package com.example.diplomchik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class testMain5 extends AppCompatActivity {
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main2);
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
                        switch (radioButtonValue) {
                            case "Структура": {
                                test1otvet1.setText("Ответ верный");
                                test1otvet1.setTextColor(Color.parseColor("#08FF00"));
                                integratedCounter++;
                                disableRadioGroup(rdgrp1);
                                break;
                            }
                            default: {
                                test1otvet1.setText("Ответ неверный");
                                test1otvet1.setTextColor(Color.parseColor("#FF0000"));
                                disableRadioGroup(rdgrp1);
                                break;
                            }
                        }

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
                        switch (radioButtonValue) {
                            case "Итерационная инкрементальная": {
                                test1otvet4.setText("Ответ верный");
                                test1otvet4.setTextColor(Color.parseColor("#08FF00"));
                                integratedCounter++;
                                disableRadioGroup(rdgrp4);
                                break;
                            }
                            default: {
                                test1otvet4.setText("Ответ неверный");
                                test1otvet4.setTextColor(Color.parseColor("#FF0000"));
                                disableRadioGroup(rdgrp4);
                                break;
                            }
                        }

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
                        switch (radioButtonValue) {
                            case "Многократное": {
                                test1otvet5.setText("Ответ верный");
                                test1otvet5.setTextColor(Color.parseColor("#08FF00"));
                                integratedCounter++;
                                disableRadioGroup(rdgrp5);
                                break;
                            }
                            default: {
                                test1otvet5.setText("Ответ неверный");
                                test1otvet5.setTextColor(Color.parseColor("#FF0000"));
                                disableRadioGroup(rdgrp5);
                                break;
                            }
                        }

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
                        switch (radioButtonValue) {
                            case "Гибкая": {
                                test1otvet2.setText("Ответ верный");
                                test1otvet2.setTextColor(Color.parseColor("#08FF00"));
                                integratedCounter++;
                                disableRadioGroup(rdgrp2);
                                break;
                            }
                            default: {
                                test1otvet2.setText("Ответ неверный");
                                test1otvet2.setTextColor(Color.parseColor("#FF0000"));
                                disableRadioGroup(rdgrp2);
                                break;
                            }
                        }
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
                        switch (radioButtonValue) {
                            case "V-образная": {
                                test1otvet3.setText("Ответ верный");
                                test1otvet3.setTextColor(Color.parseColor("#08FF00"));
                                integratedCounter++;
                                disableRadioGroup(rdgrp3);
                                break;
                            }
                            default: {
                                test1otvet3.setText("Ответ неверный");
                                test1otvet3.setTextColor(Color.parseColor("#FF0000"));
                                disableRadioGroup(rdgrp3);
                                break;
                            }
                        }
                        counter.incCounter(integratedCounter);
                        System.out.println("Value: " + counter.getCounter());
                        result_test.setText("Количство правильных ответов из 5: " + counter.getCounter());
                    }
                }
        );
    }
    private void exit_form(){
        exitToMenu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(testMain5.this,testSelect.class);
                startActivity(inte);
            }
        });
    }
}