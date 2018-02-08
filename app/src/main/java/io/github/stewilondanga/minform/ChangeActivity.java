package io.github.stewilondanga.minform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Typeface;

public class ChangeActivity extends AppCompatActivity {
    private Button mSpareSomeTimeButton;
    private TextView mChangeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        mSpareSomeTimeButton = (Button) findViewById(R.id.findCauseButton);
        mSpareSomeTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangeActivity.this, TimeActivity.class);
                startActivity(intent);

            }
        });

        mChangeTextView = (TextView) findViewById(R.id.change_text);
        Typeface LeanderFont = Typeface.createFromAsset(getAssets(), "fonts/Leander.ttf");
        mChangeTextView.setTypeface(LeanderFont);
    }
}
