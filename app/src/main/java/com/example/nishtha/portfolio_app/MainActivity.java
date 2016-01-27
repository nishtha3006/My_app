package com.example.nishtha.portfolio_app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button first,sec,third,fourth,fifth,sixth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Enjoy My App Portfolio", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        first=(Button)findViewById(R.id.first);
        sec=(Button)findViewById(R.id.second);
        third=(Button)findViewById(R.id.third);
        fourth=(Button)findViewById(R.id.four);
        fifth=(Button)findViewById(R.id.five);
        sixth=(Button)findViewById(R.id.six);
        first.setOnClickListener(this);
        Log.d("hello", "nishtha");
        sec.setOnClickListener(this);
        third.setOnClickListener(this);
        fourth.setOnClickListener(this);
        fifth.setOnClickListener(this);
        sixth.setOnClickListener(this);
        Log.d("hello", "nishtha");
    }
    @Override
    public void onClick(View v) {
        Button button=(Button)v;
        Log.d("My app","successful");
        String toast;
        if(v.getId()==R.id.six){
            toast="This button will launch my capstone app!";
        }else
        toast="This button will launch my "+button.getText().toString()+" app!";
        Toast.makeText(this,toast,Toast.LENGTH_LONG).show();
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
