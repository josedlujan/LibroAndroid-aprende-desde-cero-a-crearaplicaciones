package com.example.holamundo;

import android.os.AsyncTask;

public class Asincrona extends AsyncTask {	
	protected void onPreExecute(){
		super.onPreExecute();
	}
	
	@Override
	protected Object doInBackground(Object... params) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
        }
        return "Executed";		
		

	}
	
	protected void  onPostExecute(Void args) {
		
	}

}

