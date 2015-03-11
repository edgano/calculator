package com.edgargarriga.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    public String str ="";
    public String op = "";
    int num,numtemp;
    EditText showResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (EditText)findViewById(R.id.result_id);
    }
    public void btn1Clicked(View v){insert(1);}
    public void btn2Clicked(View v){insert(2);}
    public void btn3Clicked(View v){insert(3);}
    public void btn4Clicked(View v){insert(4);}
    public void btn5Clicked(View v){insert(5);}
    public void btn6Clicked(View v){insert(6);}
    public void btn7Clicked(View v){insert(7);}
    public void btn8Clicked(View v){insert(8);}
    public void btn9Clicked(View v){insert(9);}

    public void btnplusClicked(View v){
        op = "+";
        perform(op);
    }
    public void btnminusClicked(View v){
        op = "-";
        perform(op);
    }
    public void btndivideClicked(View v){
        op = "/";
        perform(op);
    }
    public void btnmultiClicked(View v){
        op = "*";
        perform(op);
    }
    public void btnequalClicked(View v){calculate();}
    public void btnclearClicked(View v){
        reset();
    }

    private void reset() {
        // TODO Auto-generated method stub
        str ="";
        op ="";
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }
    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(showResult.getText()+" "+str);
    }
    private void perform(String op) {
        str = "";
        numtemp = num;
        showResult.setText(showResult.getText()+" "+op);
    }
    private void calculate() {
        // TODO Auto-generated method stub
        if(op == "+")
            num = numtemp+num;
        else if(op == "-")
            num = numtemp-num;
        else if(op == "/")
            num = numtemp / num;
        else if(op == "*")
            num = numtemp*num;
        showResult.setText(""+num);
        numtemp=0;
        op="";
    }

}
