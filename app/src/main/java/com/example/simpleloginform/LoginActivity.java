package com.example.simpleloginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button signOutBtn;
    TextView infoTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        infoTV=findViewById(R.id.infoTV);
        signOutBtn=findViewById(R.id.signOutBtn);

        Intent intent=getIntent();
        String userInfo=intent.getStringExtra("userInfo");
        infoTV.setText(userInfo);

        signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });
    }
}
