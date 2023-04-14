package com.example.task31_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText valueEditText1;
    EditText valueEditText2;
    Button subButton;
    Button addButton;
    TextView resultView;
    public static boolean isNumber(String str) {
        try {
            double v = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException nfe) {
        }
        return false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subButton = (Button) findViewById(R.id.subButton);
        addButton = (Button) findViewById(R.id.addButton);
        resultView = findViewById(R.id.resultTextView);
        valueEditText1 = findViewById(R.id.value1);
        valueEditText2 = findViewById(R.id.value2);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String value1 = valueEditText1.getText().toString();
                String value2 = valueEditText2.getText().toString();
                if(!isNumber(value1)){
                    Toast.makeText(MainActivity.this, "The First input value in invalid!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                if(!isNumber(value2)) {
                    Toast.makeText(MainActivity.this, "The Second input value in invalid!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                Double result = Double.parseDouble(value1)+Double.parseDouble(value2);
                Log.v("Res", result.toString());
                resultView.setText("Answer: " + result.toString());
            }
        });
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String value1 = valueEditText1.getText().toString();
                String value2 = valueEditText2.getText().toString();
                if(!isNumber(value1)){
                    Toast.makeText(MainActivity.this, "The First input value in invalid!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                if(!isNumber(value2)){
                    Toast.makeText(MainActivity.this, "The Second input value in invalid!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                Double result = Double.parseDouble(value1)-Double.parseDouble(value2);
                Log.v("Res", result.toString());
                resultView.setText("Answer: " + result.toString());
2            }
        });
    }
}