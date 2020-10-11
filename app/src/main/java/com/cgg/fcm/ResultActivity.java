package com.cgg.fcm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tv = findViewById(R.id.tv);

        Bundle bundle =  getIntent().getExtras();
        if (bundle != null) {
            String title = bundle.getString("TITLE");
            String msg = bundle.getString("MESSAGE");

            tv.setText(title+"\n"+msg);
        }


    }
}
