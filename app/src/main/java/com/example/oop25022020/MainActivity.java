package com.example.oop25022020;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tính kế thừa
        //Khi kế thừa . Lớp cha có thể khởi tạo ra lớp con, ngược lại thì không
//        Person person = new User(); true
//        User person = new Person(); false
        //Khi kế thừa . Lớp cha sẽ chia sẽ cho lớp con các phương thức và thuộc tính lớp cha có
//        User user = new User();
//        user.showName();
        // Phương ghi đè
//        Person person = new Person();
//        person.name = "Human 1";
//        person.showName();

//        User user = new User();
//        user.name = "Client 1";
//        user.showName();
        // + Tên phương thức giống nhau chỉ khác nhau thân hàm
        // + 2 Phương thức này phải nằm 2 nơi

        // Phương thức nạp chồng

        // Tính đóng gói
        // Tính trừu tượng
        // Tính đa hình
        // Quan hệ has A
        showToast(R.string.app_name);
    }
    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void showToast(int resId){
        Toast.makeText(this, getResources().getString(resId), Toast.LENGTH_SHORT).show();
    }
}
