package com.example.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    TextView textView;
    EditText editText;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // this is called when the activity is created
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override // this is called when the button is clicked
            public void onClick(View v) {
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Hello "+name, Toast.LENGTH_LONG).show();
            }
        });
    }
}