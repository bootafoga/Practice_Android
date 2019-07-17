package com.hfad.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class task1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
    }

    public void onClickButton(View view) {
        EditText editText = (EditText)findViewById(R.id.edit_text);
        String text = editText.getText().toString();

        TextView showText = (TextView)findViewById(R.id.textView);
        showText.setText(text);
    }
}
