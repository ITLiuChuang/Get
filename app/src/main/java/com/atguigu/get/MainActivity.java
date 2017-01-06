package com.atguigu.get;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "111111", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
    }
}
