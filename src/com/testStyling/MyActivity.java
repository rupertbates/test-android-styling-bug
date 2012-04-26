package com.testStyling;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MyActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void clicked(View view){
        findViewById(R.id.myView).setBackgroundColor(getResources().getColor(R.color.red));
        View newView = getLayoutInflater().inflate(R.layout.single_view, null);
        LinearLayout container = (LinearLayout) findViewById(R.id.container);
        container.addView(newView);
    }
}
