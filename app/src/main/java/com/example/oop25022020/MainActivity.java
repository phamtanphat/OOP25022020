package com.example.oop25022020;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Object va class
//        String a = "5";
        //function constructor
//        Giangvien nguyenvana = new Giangvien();
//        nguyenvana.experience = "1";
//        Log.d("BBB", nguyenvana.name + " " + nguyenvana.age);
        Person nguyenvanA = new Person("Nguyen Van A",20,"Quân 10",1234567891,200, 700000);
        nguyenvanA.setName("");

        Log.d("BBB",nguyenvanA.getName());


    }
//    Access modifier
//    public ,default , private , protected

}
