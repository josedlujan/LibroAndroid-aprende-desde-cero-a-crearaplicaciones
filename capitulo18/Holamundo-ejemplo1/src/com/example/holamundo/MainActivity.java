package com.example.holamundo;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
;

public class MainActivity extends Activity implements OnClickListener{
	Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(this);	
    }
    
    
    protected Dialog  onCreateDialog(int id) {
		Dialog dialog = null;		
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder=builder.setIcon(R.drawable.ic_launcher);
		builder=builder.setTitle("Este es el primer dialog");
		dialog = builder.create();		
    	
    		return dialog;
	}

    @Override
	public void onClick(View v) {		
			showDialog(0);		
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
      
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
	
}
