package com.uophomework.groupproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Declare Controls
    //Navigate
        final ImageButton navigateBtn = (ImageButton)findViewById(R.id.navigateBtn);
        final ImageView addressIcon = (ImageView)findViewById(R.id.addressIcon);
        final TextView contactAddr = (TextView)findViewById(R.id.contactAddr);

    //Call
        final ImageButton callBtn = (ImageButton)findViewById(R.id.callBtn);
        final ImageView phoneIcon = (ImageView)findViewById(R.id.phoneIcon);
        final TextView contactPhone = (TextView)findViewById(R.id.contactPhone);

    //Email
        final ImageButton emailBtn = (ImageButton)findViewById(R.id.emailBtn);
        final ImageView emailIcon = (ImageView)findViewById(R.id.emailIcon);
        final TextView contactEmail = (TextView)findViewById(R.id.contactEmail);

    //Website
        final ImageButton websiteBtn = (ImageButton)findViewById(R.id.websiteBtn);
        final ImageView websiteIcon = (ImageView)findViewById(R.id.websiteIcon);
        final TextView contactWebsite = (TextView)findViewById(R.id.contactWebsite);

// Create OnClick Listeners with intents for Controls

    //Navigation starts here
        navigateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://maps.google.com/maps?daddr=33.4020704,-111.9660244")));
            }
        });
        addressIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=33.4020704,-111.9660244")));
            }
        });
        contactAddr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=33.4020704,-111.9660244")));
            }
        });

    //Call starts here
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:6025572000")));
            }
        });
        phoneIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:6025572000")));
            }
        });
        contactPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:6025572000")));
            }
        });


    //Email starts here
        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:contact@phoenix.edu")));
            }
        });
        emailIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:contact@phoenix.edu")));
            }
        });
        contactEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:contact@phoenix.edu")));
            }
        });


    //Website starts here
        websiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.phoenix.edu")));
            }
        });
        websiteIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.phoenix.edu")));
            }
        });
        contactWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.phoenix.edu")));
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
