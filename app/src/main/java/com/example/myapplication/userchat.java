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

public class userchat extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ;
    }


    public void back(View view) {
        Intent intent = new Intent(this, chat.class);
        startActivity(intent);
    }

    public void audio(View view) {
        Intent intent = new Intent(this, audio.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(this, video.class);
        startActivity(intent);
    }

}
