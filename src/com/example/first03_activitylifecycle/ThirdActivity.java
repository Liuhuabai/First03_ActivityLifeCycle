package com.example.first03_activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class ThirdActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_third);
		Log.d("ThirdActivity", this.toString());
		Log.d("ThirdActivity", getTaskId()+"");
	}
	
	public void singleInstance(View view) {
		Intent intent = new Intent(this,SecondActivity.class);
		startActivity(intent);
	}
}
