package io.github.stewilondanga.minform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TypeActivity extends AppCompatActivity {
    private Button mFindTypeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);

        mFindTypeButton = (Button) findViewById(R.id.findTypeButton);
        mFindTypeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Code here executes on main thread after user presses button

            }
        });

    }

}
