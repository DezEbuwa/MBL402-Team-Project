package com.uophomework.groupproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton navigateBtn = (ImageButton)findViewById(R.id.navigateBtn);
        final ImageButton callBtn = (ImageButton)findViewById(R.id.callBtn);
        final ImageButton emailBtn = (ImageButton)findViewById(R.id.emailBtn);
        final ImageButton websiteBtn = (ImageButton)findViewById(R.id.websiteBtn);

        navigateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Navigation starts here...
                Toast.makeText(getApplicationContext(), getString(R.string.contactMapBtn_lbl), Toast.LENGTH_SHORT).show();
            }
        });

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Call starts here...
                Toast.makeText(getApplicationContext(), getString(R.string.contactCallBtn_lbl), Toast.LENGTH_SHORT).show();
            }
        });

        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Email starts here...
                Toast.makeText(getApplicationContext(), getString(R.string.contactEmailBtn_lbl), Toast.LENGTH_SHORT).show();
            }
        });


        websiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Website starts here...
                Toast.makeText(getApplicationContext(), getString(R.string.contactWWWBtn_lbl), Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
