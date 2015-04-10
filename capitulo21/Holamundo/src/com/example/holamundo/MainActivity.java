package com.example.holamundo;



import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;





public class MainActivity extends Activity implements OnClickListener{
	EditText texto;
	Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (EditText) findViewById(R.id.texto);
        boton = (Button) findViewById(R.id.boton);
        
        SharedPreferences pref  = getSharedPreferences("nombre", Context.MODE_PRIVATE);
        texto.setText(pref.getString("dato", ""));
        
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
		case R.id.boton:
			String dato = texto.getText().toString();
			SharedPreferences preferencias = getSharedPreferences("nombre", Context.MODE_PRIVATE);
			Editor editor = preferencias.edit();
			editor.putString("dato", dato);
			editor.commit();
			finish();
			break;

		default:
			break;
		}
	}
}
