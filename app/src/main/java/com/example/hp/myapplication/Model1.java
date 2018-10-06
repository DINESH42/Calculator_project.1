package com.example.hp.myapplication;

import android.widget.EditText;

/**
 * Created by HP on 02-01-2018.
 */

public class Model1 {

    private static int lowerfeetrange=3;
    private static int upperfeetrange=9;
    private static int lowerinchesrange=0;
    private static int upperinchesrange=11;
    private static int lowerpoundsrange=91;
    private static int upperpoundsrange=443;

    static boolean isValidFeet(EditText field){
        if(isEmpty(field))
        {
            field.setError("feet is empty");
            return  false;
        }
        try
        {
            int data=Integer.parseInt(field.getText().toString());
            if(isInrange(data,lowerfeetrange,upperfeetrange))
            {
                return  true;
            }
            else
            {
                field.setError("Feet must be between "+lowerfeetrange+" & "+upperfeetrange+" .");
                return false;
            }
        }
        catch (Exception e)
        {
            field.setError("Enter feet as number:");
            return false;
        }
    }
    static boolean isValidInches(EditText field){
        if(isEmpty(field))
        {
            field.setError("Inches is empty");
            return  false;
        }
        try
        {
            int data=Integer.parseInt(field.getText().toString());
            if(isInrange(data,lowerinchesrange,upperinchesrange))
            {
                return  true;
            }
            else
            {
                field.setError("Inches must be between "+lowerinchesrange+" & "+upperinchesrange+" .");
                return false;
            }
        }
        catch (Exception e)
        {
            field.setError("Enter Inches as number:");
            return false;
        }
    }
    static boolean isValidpounds(EditText field){
        if(isEmpty(field))
        {
            field.setError("Pounds is empty");
            return  false;
        }
        try
        {
            int data=Integer.parseInt(field.getText().toString());
            if(isInrange(data,lowerpoundsrange,upperpoundsrange))
            {
                return  true;
            }
            else
            {
                field.setError("Pound must be between "+lowerpoundsrange+" & "+upperpoundsrange+" .");
                return false;
            }
        }
        catch (Exception e)
        {
            field.setError("Enter pound as number:");
            return false;
        }
    }


    static boolean isEmpty(EditText field){
        if(field.getText().length()==0){
            return  true;
        }
        else {
            return false;
        }
    }
    static boolean isInrange(int data,int lower,int upper){
        if(data>=lower && data<=upper) {
            return true;
        }
        else {
            return false;
        }
    }
    static String CalculateBMI(EditText edit_feet,EditText edit_inches,EditText edit_pounds){
        String resuts ="Results: ";
        String text;
        if(isValidFeet(edit_feet) && isValidInches(edit_inches) && isValidpounds(edit_pounds))
        {
            int feet = Integer.parseInt(edit_feet.getText().toString());
            int inches=Integer.parseInt(edit_inches.getText().toString());
            int totalinches=(12*feet+inches);
            int pounds=Integer.parseInt(edit_pounds.getText().toString());
            double bmi;
            bmi=Math.round(pounds*703 / Math.pow(totalinches,2));
            if(bmi<18.5){
                resuts += "Your BMI is " + bmi + "."+"Underweight";
            }
            else if(bmi>18.5 && bmi<24.9){
                resuts += "Your BMI is " + bmi + "."+"Normal";
            }
            else if(bmi>24.9 && bmi<29.9){
                resuts += "Your BMI is " + bmi + "."+"Overweight";
            }
            else if(bmi>29.9 && bmi<34.9){
                resuts += "Your BMI is " + bmi + "."+"Obese";
            }
            else if(bmi>34.5 && bmi<39.9){
                resuts += "Your BMI is " + bmi + "."+"Severely Obese";
            }
            else{
                resuts += "Your BMI is " + bmi + "."+"Morbidly Obese";
            }
        }
        else
        {
            resuts +="Something Error:";
        }
        return resuts ;
    }

}
