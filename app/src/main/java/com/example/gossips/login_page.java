package com.example.gossips;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import com.google.android.material.button.MaterialButton;

public class login_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_page);
    }

    @Override
    protected void onResume(){
        super.onResume();
        final MaterialButton create_account_btn = findViewById(R.id.create_account);
        create_account_btn.setOnClickListener( view -> {
            Intent intent = new Intent(this, signup_page.class);
            startActivity(intent);
        });
    }
}