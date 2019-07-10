package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bLogout;
    EditText etName,etUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.etUserName);
        etName=findViewById(R.id.etName);

    }







    public void login(View view) {
        Intent intent=new Intent(this, Login.class);
        startActivity(intent);
    }
}
