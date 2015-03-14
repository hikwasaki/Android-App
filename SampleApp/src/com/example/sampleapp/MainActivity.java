package com.example.sampleapp;


import java.util.Random;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	String result ;
                Button button = (Button) v;
                Random r = new Random() ;
        		int i = r.nextInt(2) ;
        		if(1 < i) result = "good" ;
        		else result = "bad" ;
        		//R.result
            }
        });
	}
}
