package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_p = findViewById(R.id.btn_plus);
        Button btn_n = findViewById(R.id.btn_minus);
        final TextView tv = findViewById(R.id.count);
        btn_p.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int count = Integer.parseInt(tv.getText().toString());
                count++;
                tv.setText(count + "");
                Log.d("button+", count + "");
            }
        });
        btn_n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int count = Integer.parseInt(tv.getText().toString());
                count--;
                tv.setText(count + "");
                Log.d("button-", count + "");
            }
        });
    }
}
