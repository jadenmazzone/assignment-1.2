package com.example.jaden.assignment12;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView mShowCount;
    private Button buttonZero;
    private Button buttonCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.textView);
        buttonZero = (Button) findViewById(R.id.button_zero);
        buttonCount = (Button) findViewById(R.id.button_count);

    }

    public void countUp(View view) {
        count++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(count));
        if(count % 2 == 0)
            buttonCount.setBackgroundColor(Color.YELLOW);
        else
            buttonCount.setBackgroundColor(Color.BLUE);
        buttonZero.setBackgroundColor(Color.RED);

    }

    public void setZero(View view) {
        if(count != 0) {
            buttonZero.setBackgroundColor(Color.GRAY);
            count = 0;
            mShowCount.setText(Integer.toString(count));
            buttonCount.setBackgroundColor(Color.YELLOW);
        }
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
