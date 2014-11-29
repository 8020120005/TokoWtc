package com.ben.tokowtc;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
    public void open1(View v){
		Intent intenSaya = new Intent(getApplicationContext(),Levis.class);
		startActivity(intenSaya);
	}
    public void open2(View v){
		Intent intenSaya2 = new Intent(getApplicationContext(),The_Executive.class);
		startActivity(intenSaya2);
	}
    public void open3(View v){
		Intent intenSaya3 = new Intent(getApplicationContext(),Mississippi.class);
		startActivity(intenSaya3);
	}
}




