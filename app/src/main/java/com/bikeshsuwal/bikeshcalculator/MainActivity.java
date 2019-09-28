package com.bikeshsuwal.bikeshcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bikeshsuwal.bikeshcalculator.JavaClass.Arthamatic;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etView;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnDivide, btnEquals, btnClear, btnMultiple;
    int first, second, result;
    boolean Add, Subtract, Divide, Multiple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etView = findViewById(R.id.etView);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDivide = findViewById(R.id.btnDivide);
        btnEquals = findViewById(R.id.btnEquals);
        btnClear = findViewById(R.id.btnClear);
        btnMultiple = findViewById(R.id.btnMultiple);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiple.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                etView.append("0");
                break;
            case R.id.btn1:
                etView.append("1");
                break;
            case R.id.btn2:
                etView.append("2");
                break;
            case R.id.btn3:
                etView.append("3");
                break;
            case R.id.btn4:
                etView.append("4");
                break;
            case R.id.btn5:
                etView.append("5");
                break;
            case R.id.btn6:
                etView.append("6");
                break;
            case R.id.btn7:
                etView.append("7");
                break;
            case R.id.btn8:
                etView.append("8");
                break;
            case R.id.btn9:
                etView.append("9");
                break;
            case R.id.btnAdd:
                first = Integer.parseInt(etView.getText().toString());
                Add = true;
                etView.getText().clear();
                break;
            case R.id.btnSub:
                first = Integer.parseInt(etView.getText().toString());
                Subtract = true;
                etView.getText().clear();
                break;
            case R.id.btnDivide:
                first = Integer.parseInt(etView.getText().toString());
                Divide = true;
                etView.getText().clear();
                break;
            case R.id.btnMultiple:
                first = Integer.parseInt(etView.getText().toString());
                Multiple = true;
                etView.getText().clear();
                break;
            case R.id.btnEquals:
                if (Add || Subtract || Divide || Multiple) {
                    second = Integer.parseInt(etView.getText().toString());
                    Arthamatic arthamatic = new Arthamatic(first, second);
                    if (Add) {
                        result = arthamatic.Add();
                        etView.setText(result);
                        Add = false;
                    } else if (Subtract) {
                        result = arthamatic.Subtract();
                        etView.setText(result);
                        Subtract = false;
                    } else if (Divide) {
                        result = arthamatic.Divide();
                        etView.setText(result);
                        Divide = false;
                    } else if (Multiple) {
                        result = arthamatic.Multiple();
                        etView.setText(result);
                        Multiple = false;
                    }
                }
                break;
            case R.id.btnClear:
                etView.getText().clear();
                break;
        }

    }
}
