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

public class home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ;
    }


    public void chat(View view) {
        Intent intent = new Intent(home.this, chat.class);
        startActivity(intent);
    }

    public void search(View view) {
        Intent intent = new Intent(home.this, search.class);
        startActivity(intent);
    }

    public void add(View view) {
        Intent intent = new Intent(home.this, itemupload.class);
        startActivity(intent);
    }

    public void view(View view) {
        Intent intent = new Intent(home.this, item.class);
        startActivity(intent);
    }

    public void profile(View view) {
        Intent intent = new Intent(home.this, profile.class);
        startActivity(intent);
    }

}
