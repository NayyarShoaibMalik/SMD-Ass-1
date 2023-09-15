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

public class profile extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ;
    }
    public void home(View view) {
        Intent intent = new Intent(profile.this, home.class);
        startActivity(intent);
    }

    public void search(View view) {
        Intent intent = new Intent(profile.this, search.class);
        startActivity(intent);
    }

    public void chat(View view) {
        Intent intent = new Intent(profile.this, profile.class);
        startActivity(intent);
    }

    public void add(View view) {
        Intent intent = new Intent(profile.this, itemupload.class);
        startActivity(intent);
    }

    public void Edit(View view) {
        Intent intent = new Intent(profile.this, edit.class);
        startActivity(intent);
    }


}