package mirea.ivanovnp.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("key","MIREA - Иванов Никита Павлович");
        startActivity(intent);
    }
}