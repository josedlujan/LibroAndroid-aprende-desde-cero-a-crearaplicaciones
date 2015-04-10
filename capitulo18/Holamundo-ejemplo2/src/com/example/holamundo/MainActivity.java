package com.example.holamundo;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{
	Button boton;
	TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.boton);
        texto = (TextView) findViewById(R.id.texto);
        boton.setOnClickListener(this);	
    }
        
    protected Dialog  onCreateDialog(int id) {
			Dialog dialog = null;
			DListener listener = new DListener();
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder=builder.setIcon(R.drawable.ic_launcher);
			builder=builder.setTitle("Este es el primer dialog con botones");
			builder=builder.setMessage("Selecciona un boton");
			builder=builder.setPositiveButton("Afirmativo", listener);
			builder=builder.setNegativeButton("Negativo", listener);
			builder=builder.setNeutralButton("Neutral", listener);			
			dialog = builder.create();    	
    	return dialog;
	}

    class DListener implements DialogInterface.OnClickListener{
   
		@Override
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
			if(which == DialogInterface.BUTTON_POSITIVE){
				texto.setText("Di clic a positivo");
			}
			if(which == DialogInterface.BUTTON_NEGATIVE){
				texto.setText("Di clic a negativo");
			}
			if(which == DialogInterface.BUTTON_NEUTRAL){
				texto.setText("Di clic a neutral");
			}
		}
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		showDialog(0);
	}
	
}
