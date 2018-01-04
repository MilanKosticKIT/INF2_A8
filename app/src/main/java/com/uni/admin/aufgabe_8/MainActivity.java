package com.uni.admin.aufgabe_8;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the sleeping button was clicked
     * @param view
     */
    public void sleeperWaked(View view){
        //Send messages: "Let me sleep"
    }

    /*
    private View.OnClickListener mClorkyListener = new View.OnClickListener(){
        public void onClick(View v){

        }
    };*/
}
