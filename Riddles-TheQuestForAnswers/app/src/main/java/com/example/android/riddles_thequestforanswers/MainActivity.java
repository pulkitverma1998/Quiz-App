package com.example.android.riddles_thequestforanswers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    public void submitButton(View v) {


        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.wind);
        boolean answer1 = checkBox1.isChecked();

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.N);
        boolean answer2 = checkBox2.isChecked();

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.charcoal);
        boolean answer3 = checkBox3.isChecked();

        // Gets the ID's of the Radio Buttons that are checked
        int checkedRadioButton1 = radioGroup1.getCheckedRadioButtonId();
        int checkedRadioButton2 = radioGroup2.getCheckedRadioButtonId();
        int checkedRadioButton3 = radioGroup3.getCheckedRadioButtonId();

        EditText question7 = (EditText) findViewById(R.id.edit_answer);

        //Checks whether the answer is correct and adds one point to score

        if (checkedRadioButton1 == R.id.fire) {
            score += 1;
        }

        if (answer1) {
            score += 1;
        }

        if (checkedRadioButton2 == R.id.stars) {
            score += 1;
        }

        if (answer2) {
            score += 1;
        }

        if (checkedRadioButton3 == R.id.penny) {
            score += 1;
        }

        if (answer3) {
            score += 1;
        }

        if (question7.getText().toString().equals("stamp")) {
            score += 1;
        }

        if (score >= 4) {
            Toast toast = Toast.makeText(this, "You got " + score + " correct." + "You are good with riddles.", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "You should practice a little more.", Toast.LENGTH_SHORT);
            toast.show();
        }

        score = 0;

    }


}