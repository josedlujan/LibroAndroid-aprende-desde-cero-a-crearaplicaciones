package com.example.holamundo;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{
	Button boton1,boton2;
	public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        boton1 = (Button) findViewById(R.id.boton1);
		boton2 = (Button) findViewById(R.id.boton2);		
		boton1.setOnClickListener(this);
		boton2.setOnClickListener(this);
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
		switch (v.getId()) {
		case R.id.boton1:
				play_mp();
			break;
		case R.id.boton2:
				stop_mp();
			break;
		default:
			break;
				}
	
		}	
		private void play_mp(){
		mp = MediaPlayer.create(this,R.raw.choose);	
		mp.start();
		}
		
		private void stop_mp(){
		mp.stop();	
		}// TODO Auto-generated method stub
			
}
    
