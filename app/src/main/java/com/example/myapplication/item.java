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

public class item extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ;
    }

    public void back(View view) {
        Intent intent = new Intent(item.this, home.class);
        startActivity(intent);
    }

    public void report(View view) {
        Intent intent = new Intent(item.this, Report.class);
        startActivity(intent);
    }

    public void rent(View view) {
        Intent intent = new Intent(item.this, profile.class);
        startActivity(intent);
    }

}