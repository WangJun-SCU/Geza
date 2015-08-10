package com.scuwangjun.geza;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class AppIntro extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);
		Handler x = new Handler();  
        x.postDelayed(new splashhandler(), 2000); 
	}
	 class splashhandler implements Runnable{  
		  
	        public void run() {  
	            startActivity(new Intent(getApplication(),Login.class));  
	            AppIntro.this.finish();  
	        }
	 }
}
