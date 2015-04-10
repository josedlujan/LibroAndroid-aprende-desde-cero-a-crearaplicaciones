package com.example.holamundo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FrutasVerdurasAdapter  extends ArrayAdapter<FrutasVerduras>{
	Context context;
	int layoutResourceId;
	FrutasVerduras data[] = null;
	
	public FrutasVerdurasAdapter(Context context, int layoutResourceId,
			FrutasVerduras[] data) {
		super(context, layoutResourceId, data);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.layoutResourceId = layoutResourceId;
		this.data = data;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View row = convertView;
		FrutasVerdurasHolder holder = null;
		
		if(row==null){
			LayoutInflater inflater = ((Activity)context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);
			
			holder = new FrutasVerdurasHolder();
			holder.imagen = (ImageView)row.findViewById(R.id.imagen);
			holder.texto = (TextView)row.findViewById(R.id.tv);
			row.setTag(holder);
		}else{
			holder=(FrutasVerdurasHolder)row.getTag();
		}
		
		FrutasVerduras frutasVerduras = data[position];
		holder.texto.setText(frutasVerduras.title);
		holder.imagen.setImageResource(frutasVerduras.icon);
		
		return row;
	}
	
	static class FrutasVerdurasHolder{
		ImageView imagen;
		TextView texto;
	}
	
}
