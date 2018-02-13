package io.github.stewilondanga.minform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CauseActivity extends AppCompatActivity {
    private ApiModel.DataBean.CausesBean causes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cause);
    }

    public ApiModel.DataBean.CausesBean getCauses() {
        return causes;
    }
}
