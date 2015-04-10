package com.example.holamundo;

import java.io.IOException;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	ImageView referencia,android,apple,linux,mozilla;
	Button boton;
	int movil; 
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

             referencia = (ImageView) findViewById(R.id.principal);
		android = (ImageView) findViewById(R.id.android);
		apple = (ImageView) findViewById(R.id.apple);
		linux =(ImageView) findViewById(R.id.linux);
		mozilla=(ImageView)  findViewById(R.id.mozilla);
		boton = (Button) findViewById(R.id.bt1);
		
		android.setOnClickListener(this);
		apple.setOnClickListener(this);
		linux.setOnClickListener(this);
		mozilla.setOnClickListener(this);
		boton.setOnClickListener(this);
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
		switch (v.getId()) {
		case R.id.android:
			referencia.setImageResource(R.drawable.android);
			movil =R.drawable.android;
			break;
		case R.id.apple:
			referencia.setImageResource(R.drawable.apple);
			movil = R.drawable.apple;
			break;
		case R.id.linux:
			referencia.setImageResource(R.drawable.linux);
			movil =R.drawable.linux;
			break;
		case R.id.mozilla:
			referencia.setImageResource(R.drawable.mozilla);
			movil = R.drawable.mozilla;
			break;
		case R.id.bt1:
			Bitmap fondo = BitmapFactory.decodeStream(getResources().openRawResource(movil));
			try {
				getApplicationContext().setWallpaper(fondo);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			

		default:
			break;
		}
	}


	
	

}
