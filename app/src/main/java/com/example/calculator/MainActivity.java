package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView calculation, result; /* Calculation view and result view */
    private String current, res;          /* current variable and res variable ~ char current on calculation and result after calculating */
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9; /* 10 buttons ~ number 0 -> 9 */
    private Button btnAC, btnDel, btnDivide, btnMinus, btnMultiply, btnPlus, btnEquals, btnDot; /* 4 operator buttons, button Dot (.) and button Equals (=) */
    private boolean dot_inserted = false, operator_inserted; /* flag dot_inserted and operator_inserted to check char dot and operator existed? */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        current = "";
        res = "";
        dot_inserted = false;
        operator_inserted = false;

        calculation = findViewById(R.id.calculation);
        result = findViewById(R.id.result);

        btn0 = findViewById(R.id.button_0);
        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);
        btn3 = findViewById(R.id.button_3);
        btn4 = findViewById(R.id.button_4);
        btn5 = findViewById(R.id.button_5);
        btn6 = findViewById(R.id.button_6);
        btn7 = findViewById(R.id.button_7);
        btn8 = findViewById(R.id.button_8);
        btn9 = findViewById(R.id.button_9);

        btnDel = findViewById(R.id.button_Del);
        btnAC = findViewById(R.id.button_AC);

        btnPlus = findViewById(R.id.button_plus);
        btnMinus = findViewById(R.id.button_minus);
        btnMultiply = findViewById(R.id.button_multiply);
        btnDivide = findViewById(R.id.button_divide);
        btnDot = findViewById(R.id.button_dot);
        btnEquals = findViewById(R.id.button_equal);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = current + "0";
                displayOne();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = current + "1";
                displayOne();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = current + "2";
                displayOne();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = current + "3";
                displayOne();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = current + "4";
                displayOne();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = current + "5";
                displayOne();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = current + "6";
                displayOne();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = current + "7";
                displayOne();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = current + "8";
                displayOne();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = current + "9";
                displayOne();
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
                displayOne();
                displayTwo();
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backspace();
                displayOne();
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // check if its empty => append "0." and set dot_inserted variable to true
                if (current.isEmpty()) {
                    current = "0.";
                    dot_inserted = true;
                }

                // check if dot_inserted == false => append "."
                if (dot_inserted == false) {
                    current = current + ".";
                    dot_inserted = true;
                }
                displayOne();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set dot_inserted = false
                dot_inserted = false;

                // check if current is not empty
                if (!current.isEmpty()) {
                    // check if the last digit is dot => remove
                    if (current.substring(current.length() - 1, current.length()).equals(".")){
                        backspace();
                    }
                }

                // check if operator_inserted == false => append operator to current
                if (operator_inserted == false) {
                    current = current + " ÷ ";
                    operator_inserted = true;
                }
                displayOne();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set dot_inserted = false
                dot_inserted = false;

                // check if current is not empty
                if (!current.isEmpty()) {
                    // check if the last digit is dot => remove
                    if (current.substring(current.length() - 1, current.length()).equals(".")){
                        backspace();
                    }
                }

                // check if operator_inserted == false => append operator to current
                if (operator_inserted == false) {
                    current = current + " x ";
                    operator_inserted = true;
                }
                displayOne();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set dot_inserted = false
                dot_inserted = false;

                // check if current is not empty
                if (!current.isEmpty()) {
                    // check if the last digit is dot => remove
                    if (current.substring(current.length() - 1, current.length()).equals(".")){
                        backspace();
                    }
                }

                // check if operator_inserted == false => append operator to current
                if (operator_inserted == false) {
                    current = current + " – ";
                    operator_inserted = true;
                }
                displayOne();
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set dot_inserted = false
                dot_inserted = false;

                // check if current is not empty
                if (!current.isEmpty()) {
                    // check if the last digit is dot => remove
                    if (current.substring(current.length() - 1, current.length()).equals(".")){
                        backspace();
                    }
                }

                // check if operator_inserted == false => append operator to current
                if (operator_inserted == false) {
                    current = current + " + ";
                    operator_inserted = true;
                }
                displayOne();
            }
        });


        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // check if the last digit is not an operator
                if (operator_inserted == true && !current.substring(current.length()-1, current.length()).equals(" ")) {
                    String [] tokens = current.split(" ");

                    switch (tokens[1].charAt(0)) {
                        case '+':
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '–':
                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case 'x':
                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '÷':
                            if (!tokens[2].equals('0')) {
                                res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            }
                            else {
                                res = "ERROR!";
                            }
                            break;
                    }
                    displayTwo();
                    clear();
                }
            }
        });

    }

    public void displayOne() {
        calculation.setText(current);
    }

    public void displayTwo() {
        result.setText(res);
    }

    public void clear() {
        current = "";
        res = "";
        dot_inserted = false;
        operator_inserted = false;
    }

    public void backspace() {
        /* if current is not empty => remove last char */
        if (!current.isEmpty()) {
            // check if the dot is last char in current => set dot_inserted = false
            if (current.substring(current.length() - 1, current.length()).equals(".")) {
                dot_inserted = false;
            }

            /* if the operator is detected => delete three digits or chars form the current *
            /* and set operator_inserted = false                                            */
            if (current.substring(current.length()-1, current.length()).equals(" ")) {
                current = current.substring(0, current.length() - 3);
                operator_inserted = false;
            } else {
                current = current.substring(0, current.length() - 1);
            }
        }
    }

}