package com.example.first03_activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {
	public static final String TAG = "MainActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		Log.d(TAG, this.toString());
	}

	public void onClickNormal(View view) {
		Intent intent = new Intent(this,NormalActivity.class);
		startActivity(intent);
	}
	public void onClickDialog(View view) {
		Intent intent = new Intent(this,DialogActivity.class);
		startActivity(intent);
	}
	
	public void standard(View view) {
		Intent intent = new Intent(this,MainActivity.class);
		startActivity(intent);
	}
	public void singleTask(View view) {
		Intent intent = new Intent(this,SecondActivity.class);
		startActivity(intent);
	}
	public void singleInstance(View view) {
		Intent intent = new Intent(this,ThirdActivity.class);
		startActivity(intent);
	}
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "onStart");
	}
	@Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }
	@Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
	
}
