package com.vector.nazus.mysql;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView tv1, tv2;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.name);
        tv2 = (TextView) findViewById(R.id.roll);
        bt1 = (Button) findViewById(R.id.bt);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             new Connect().execute();
            }
        });
    }
   class Connect extends AsyncTask<String,String,String>
    {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }
        @Override
        protected String doInBackground(String... str) {
        return null;
        }
        @Override
        protected void onPostExecute(void aVoid) {
            super.onPostExecute(aVoid);
        }
    }
}

