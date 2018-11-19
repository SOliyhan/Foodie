package com.example.hp.foodie;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Items extends AppCompatActivity {

    Button btn1,btn2;
    RadioButton rb1,rb2,rb3;
    RadioGroup rg;

    @Override
    public void onBackPressed() {
        AlertDialog.Builder  alt= new AlertDialog.Builder(Items.this);
        alt.setTitle("Exit");
        alt.setMessage("Do you really want to exit?");
        alt.setCancelable(false);
        alt.setIcon(R.mipmap.food);
        alt.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alt.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alt.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        btn1= (Button) findViewById(R.id.button);
        rb1= (RadioButton) findViewById(R.id.radioButton);
        rb2= (RadioButton) findViewById(R.id.radioButton2);
        rb3= (RadioButton) findViewById(R.id.radioButton3);
        rg= (RadioGroup) findViewById(R.id.radiogroup);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId)
            {
                case R.id.radioButton:
                {
                    Toast.makeText(Items.this, "Veg selected", Toast.LENGTH_SHORT).show();
                    break;
                }
                case R.id.radioButton2:
                {
                    Toast.makeText(Items.this, "Non Veg selected", Toast.LENGTH_SHORT).show();
                    break;
                }
                case R.id.radioButton3:
                {
                    Toast.makeText(Items.this, "Both selected", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ischeck= rg.getCheckedRadioButtonId();
                if(ischeck==R.id.radioButton)
                {
                    Intent i = new Intent(Items.this,Billing.class);
                    i.putExtra("one","veg");
                    startActivity(i);
                }
                else if (ischeck==R.id.radioButton2)
                {
                    Intent i = new Intent(Items.this,Billing.class);
                    i.putExtra("one","nonveg");
                    startActivity(i);
                }
                else if (ischeck==R.id.radioButton3)
                {
                    Intent i = new Intent(Items.this,Billing.class);
                    i.putExtra("one","both");
                    startActivity(i);
                }

            }
        });
    }
}
