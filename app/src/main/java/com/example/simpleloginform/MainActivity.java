package com.example.simpleloginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernameET,passwordET ;
    CheckBox showPasswordCB;
    TextView signUPTV;
    Button loginBtn;
    String username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameET= findViewById(R.id.usernameET);
        passwordET=findViewById(R.id.passwordET);
        showPasswordCB=findViewById(R.id.showPasswordCB);
        signUPTV=findViewById(R.id.signUPTV);
        loginBtn=findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 username=usernameET.getText().toString();
                 password=passwordET.getText().toString();

                 if(username.isEmpty()|| username.equals("")){
                     Toast.makeText(MainActivity.this, "Enter your username", Toast.LENGTH_SHORT).show();
                 }

                 else if (password.isEmpty()|| password.equals("")){
                     Toast.makeText(MainActivity.this, "Enter your password", Toast.LENGTH_SHORT).show();
                 }

                 else{
                     startActivity(new Intent(MainActivity.this, LoginActivity.class)
                             .putExtra("userInfo","User Name: "+username+"\n Password: "+password));
                 }
            }
        });

    }
}
