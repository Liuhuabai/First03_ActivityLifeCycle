package com.example.first03_activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_second);
		Log.d("SecondActivity", this.toString());
		Log.d("SecondActivity", getTaskId()+"");
	}
	
	public void singleTask(View view) {
		Intent intent = new Intent(this,MainActivity.class);
		startActivity(intent);
	}
}
