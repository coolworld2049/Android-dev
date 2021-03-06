package mirea.ivanovnp.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView btnClickText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClickText =  findViewById(R.id.textViewBtnClick);
        Button btnOk = findViewById(R.id.buttonOk);
        Button btnCancel = findViewById(R.id.buttonCancel);

        @SuppressLint("SetTextI18n") View.OnClickListener oclBtnOk = view -> {
            Toast.makeText(this,"Нажата кнопка OK",Toast.LENGTH_SHORT).show();
            btnClickText.setText("Нажата кнопка OK");
        };
        @SuppressLint("SetTextI18n") View.OnClickListener oclBtnCancel = view -> {
            Toast.makeText(this,"Нажата кнопка Cancel",Toast.LENGTH_SHORT).show();
            btnClickText.setText("Нажата кнопка Cancel");
        };

        btnOk.setOnClickListener(oclBtnOk);
        btnCancel.setOnClickListener(oclBtnCancel);
    }

    @SuppressLint("SetTextI18n")
    public void onClickBtnSave(View view)
    {
        Toast.makeText(this,"Нажата кнопка Save",Toast.LENGTH_SHORT).show();
        btnClickText.setText("Нажата кнопка Save");
    }
}