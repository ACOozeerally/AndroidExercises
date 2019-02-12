package com.example.counter_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int counter;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.show_count);
    }

    public void clickCounter(){

    }

    public void showBubble(View view) {
        Toast toast = Toast.makeText(this, R.string.bubble_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        counter++;
        if (showCount != null)
            showCount.setText(Integer.toString(counter));

    }
}
