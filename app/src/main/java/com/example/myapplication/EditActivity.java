package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class EditActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    Button button1;
    TextView tv;
    String generateCod = "";
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        textView = findViewById(R.id.tv_phone1);
        Intent intent;

        tv = findViewById(R.id.tw_you_cod);
        editText = findViewById(R.id.tv_cod);
        intent = getIntent();
        button1 = findViewById(R.id.btn_log);
        button = findViewById(R.id.btn_generate);
        String number = intent.getStringExtra("name");
        textView.setText(textView.getText() + number);


        Random random = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText(String.valueOf(random.nextInt(999999)));




            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if (editText.getText().toString().equals(tv.getText())) {
                Intent intent2 = new Intent(EditActivity.this, EndActivity.class);
                intent2.putExtra("name1", editText.getText().toString());

                startActivity(intent2);
            }
            else {
                Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
            }



            }

            ;
        });
    }
}

