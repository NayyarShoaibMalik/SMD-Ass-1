package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{


    List<Model> ls;
    MyAdaptert adapter;

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

;
    }


    public void fun(View view) {
        Toast.makeText(
                MainActivity.this,
                "Hello",
                Toast.LENGTH_LONG
        ).show();
      /*
        Intent intent = new Intent(
                MainActivity.this,
                Second.class);

        startActivity(intent);

       */
    }
}