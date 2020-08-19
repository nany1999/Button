package com.example.button;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   private Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.BUTTON1);
        btn2=findViewById(R.id.BUTTON2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(btn1.getText().toString().equals("点击")){
                    btn1.setEnabled(true);
                   btn1.setText("可用");}
                else{
                    btn2.setEnabled(true);
                    btn2.setText("不可用");
                }

            }

        });
        RadioGroup love = (RadioGroup) findViewById(R.id.love);

        // 为 RadioGroup 设置一个监听器 setOnCheckedChanged()
        love.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(getApplicationContext(), "你选择了:" + radioButton.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
