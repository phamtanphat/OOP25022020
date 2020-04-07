package com.example.oop25022020;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnListenerClick{

    OnListenerClick onListenerClick;
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
        // Tính trừu tượng

        // Tính đa hình
        // + Tên phương thức giống nhau chỉ khác nhau thân hàm
        // + 2 Phương thức này phải nằm 2 nơi

        // Phương thức nạp chồng

        // Tính đóng gói
        //pham vi truy cập public , private , protected, default
        // Quan hệ has A
//        showToast(R.string.app_name);

        onListenerClick = this;

        Button button = new Button(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onListenerClick.onClick();
            }
        });
        button.performClick();
    }

    @Override
    public void onClick() {
        Log.d("BBB","Đã click");
    }
}
