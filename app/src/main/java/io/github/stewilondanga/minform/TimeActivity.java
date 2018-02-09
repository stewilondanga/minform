package io.github.stewilondanga.minform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.graphics.Typeface;

public class TimeActivity extends AppCompatActivity {
    private Button mFindTimeButton;
    private CheckBox mChangeCheckBox1;
    private CheckBox mChangeCheckBox2;
    private CheckBox mChangeCheckBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        /**
         * This method is called when the button is clicked
         */

        mFindTimeButton = (Button) findViewById(R.id.findTimeButton);
        mFindTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
                boolean oneHour = checkBox1.isChecked();

                CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
                boolean twoToFiveHours = checkBox2.isChecked();

                CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
                boolean fivePlusHours = checkBox3.isChecked();

                Intent intent = new Intent(TimeActivity.this, CauseActivity.class);
                startActivity(intent);

                mChangeCheckBox1 = (CheckBox) findViewById(R.id.checkBox1);
                mChangeCheckBox2 = (CheckBox) findViewById(R.id.checkBox2);
                mChangeCheckBox3 = (CheckBox) findViewById(R.id.checkBox3);
                Typeface LeanderFont = Typeface.createFromAsset(getAssets(), "fonts/Leander.ttf");
                mChangeCheckBox1.setTypeface(LeanderFont);
                mChangeCheckBox2.setTypeface(LeanderFont);
                mChangeCheckBox3.setTypeface(LeanderFont);

            }
        });

        /**
         * This method is called when checkbox 1 is clicked
         */

        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        if (checkBox1.isChecked()) {
            checkBox1.setChecked(false);
        }

        /**
         * This method is called when checkbox 2 is clicked
         */

        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        if (checkBox2.isChecked()) {
            checkBox2.setChecked(false);
        }

        /**
         * This method is called when checkbox 3 is clicked
         */

        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        if (checkBox3.isChecked()) {
            checkBox3.setChecked(false);
        }

    }

        /**
        * Create Cause summary
        */

        private String createCauseSummary(boolean oneHour, boolean twoToFiveHours, boolean fivePlusHours) {

            return null;
        }
}
