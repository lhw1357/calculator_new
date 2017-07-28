package com.example.applepi.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class Calculator extends Activity implements View.OnClickListener {
    ArrayList arrayList = new ArrayList();
    TextView screen;
    int count,count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button div = (Button) findViewById(R.id.div);
        Button mul = (Button) findViewById(R.id.mul);
        Button result = (Button) findViewById(R.id.result);
        TextView screen=(TextView) findViewById(R.id.screen);

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
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
       result.setOnClickListener(this);
        screen.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);


    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.clear:
                arrayList.clear();

                screen.setText("");
                break;
            case R.id.btn0:
                screen.setText(screen.getText().toString()+"0");
                break;
            case R.id.btn1:
                screen.setText(screen.getText().toString()+"1");
                break;
            case R.id.btn2:
                screen.setText(screen.getText().toString() + "2");
                break;
            case R.id.btn3:
                screen.setText(screen.getText().toString() + "3");
                break;
            case R.id.btn4:
                screen.setText(screen.getText().toString() + "4");
                break;
            case R.id.btn5:
                screen.setText(screen.getText().toString() + "5");
                break;
            case R.id.btn6:
                screen.setText(screen.getText().toString() + "6");
                break;
            case R.id.btn7:
                screen.setText(screen.getText().toString()+"7");
                break;
            case R.id.btn8:
                screen.setText(screen.getText().toString() + "8");
                break;
            case R.id.btn9:
                screen.setText(screen.getText().toString()+"9");
                break;
            case R.id.dot:
                screen.setText(screen.getText().toString()+".");
                break;
            case R.id.plus:
                screen.setText("");
                count=1;
                break;
            case R.id.minus:
                screen.setText("");
                count=2;
                break;
            case R.id.div:
                screen.setText("");
                count=3;
                break;
            case R.id.mul:
                screen.setText("");
                count=4;
                break;
            case R.id.result:
                int num1=0  ,num2=0,num3,sum=0;
                double fnum1=0,fnum2=0,fnum3,fsum=0;

                Object obj=arrayList.get(0);
                String n1=(String)obj;
                String n2=screen.getText().toString();

                if(n1.contains(".")||n2.contains(".")){
                    fnum1=Float.parseFloat(n1);
                    fnum2=Float.parseFloat(n2);
                    count2=1;
                }else{
                    num1=Integer.parseInt(n1);
                    num2=Integer.parseInt(n2);
                    count2=2;

                }String val="";

                switch(count){
                case 1:
                    if(count2==1){
                        fsum=fnum1+fnum2;
                        val=String.valueOf(fsum);
                    }else{
                        sum=num1+num2;
                        val=String.valueOf(sum);
                    }screen.setText(val);
                    arrayList.clear();
                    break;

                case 2:

                    if (count2 == 1) {

                        fsum = fnum1 - fnum2;
                        val = String.valueOf(fsum);
                    } else {
                        sum = num1 - num2;
                        val = String.valueOf(sum);

                    }
                    screen.setText(val);
                    arrayList.clear();
                    break;

                    case 3:

                        if (count2 == 1) {

                            fsum = fnum1/fnum2;
                            val = String.valueOf(fsum);
                        } else {
                            sum = num1/num2;
                            val = String.valueOf(sum);

                        }
                        screen.setText(val);
                        arrayList.clear();
                        break;

                    case 4:

                        if (count2 == 1) {

                            fsum = fnum1*fnum2;
                            val = String.valueOf(fsum);
                        } else {
                            sum = num1*num2;
                            val = String.valueOf(sum);

                        }
                        screen.setText(val);
                        arrayList.clear();
                        break;
            }


        }



    }





}
