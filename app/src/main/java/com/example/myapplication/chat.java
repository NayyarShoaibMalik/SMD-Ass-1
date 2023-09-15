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

public class chat extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ;
    }


    public void home(View view) {
        Intent intent = new Intent(chat.this, home.class);
        startActivity(intent);
    }

    public void userchat(View view) {
        Intent intent = new Intent(chat.this, userchat.class);
        startActivity(intent);
    }

    public void search(View view) {
        Intent intent = new Intent(chat.this, search.class);
        startActivity(intent);
    }

    public void profile(View view) {
        Intent intent = new Intent(chat.this, profile.class);
        startActivity(intent);
    }

    public void add(View view) {
        Intent intent = new Intent(chat.this, itemupload.class);
        startActivity(intent);
    }

}
