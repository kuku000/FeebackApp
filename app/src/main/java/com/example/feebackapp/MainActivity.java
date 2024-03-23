package com.example.feebackapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button update_Button;
    private EditText edittext;
    private TextView data_textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MainCode
        ById();//綁定元件
        UpdateData();//上傳資料到TextView
    }

    public void ById(){
        update_Button = findViewById(R.id.button);
        edittext = findViewById(R.id.edittext);
        data_textView = findViewById(R.id.text);
    }
    public void UpdateData(){
        update_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(edittext.getText());//拿取EditText字串
                edittext.setText(""); //清除輸入框的資料
                str = "Connect to "+str;
                data_textView.setText(str);//設定文字到TextView
            }
        });

    }
}