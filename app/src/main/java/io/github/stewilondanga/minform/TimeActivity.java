package io.github.stewilondanga.minform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class TimeActivity extends AppCompatActivity {
    private Button mFindTimeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        mFindTimeButton = (Button) findViewById(R.id.findTimeButton);
        mFindTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        if (checkBox1.isChecked()) {
            checkBox1.setChecked(false);
        }

        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        if (checkBox2.isChecked()) {
            checkBox2.setChecked(false);
        }

        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        if (checkBox3.isChecked()) {
            checkBox3.setChecked(false);
        }
        }
}
