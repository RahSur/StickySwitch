package com.example.android.stickyswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import io.ghyeok.stickyswitch.widget.StickySwitch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StickySwitch sw = (StickySwitch) findViewById(R.id.sticky);

        sw.setOnSelectedChangeListener(new StickySwitch.OnSelectedChangeListener() {
            @Override
            public void onSelectedChange(StickySwitch.Direction direction, String s) {
                Toast.makeText(MainActivity.this,"Add you details",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
