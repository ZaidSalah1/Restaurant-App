package com.example.myappfood.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myappfood.R;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


    }

    public void signIn(View view) {
        startActivity(new Intent(RegistrationActivity.this, LogInActivity.class));
    }

    public void mainActivityy(View view) {
        startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
    }
}