package com.example.nogu96.myapplication;




import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;

public class LifePoints {
    private boolean plus;

    public LifePoints(){
        plus = true;
    }

    public void doDamage(TextView textView, Integer damage){
        Integer actualLife = Integer.parseInt(textView.getText().toString());
        if(plus){
            actualLife = actualLife + damage;
        }else{
            actualLife = actualLife - damage;
        }
        if(actualLife >4000){

        }else if(actualLife <=4000 && actualLife >= 2000){

        }else{

        }
        textView.setText(actualLife.toString());
    }

    public void setPlus(boolean newPlus){
        this.plus = newPlus;
    }

}
