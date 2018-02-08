package io.github.stewilondanga.minform;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mFindDosomethingButton;
    private TextView mMainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindDosomethingButton = (Button) findViewById(R.id.findDosomethingButton);
        mFindDosomethingButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       Intent intent = new Intent(MainActivity.this, ChangeActivity.class);
                       startActivity(intent);
                    }
                });

        mMainTextView = (TextView) findViewById(R.id.main_text);
        Typeface LeanderFont = Typeface.createFromAsset(getAssets(), "fonts/Leander.ttf");
        mMainTextView.setTypeface(LeanderFont);
    }
}
