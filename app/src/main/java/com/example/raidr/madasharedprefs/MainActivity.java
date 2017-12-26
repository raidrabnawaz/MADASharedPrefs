package com.example.raidr.madasharedprefs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnstart = (Button) findViewById(R.id.btnstart);
        Button btnstop = (Button) findViewById(R.id.btnstop);
        EditText edttime = (EditText) findViewById(R.id.edttime);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getBaseContext(),Myservice.class);
                startService(in);
                Toast.makeText(getApplicationContext(),"Service Started",Toast.LENGTH_LONG).show();
            }
        });
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getBaseContext(),Myservice.class);
                stopService(in);
                Toast.makeText(getBaseContext(),"Service Stopped",Toast.LENGTH_LONG).show();
            }
        });

    }
}
