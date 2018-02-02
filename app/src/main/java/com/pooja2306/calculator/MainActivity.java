package com.pooja2306.calculator;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bClear, bPlus, bMinus, bDiv, bMult, bPM, bPer, bDec, bEqual;
    static String num = "0";
    Double firstNum, secNum;
    Double result;
    String oper;
    String[] temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv1);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        b0 = (Button) findViewById(R.id.btn0);
        bClear = (Button) findViewById(R.id.btnAc);
        bPlus = (Button) findViewById(R.id.btnAdd);
        bMinus = (Button) findViewById(R.id.btnMinus);
        bMult = (Button) findViewById(R.id.btnMult);
        bDiv = (Button) findViewById(R.id.btnDiv);
        bPM = (Button) findViewById(R.id.btnDel);
        bPer = (Button) findViewById(R.id.btnper);
        bDec = (Button) findViewById(R.id.btnDec);
        bEqual = (Button) findViewById(R.id.btnEqual);
    }

    public void getValues(View v) {


        switch (v.getId()) {
            case R.id.btn1:
                num = tv.getText().toString();
                if(num.length()==1 && num.equalsIgnoreCase("0"))
                    tv.setText("1");
                else
                    tv.setText(num+"1");
                break;
            case R.id.btn2:
                num = tv.getText().toString();
                if(num.length()==1 && num.equalsIgnoreCase("0"))
                    tv.setText("2");
                else
                    tv.setText(num+"2");
                break;
            case R.id.btn3:
                num = tv.getText().toString();
                if(num.length()==1 && num.equalsIgnoreCase("0"))
                    tv.setText("3");
                else
                    tv.setText(num+"3");
                break;
            case R.id.btn4:
                num = tv.getText().toString();
                if(num.length()==1 && num.equalsIgnoreCase("0"))
                    tv.setText("4");
                else
                    tv.setText(num+"4");
                break;
            case R.id.btn5:
                num = tv.getText().toString();
                if(num.length()==1 && num.equalsIgnoreCase("0"))
                    tv.setText("5");
                else
                    tv.setText(num+"5");
                break;
            case R.id.btn6:
                num = tv.getText().toString();
                if(num.length()==1 && num.equalsIgnoreCase("0"))
                    tv.setText("6");
                else
                    tv.setText(num+"6");
                break;
            case R.id.btn7:
                num = tv.getText().toString();
                if(num.length()==1 && num.equalsIgnoreCase("0"))
                    tv.setText("7");
                else
                    tv.setText(num+"7");
                break;
            case R.id.btn8:
                num = tv.getText().toString();
                if(num.length()==1 && num.equalsIgnoreCase("0"))
                    tv.setText("8");
                else
                    tv.setText(num+"8");
                break;
            case R.id.btn9:
                num = tv.getText().toString();
                if(num.length()==1 && num.equalsIgnoreCase("0"))
                    tv.setText("9");
                else
                    tv.setText(num+"9");
                break;
            case R.id.btn0:
                num = tv.getText().toString();
                if(num.length()==1 && num.equalsIgnoreCase("0"))
                    tv.setText("0");
                else
                    tv.setText(num+"0");
                break;
            case R.id.btnAc:
                tv.setText("0");
                break;
            case R.id.btnDel:
                String s=tv.getText().toString();
                if (s.length() > 1) {
                    s = s.substring(0, s.length() - 1);
                    tv.setText(s);
                }
                else if (s.length() == 1)
                {
                    tv.setText("0");
                }
                break;
            case R.id.btnDec:
                num = tv.getText().toString();
            if (num.contains("."))
               tv.setText(num);
            else
                tv.setText(num+".");
                break;
            case R.id.btnAdd:
                num = tv.getText().toString();
                if ((num.contains("+")) || (num.contains("-")) || (num.contains("/")) || (num.contains("*")) || (num.contains("%")))
                {tv.setText(num);}
                else
                {
                    firstNum = Double.parseDouble(num);
                    tv.setText(num+"+");
                    oper = "+";
                }
                break;
            case R.id.btnMinus:
                num = tv.getText().toString();
                if ((num.contains("+")) || (num.contains("-")) || (num.contains("/")) || (num.contains("*")) || (num.contains("%")))
                {tv.setText(num);}
                else
                {
                    firstNum = Double.parseDouble(num);
                    tv.setText(num+"-");
                    oper = "-";
                }
                break;
            case R.id.btnMult:
                num = tv.getText().toString();
                if ((num.contains("+")) || (num.contains("-")) || (num.contains("/")) || (num.contains("*")) || (num.contains("%")))
                {tv.setText(num);}
                else
                {
                    firstNum = Double.parseDouble(num);
                    tv.setText(num+"*");
                    oper = "*";
                }
                break;
            case R.id.btnDiv:
                num = tv.getText().toString();
                if ((num.contains("+")) || (num.contains("-")) || (num.contains("/")) || (num.contains("*")) || (num.contains("%")))
                {tv.setText(num);}
                else
                {
                    firstNum = Double.parseDouble(num);
                    tv.setText(num+"/");
                    oper = "/";
                }
                break;
            case R.id.btnper:
                num = tv.getText().toString();
                if ((num.contains("+")) || (num.contains("-")) || (num.contains("/")) || (num.contains("*")) || (num.contains("%")))
                {tv.setText(num);}
                else
                {
                    firstNum = Double.parseDouble(num);
                    tv.setText(num+"%");
                    oper = "%";
                }
                break;
            case R.id.btnEqual:
                if (oper == "+")
                {
                    String nums = tv.getText().toString();
                    temp = nums.split("\\+");
                    firstNum = Double.parseDouble(temp[0].toString());
                    secNum = Double.parseDouble(temp[1].toString());
                    result = firstNum+secNum;
                }
                if (oper == "-")
                {
                    String nums = tv.getText().toString();
                    temp = nums.split("\\-");
                    firstNum = Double.parseDouble(temp[0].toString());
                    secNum = Double.parseDouble(temp[1].toString());
                    result = firstNum-secNum;
                }
                if (oper == "/")
                {
                    String nums = tv.getText().toString();
                    temp = nums.split("\\/");
                    firstNum = Double.parseDouble(temp[0].toString());
                    secNum = Double.parseDouble(temp[1].toString());
                    result = firstNum/secNum;
                }
                if (oper == "*")
                {
                    String nums = tv.getText().toString();
                    temp = nums.split("\\*");
                    firstNum = Double.parseDouble(temp[0].toString());
                    secNum = Double.parseDouble(temp[1].toString());
                    result = firstNum*secNum;
                }
                if (oper == "%")
                {
                    String nums = tv.getText().toString();
                    temp = nums.split("\\%");
                    firstNum = Double.parseDouble(temp[0].toString());
                    result = firstNum/100;
                }
                tv.setText(String.valueOf(result));
                firstNum = 0.0;
                secNum = 0.0;
                break;
            default:
                break;
        }
    }

}





