package com.example.vaishnavisharma.soc_manager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

public class Calen extends AppCompatActivity {

    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calen);
        calendar = (CalendarView) findViewById(R.id.calendar);
        calendar.setOnDateChangeListener(new OnDateChangeListener(){

            @Override
            public void onSelectedDayChange(CalendarView view,
                                            int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(),
                        dayOfMonth +"/"+month+"/"+ year,Toast.LENGTH_LONG).show();}});
    }
}
