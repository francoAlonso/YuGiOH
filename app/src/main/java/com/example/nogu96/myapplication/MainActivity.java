package com.example.nogu96.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtDamage, txtPlayer, txtOponent, txtCancel;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnOk,btnPlus, btnMinus;
    LifePoints lifePoints;
    boolean player = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifePoints = new LifePoints();
        txtDamage = (TextView)findViewById(R.id.txtDaño);
        txtPlayer = (TextView)findViewById(R.id.txtPlayer);
        txtOponent = (TextView)findViewById(R.id.txtOponent);
        txtCancel = (TextView)findViewById(R.id.txtCancel);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnOk =(Button)findViewById(R.id.okBtn);
        btnPlus = (Button)findViewById(R.id.plusBtn);
        btnMinus = (Button)findViewById(R.id.minusBtn);

        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addDamage(0);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addDamage(1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addDamage(2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addDamage(3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addDamage(4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addDamage(5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addDamage(6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addDamage(7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addDamage(8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addDamage(9);
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ( !txtDamage.getText().toString().equals("") ) {
                    Integer damage = Integer.parseInt(txtDamage.getText().toString());
                    if (player) {
                        lifePoints.doDamage(txtPlayer, damage);
                    } else {
                        lifePoints.doDamage(txtOponent, damage);
                    }
                    txtDamage.setText("");
                    txtCancel.setVisibility(View.GONE);
                }
            }
        });

        txtCancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtDamage.setText("");
                txtCancel.setVisibility(View.GONE);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                lifePoints.setPlus(true);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    lifePoints.setPlus(false);
            }
        });

        txtPlayer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player = true;
            }
        });

        txtOponent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player = false;
            }
        });
    }

    public void addDamage(int number){
        txtDamage.setText( txtDamage.getText().toString() + number);
        txtCancel.setVisibility(View.VISIBLE);
    }

    public void minusBtn(View v){

    }
    public void plusBtn(View v){

    }

}
