package com.example.oop25022020;

import android.util.Log;

public class User extends Person{

    @Override
    public void showName() {
        super.showName();
        Log.d("BBB","Username : " + super.name);
    }
}
