package com.example.temprature3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity2 extends AppCompatActivity {
    private LottieAnimationView animationView;
    Button button,button2;
    EditText editText;
    EditText editText2;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        animationView = findViewById(R.id.loti);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.namest);
        editText2 = findViewById(R.id.showFeranhit);
        button2 = findViewById(R.id.button2);
//        animationView.pauseAnimation();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s = editText.getText().toString();
                try {
                    // Attempt to convert the input string to an integer
                    int cel = Integer.parseInt(s);
                    double a = 1.8;
                    double b = cel * a;
                    double fer = b + 32;
                    editText2.setText("your Fahrenheit Value is " + fer);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity2.this, "please give integer", Toast.LENGTH_SHORT).show();
                    // Code to be executed if input is not an integer
                }

            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s = editText2.getText().toString();
                try {
                    // Attempt to convert the input string to an integer
                    int fer = Integer.parseInt(s);
                    double a = 0.555;
                    double b = fer - 32;
                    double cel = b * a;
                    editText.setText("your Celsius Value is " + cel);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity2.this, "please give integer", Toast.LENGTH_SHORT).show();
                    // Code to be executed if input is not an integer
                }

            }

        });
    }

}