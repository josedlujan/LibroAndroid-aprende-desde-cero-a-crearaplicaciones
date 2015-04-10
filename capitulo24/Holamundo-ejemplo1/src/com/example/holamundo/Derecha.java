package com.example.holamundo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Derecha extends Fragment{
	View rootView;
	TextView txt;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		rootView = inflater.inflate(R.layout.derecha, container,false);
		txt = (TextView)rootView.findViewById(R.id.txt);
		return rootView;
	}
	
	public void ObtenerDatos(String mensaje){
		txt.setText(mensaje);
	}

}
