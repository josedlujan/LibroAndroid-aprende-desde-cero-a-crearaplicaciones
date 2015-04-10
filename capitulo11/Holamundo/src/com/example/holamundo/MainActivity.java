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
	EditText usuario,password;
	Button ingresar,olvidar, registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        usuario = (EditText) findViewById(R.id.Nusuario);
        password = (EditText) findViewById(R.id.Pusuario);
        ingresar= (Button) findViewById(R.id.Bingresar);
        olvidar = (Button) findViewById(R.id.Bolvidar);
        registrar = (Button) findViewById(R.id.Bregistrar);
        
        ingresar.setOnClickListener(this);
        olvidar.setOnClickListener(this);
        registrar.setOnClickListener(this);
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
		case R.id.Bingresar:
			String cadena1= usuario.getText().toString();
			String cadena2 = password.getText().toString();
			
			if (cadena1.equals("jose") && cadena2.equals("lujan")){
				Toast.makeText(getApplicationContext(), "usuario y password correcto",
						Toast.LENGTH_SHORT).show();
			}else{
				Toast.makeText(getApplicationContext(), "usuario y password incorrecto",
						Toast.LENGTH_SHORT).show();
			}
			
			break;
		case R.id.Bolvidar:
					
					break;
		case R.id.Bregistrar:
			
			break;
		default:
			break;
		}
	}
}
