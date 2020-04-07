package com.example.oop25022020;

import android.util.Log;

public class User extends Person{

//
//    public User(String name, int age, String address, int phone, int city_id, int state_code) {
//        super(name, age, address, phone, city_id, state_code);
//    }

    @Override
    public void showName() {
        Log.d("BBB","Username : " + super.name);
    }
}
