package io.github.stewilondanga.minform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChangeActivity extends AppCompatActivity {
    private Button mFindCauseButton;
    private Button mFindTimeButton;
    private Button mFindTypeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        mFindCauseButton = (Button) findViewById(R.id.findCauseButton);
        mFindCauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangeActivity.this, CauseActivity.class);
                startActivity(intent);
            }
        });

        mFindTimeButton = (Button) findViewById(R.id.findTimeButton);
        mFindTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangeActivity.this, TimeActivity.class);
                startActivity(intent);
            }
        });

        mFindTypeButton = (Button) findViewById(R.id.findTypeButton);
        mFindTypeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangeActivity.this, TypeActivity.class);
                startActivity(intent);
            }
        });
    }
}
