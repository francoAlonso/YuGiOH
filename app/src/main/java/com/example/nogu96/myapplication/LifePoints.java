package com.example.nogu96.myapplication;




import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;

public class LifePoints {
    private Context context;
    private boolean plus;

    public LifePoints(Context context){
        plus = true;
        this.context = context;
    }

    public void doDamage(TextView textView, Integer damage){
        Integer actualLife = Integer.parseInt(textView.getText().toString());
        if(plus){
            actualLife = actualLife + damage;
        }else{
            actualLife = actualLife - damage;
        }
        if(actualLife >4000){
            textView.setTextColor(context.getResources().getColor(R.color.lifePointsok));
        }else if(actualLife <=4000 && actualLife >= 2000){
            textView.setTextColor(context.getResources().getColor(R.color.lifePointsmedium));
        }else{
            textView.setTextColor(context.getResources().getColor(R.color.lifePointdanger));
        }
        textView.setText(actualLife.toString());
    }

    public void setPlus(boolean newPlus){
        this.plus = newPlus;
    }

}