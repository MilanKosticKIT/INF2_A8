package com.uni.admin.aufgabe_8;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class SleepMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_message);
    }

    public void finishThis(View view){
        finish();
    }
}
