package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    Button bLogin;
    EditText etName, etUsername, etPassword;
    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    CheckBox cb1, cb2, cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        etUsername = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        etName = findViewById(R.id.etName);
        cb1 = (CheckBox) findViewById(R.id.cbeating);
        cb2 = (CheckBox) findViewById(R.id.cbplaying);
        cb3 = (CheckBox) findViewById(R.id.cbreading);
        bLogin=findViewById(R.id.blogin);


        selectedRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());




        //addListenerOnButtonClick();
    }

//    public void addListenerOnButtonClick() {
//        //Getting instance of CheckBoxes and Button from the activty_main.xml file
//        cb1 = (CheckBox) findViewById(R.id.cbreading);
//        cb2 = (CheckBox) findViewById(R.id.cbeating);
//        cb3 = (CheckBox) findViewById(R.id.cbplaying);
//
//
//        //Applying the Listener on the Button click
//        bLogin.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//
//                StringBuilder hobbies = new StringBuilder();
//                hobbies.append("Selected Items:");
//                if (cb1.isChecked()) {
//                    hobbies.append("\nreading");
//
//                }
//                if (cb2.isChecked()) {
//                    hobbies.append("\nplaying");
//
//                }
//                if (cb3.isChecked()) {
//                    hobbies.append("\neating");
//
//                }
//                //Displaying the message on the toast
//                Toast.makeText(getApplicationContext(),hobbies.toString(), Toast.LENGTH_LONG).show();
//
//            }
//
//        });
//
//    }

    public void login1(View view) {
        Intent intent=new Intent(this, Login.class);
        startActivity(intent);
    }
}


