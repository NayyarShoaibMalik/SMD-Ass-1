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

public class itemupload extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ;
    }


    public void back(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    public void photo(View view) {
        Intent intent = new Intent(this, camera.class);
        startActivity(intent);
    }
    public void video(View view) {
        Intent intent = new Intent(this, video.class);
        startActivity(intent);
    }

    public void Submit(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }


}
