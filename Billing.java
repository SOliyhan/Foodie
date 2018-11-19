package com.example.hp.foodie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Billing extends AppCompatActivity {

    LinearLayout l1,l2,l3,l4;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8;
    int a=-1,bb=-1,c=-1,d=-1,e=-1,f=-1,g=-1,h=-1;
    int total;
    int burg=50,nood=40,pizza=90,momo=30,cburg=70,cnood=60,cpizza=190,cmomo=50;
    Button btn,btn2;
    TextView tv;
    EditText et1,et2,et3,et4,et5,et6,et7,et8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);


        l1= (LinearLayout) findViewById(R.id.lin1);
         l2= (LinearLayout) findViewById(R.id.lin2);
        l3= (LinearLayout) findViewById(R.id.lin3);
        l4= (LinearLayout) findViewById(R.id.lin4);
        c1= (CheckBox) findViewById(R.id.checkBox);
        c2= (CheckBox) findViewById(R.id.checkBox2);
        c3= (CheckBox) findViewById(R.id.checkBox3);
        c4= (CheckBox) findViewById(R.id.checkBox4);
        c5= (CheckBox) findViewById(R.id.checkBox5);
        c6= (CheckBox) findViewById(R.id.checkBox6);
        c7= (CheckBox) findViewById(R.id.checkBox7);
        c8= (CheckBox) findViewById(R.id.checkBox8);
        tv= (TextView) findViewById(R.id.textView);
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        et4 = (EditText) findViewById(R.id.editText4);
        et5 = (EditText) findViewById(R.id.editText5);
        et6 = (EditText) findViewById(R.id.editText6);
        et7 = (EditText) findViewById(R.id.editText7);
        et8 = (EditText) findViewById(R.id.editText8);
        btn= (Button) findViewById(R.id.button);
        btn2= (Button) findViewById(R.id.button2);
   // String input= et1.getText().toString().replaceAll("[^\\d]","");


    final Bundle b = getIntent().getExtras();
    final String data = b.getString("one");
    if (data.equalsIgnoreCase("veg")) {
        l2.setVisibility(View.GONE);
    } if (data.equalsIgnoreCase("nonveg")) {
        l1.setVisibility(View.GONE);
    }
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(et1.getText().toString().length()>0) {
                a = Integer.parseInt(et1.getText().toString());
            }
            if(et2.getText().toString().length()>0) {
                bb = Integer.parseInt(et2.getText().toString());
            }
            if(et3.getText().toString().length()>0) {
               c = Integer.parseInt(et3.getText().toString());
            }
            if(et4.getText().toString().length()>0) {
                d = Integer.parseInt(et4.getText().toString());
            }
            if(et5.getText().toString().length()>0) {
                e = Integer.parseInt(et5.getText().toString());
            }
            if(et6.getText().toString().length()>0) {
               f = Integer.parseInt(et6.getText().toString());
            }
            if(et7.getText().toString().length()>0) {
                g = Integer.parseInt(et7.getText().toString());
            }
            if(et8.getText().toString().length()>0) {
                h = Integer.parseInt(et8.getText().toString());
            }

            StringBuilder sb = new StringBuilder();
            sb.append("Items Selected:- \n");


            if (c1.isChecked()) {
                sb.append("Burger:" + et1.getText() + "\n");
              total=0;
              total = burg*a;
                }
                if(c2.isChecked())
                {
                    sb.append("Noodles:" + et2.getText()+"\n");
                    total+=nood*bb;

                }
               if(c3.isChecked())
                {
                    sb.append("Pizza:" + et3.getText()+"\n");
                    total+=pizza*c;
                }
               if(c4.isChecked())
                {
                    sb.append("Momos:" + et4.getText()+"\n");
                    total+=momo*d;
                }
               if(c5.isChecked())
                {
                    sb.append("Chicken Burger:" + et5.getText()+"\n");
                    total=0;
                    total+=cburg*e;
                }
             if(c6.isChecked())
                {
                    sb.append("Chicken Noodles:" + et6.getText()+"\n");
                    total+=cnood*f;
                }
                if(c7.isChecked())
                {
                    sb.append("Egg Pizza:" + et7.getText()+"\n");
                    total+=cpizza*g;
                }
               if(c8.isChecked())
                {
                    sb.append("Chicken Momos:" + et8.getText()+"\n");
                    total+=cmomo*h;
                }
             if ((et1.getText()==null)&&(et2.getText()==null)&&(et3.getText()==null)&&(et4.getText()==null)&&(et5.getText()==null)&&(et6.getText()==null)&&(et7.getText()==null)&&(et8.getText()==null))
               {
                     total=0;
                   tv.setText("Total: "+total);
               }

           sb.append("Total: ");
            String s= String.valueOf(total);
            sb.append(s);
          tv.setText(" " + sb);
           // tv.setVisibility(View.VISIBLE);


        }
    });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText("");
                    et1.setText("");
                    et2.setText("");
                    et3.setText("");
                    et4.setText("");
                    et5.setText("");
                    et6.setText("");
                    et7.setText("");
                    et8.setText("");

                }
            });


    }
}
