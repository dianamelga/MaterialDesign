package com.example.diana.materialdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colocarFab();
    }

    public void colocarFab(){
        FloatingActionButton miFab = (FloatingActionButton) findViewById(R.id.fab);
        miFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Diste Click :D", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
