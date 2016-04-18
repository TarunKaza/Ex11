package com.example.tarunkaza.ex11;



import android.app.AlarmManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText hour,min;
    Button setAlarm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hour = (EditText)findViewById(R.id.hours);
        min = (EditText)findViewById(R.id.mins);
        setAlarm = (Button)findViewById(R.id.alarm);
        setAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent.putExtra(AlarmClock.EXTRA_HOUR,Integer.parseInt(hour.getText().toString()));
                intent.putExtra(AlarmClock.EXTRA_MINUTES,Integer.parseInt(min.getText().toString()));
                startActivity(intent);
            }
        });

    }
}

