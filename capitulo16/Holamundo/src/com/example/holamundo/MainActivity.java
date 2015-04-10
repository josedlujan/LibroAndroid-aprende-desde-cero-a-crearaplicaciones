package com.example.holamundo;

import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vista vista  = new Vista(this);
		setContentView(vista);
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
    
    class Vista extends View{
		float x = 50;
		float y = 50;
		String accion = "accion";
		Path path = new Path();
		public Vista(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}
		
		public void onDraw(Canvas canvas){
			Paint paint = new Paint();
			paint.setStyle(Paint.Style.STROKE);
			paint.setStrokeWidth(6);
			paint.setColor(Color.BLUE);
			
			 int ancho=canvas.getWidth();
		
			if (accion == "down"){ path.moveTo(x, y);}			
			if	(accion == "move"){ path.lineTo(x, y);}			
			canvas.drawRect(10,60,ancho-10,19, paint);			
			canvas.drawPath(path, paint);
		}		
		
		public boolean onTouchEvent(MotionEvent e){
			x= e.getX();
			y= e.getY();
			
			if(e.getAction() == MotionEvent.ACTION_DOWN){ accion="down";}
			if(e.getAction() == MotionEvent.ACTION_MOVE){ accion="move";}
			invalidate();
			return true;
		}
		
	}
}
