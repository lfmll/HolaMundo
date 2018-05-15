package com.example.luisfernandomedinallorenti.holamundo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), CalendarView.OnDateChangeListener {
    override fun onSelectedDayChange(view: CalendarView?, year: Int, month: Int, dayOfMonth: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calendarView:CalendarView=findViewById(R.id.calendarView) as CalendarView
        calendarView.setOnDateChangeListener(this)
    }

}
