package com.example.hp.myapplication;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text_result;
    EditText edit_feet,edit_inches,edit_pounds;
    Button button_calculate_bmi;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_feet=(EditText)findViewById(R.id.edit_feet);
        edit_inches=(EditText)findViewById(R.id.edit_inches);
        edit_pounds=(EditText)findViewById(R.id.edit_pounds);
        button_calculate_bmi=(Button)findViewById(R.id.button_calculate_bmi);
        text_result=(TextView)findViewById(R.id.text_result);
        button_calculate_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String results =Model1.CalculateBMI(edit_feet,edit_inches,edit_pounds);
                text_result.setText(results);
            }
        });
    }

}
