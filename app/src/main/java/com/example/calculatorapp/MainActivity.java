package com.example.calculatorapp;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private enum OPERATOR
    {
        PLUS, MINUS, DIVIDE, MULTIPLY, EQUAL
    }

    private Button btnNumber0;
    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnFctResult;

    private String currentNumber;
    private String firstNumber;
    private String secondNumber;
    private OPERATOR operator;
    private float result;

    private TextView txtViewResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        currentNumber = "";
        result = 0;

        txtViewResult = findViewById((R.id.txtViewResult));

        findViewById(R.id.btnNumber0).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnNumber1).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnNumber2).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnNumber3).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnNumber4).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnNumber5).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnNumber6).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnNumber7).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnNumber8).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnNumber9).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnFctDivision).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnFctMinus).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnFctMultiplication).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnFctPlus).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnFctResult).setOnClickListener(MainActivity.this);

//        btnNumber0 = (Button) findViewById(R.id.btnNumber0);
//        btnNumber1 = (Button) findViewById(R.id.btnNumber1);
//        btnNumber2 = (Button) findViewById(R.id.btnNumber2);
//        btnNumber3 = (Button) findViewById(R.id.btnNumber3);
//        btnNumber4 = (Button) findViewById(R.id.btnNumber4);
//        btnNumber5 = (Button) findViewById(R.id.btnNumber5);
//        btnNumber6 = (Button) findViewById(R.id.btnNumber6);
//        btnNumber7 = (Button) findViewById(R.id.btnNumber7);
//        btnNumber8 = (Button) findViewById(R.id.btnNumber8);
//        btnNumber9 = (Button) findViewById(R.id.btnNumber9);
//
//
//        btnNumber0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = txtViewResult.getText() + "" + btnNumber0.getText();
//                txtViewResult.setText(txt);
//            }
//        });
//
//        btnNumber1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = txtViewResult.getText() + "" + btnNumber1.getText();
//                txtViewResult.setText(txt);
//            }
//        });
//
//        btnNumber2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = txtViewResult.getText() + "" + btnNumber2.getText();
//                txtViewResult.setText(txt);
//            }
//        });
//
//        btnNumber3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = txtViewResult.getText() + "" + btnNumber3.getText();
//                txtViewResult.setText(txt);
//            }
//        });
//
//        btnNumber4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = txtViewResult.getText() + "" + btnNumber4.getText();
//                txtViewResult.setText(txt);
//            }
//        });
//
//        btnNumber5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = txtViewResult.getText() + "" + btnNumber5.getText();
//                txtViewResult.setText(txt);
//            }
//        });
//
//        btnNumber6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = txtViewResult.getText() + "" + btnNumber6.getText();
//                txtViewResult.setText(txt);
//            }
//        });
//
//        btnNumber7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = txtViewResult.getText() + "" + btnNumber7.getText();
//                txtViewResult.setText(txt);
//            }
//        });
//
//        btnNumber8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = txtViewResult.getText() + "" + btnNumber8.getText();
//                txtViewResult.setText(txt);
//            }
//        });
//
//        btnNumber9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = txtViewResult.getText() + "" + btnNumber9.getText();
//                txtViewResult.setText(txt);
//            }
//        });
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnNumber0:
                numberIsTapped(0);
                break;

            case R.id.btnNumber1:
                numberIsTapped(1);
                break;

            case R.id.btnNumber2:
                numberIsTapped(2);
                break;

            case R.id.btnNumber3:
                numberIsTapped(3);
                break;

            case R.id.btnNumber4:
                numberIsTapped(4);
                break;

            case R.id.btnNumber5:
                numberIsTapped(5);
                break;

            case R.id.btnNumber6:
                numberIsTapped(6);
                break;

            case R.id.btnNumber7:
                numberIsTapped(7);
                break;

            case R.id.btnNumber8:
                numberIsTapped(8);
                break;

            case R.id.btnNumber9:
                numberIsTapped(9);
                break;

            case R.id.btnFctDivision:
                operatorIsTapped(OPERATOR.DIVIDE);
                break;

            case R.id.btnFctMinus:
                operatorIsTapped(OPERATOR.MINUS);
                break;

            case R.id.btnFctMultiplication:
                operatorIsTapped(OPERATOR.MULTIPLY);
                break;

            case R.id.btnFctPlus:
                operatorIsTapped(OPERATOR.PLUS);
                break;

            case R.id.btnFctResult:
                operatorIsTapped(OPERATOR.EQUAL);
                break;
        }
    }

    public void numberIsTapped(int number)
    {
        currentNumber = currentNumber + String.valueOf(number);
        txtViewResult.setText(currentNumber);
    }

    public void operatorIsTapped(OPERATOR currentOperator)
    {
        if (operator != null)
        {
            if (currentNumber != "")
            {
                secondNumber = currentNumber;
                currentNumber = "";

                switch (currentOperator) {
                    case PLUS:
                        result = Float.parseFloat(firstNumber) + Float.parseFloat(secondNumber);
                        break;

                    case MINUS:
                        result = Float.parseFloat(firstNumber) - Float.parseFloat(secondNumber);
                        break;

                    case DIVIDE:
                        result = Float.parseFloat(firstNumber) / Float.parseFloat(secondNumber);
                        break;

                    case MULTIPLY:
                        result = Float.parseFloat(firstNumber) * Float.parseFloat(secondNumber);
                        break;
                }

                firstNumber = String.valueOf(result);
                txtViewResult.setText(String.valueOf(result));
            }
        }
        else
        {
            firstNumber = currentNumber;
            currentNumber = "";
        }


        operator = currentOperator;
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
