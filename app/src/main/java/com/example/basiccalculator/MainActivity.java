package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    // This variable will be used to set the total amount of integers to be 10
  private int total = 0;

  // This will store the operation that need to be preformed.
  private char operation;

  // This will be true if user enters a decimal so that there isn't more then one
  private boolean decimalCheck = false;

  //This is be true when the user enter an operation to be preformed
  private boolean operationCheck = false;

  // This will be true if user enters a negative so that there isn't more then one
  private boolean negativeCheck = false;

  //These will store the numbers entered by a user
  private double value1, value2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //These are the text views that display the user inputs and the answer
        final TextView inputTextView = (TextView) findViewById(R.id.input_textView);
        final TextView answerTextView = (TextView) findViewById(R.id.answer_textView);

        // The buttons for number 0 - 9
        Button btnZero = (Button) findViewById(R.id.btnZero);
        Button btnOne = (Button) findViewById(R.id.btnOne);
        Button btnTwo = (Button) findViewById(R.id.btnTwo);
        Button btnThree = (Button) findViewById(R.id.btnThree);
        Button btnFour = (Button) findViewById(R.id.btnFour);
        Button btnFive = (Button) findViewById(R.id.btnFive);
        Button btnSix = (Button) findViewById(R.id.btnSix);
        Button btnSeven = (Button) findViewById(R.id.btnSeven);
        Button btnEight = (Button) findViewById(R.id.btnEight);
        Button btnNine = (Button) findViewById(R.id.btnNine);


        // the buttons for the decimal, the negative and the percentage
        Button btnDecimal = (Button) findViewById(R.id.btnDecimal);
        Button btnNegative = (Button) findViewById(R.id.btnNegative);
        Button btnPercentage = (Button) findViewById(R.id.btnPercentage);

        // the buttons for the operations
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnSubtract = (Button) findViewById(R.id.btnSubtract);
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        Button btnDivide = (Button) findViewById(R.id.btnDivide);

        // the buttons for the equals and the clear
        Button btnEquals = (Button) findViewById(R.id.btnEquals);
        Button btnClear = (Button) findViewById(R.id.btnClear);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                decimalCheck = false;
                operationCheck = false;
                total = 0;
                negativeCheck = false;
                inputTextView.setText("");
                answerTextView.setText("");
            }
        });

        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (negativeCheck == false && total == 0) {
                    negativeCheck = true;
                    inputTextView.setText(inputTextView.getText() + "-");
                }
            }
        });



        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (decimalCheck  == false) {
                    decimalCheck  = true;
                    inputTextView.setText(inputTextView.getText() + ".");
                }
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total < 10) {
                    total++;
                    inputTextView.setText(inputTextView.getText() + "0");
                }
            }
        });


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total < 10) {
                    total++;
                    inputTextView.setText(inputTextView.getText() + "1");
                }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total < 10) {
                    total++;
                    inputTextView.setText(inputTextView.getText() + "2");
                }
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total < 10) {
                    total++;
                    inputTextView.setText(inputTextView.getText() + "3");
                }
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total < 10) {
                    total++;
                    inputTextView.setText(inputTextView.getText() + "4");
                }
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total < 10) {
                    total++;
                    inputTextView.setText(inputTextView.getText() + "5");
                }
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total < 10) {
                    total++;
                    inputTextView.setText(inputTextView.getText() + "6");
                }
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total < 10) {
                    total++;
                    inputTextView.setText(inputTextView.getText() + "7");
                }
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total < 10) {
                    total++;
                    inputTextView.setText(inputTextView.getText() + "8");
                }
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total < 10) {
                    total++;
                    inputTextView.setText(inputTextView.getText() + "9");
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (operationCheck ==  false && total != 0) {
                    value1 = Double.parseDouble(inputTextView.getText() + "");
                    answerTextView.setText(inputTextView.getText() + " + ");
                    inputTextView.setText(" ");
                    decimalCheck = false;
                    total = 0;
                    operationCheck = true;
                    negativeCheck = false;
                    operation = '+';
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (operationCheck ==  false && total != 0) {
                    value1 = Double.parseDouble(inputTextView.getText() + "");
                    answerTextView.setText(inputTextView.getText() + " - ");
                    inputTextView.setText(" ");
                    decimalCheck = false;
                    total = 0;
                    operationCheck = true;
                    negativeCheck = false;
                    operation = '-';
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (operationCheck ==  false && total != 0) {
                    value1 = Double.parseDouble(inputTextView.getText() + "");
                    answerTextView.setText(inputTextView.getText() + " * ");
                    inputTextView.setText(" ");
                    decimalCheck = false;
                    total = 0;
                    operationCheck = true;
                    negativeCheck = false;
                    operation = '*';
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (operationCheck ==  false && total != 0) {
                    value1 = Double.parseDouble(inputTextView.getText() + "");
                    answerTextView.setText(inputTextView.getText() + " / ");
                    inputTextView.setText(" ");
                    decimalCheck = false;
                    total = 0;
                    operationCheck = true;
                    negativeCheck = false;
                    operation = '/';
                }
            }
        });


        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total != 0 && operationCheck == false) {
                    value1 = Double.parseDouble(inputTextView.getText() + "");
                    answerTextView.setText((value1 / 100) + "");
                    inputTextView.setText("");
                    total = 0;
                }
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (total != 0 && operationCheck == true) {
                  value2 = Double.parseDouble(inputTextView.getText() + "");

                  if (operation == '/'){
                      answerTextView.setText(value1 / value2 + "");
                  } else if (operation == '*'){
                      answerTextView.setText(value1 * value2 + "");
                  } else if (operation == '-'){
                      answerTextView.setText(value1 - value2 + "");
                  } else if (operation == '+') {
                      answerTextView.setText(value1 + value2 + "");
                  }
                  negativeCheck = false;
                  operationCheck = false;
                  decimalCheck = false;
                  total = 0;
                  inputTextView.setText("");


                }
            }
        });

    }

}
