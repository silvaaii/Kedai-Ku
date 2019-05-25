package com.example.samsung.kedaiku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pesanMakanan(View view) {
        Intent intent = new Intent(MainActivity.this, DetailIceCream.class);
        startActivity(intent);
    }

}
