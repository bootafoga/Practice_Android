package com.hfad.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class task2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
    }

    public void onRadioButtonClicked(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int id = radioGroup.getCheckedRadioButtonId();
        ImageView photo = (ImageView)findViewById(R.id.imageView);
        int image;
        String description;
        switch (id){

            case R.id.radioButton:
                image = R.drawable.pentagon1;
                description = "This is the pentagon 1";
                photo.setImageResource(image);
                photo.setContentDescription(description);

                break;
            case R.id.radioButton2:
                /*image = R.drawable.snim1;
                description = "This is the snimok";
                photo.setImageResource(image);
                photo.setContentDescription(description);*/

                break;
            case R.id.radioButton3:
                image = R.drawable.pentagon2;
                description = "This is the pentagon 2";
                photo.setImageResource(image);
                photo.setContentDescription(description);
                break;

        }
    }
}
