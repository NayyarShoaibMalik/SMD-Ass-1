package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ;
    }
    public void signup(View view) {
        Intent intent = new Intent(login.this, Signup.class);
        startActivity(intent);
    }

    public void ForgetPassword(View view) {
        Intent intent = new Intent(login.this, forgetpassword.class);
        startActivity(intent);
    }

    public void Login(View view) {
        Intent intent = new Intent(login.this, home.class);
        startActivity(intent);
    }
}
