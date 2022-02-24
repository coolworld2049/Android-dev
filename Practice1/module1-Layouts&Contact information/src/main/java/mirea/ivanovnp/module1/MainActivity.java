package mirea.ivanovnp.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setContentView(R.layout.linear_layout);
        //setContentView(R.layout.table_layout);
        //setContentView(R.layout.relative_layout);
        //setContentView(R.layout.activity_second);
/*
        TextView myTextView = (TextView) findViewById(R.id.textView8);
        myTextView.setText("New text in MIREA");*/
    }
}