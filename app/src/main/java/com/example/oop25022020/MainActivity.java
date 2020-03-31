package com.example.oop25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Object va class
//        String a = "5";
        //function constructor
        Person nguyenvana = new Person();
        nguyenvana.age = 10;
        nguyenvana.name = "Nguyen Van A";
        Log.d("BBB", nguyenvana.name + " " + nguyenvana.age);
    }
}
