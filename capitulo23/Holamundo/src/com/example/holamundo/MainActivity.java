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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends Activity {
	ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        FrutasVerduras frutasVerduras_datos[] = new FrutasVerduras[]{
        	new FrutasVerduras(R.drawable.ic_launcher,"Manzana"),
        	new FrutasVerduras(R.drawable.ic_launcher,"Pepino"),
        	new FrutasVerduras(R.drawable.ic_launcher,"Pera"),
        	new FrutasVerduras(R.drawable.ic_launcher,"Naranja"),
        	new FrutasVerduras(R.drawable.ic_launcher,"Sandia"),
        	new FrutasVerduras(R.drawable.ic_launcher,"Lechuga"),
        	};
        
        FrutasVerdurasAdapter adapter = new FrutasVerdurasAdapter(this, R.layout.listview_item_row,
        		frutasVerduras_datos);
        
        lv= (ListView) findViewById(R.id.lv);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row, null);
        lv.addHeaderView(header);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new OnItemClickListener() {
        	
        	public void onItemClick(AdapterView<?>arg0,  View arg1, int arg2, long arg3){
        		TextView v = (TextView)arg1.findViewById(R.id.tv);
        		Toast.makeText(getApplicationContext(), v.getText(),Toast.LENGTH_SHORT).show();
        	}

		
		});
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
}
