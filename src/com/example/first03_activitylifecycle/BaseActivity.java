package com.example.first03_activitylifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * 创建一个继承自activity的基类，自己编写的类从它继承，这样所有的
 * activity就会被添加到一个list中去，如果要实现一键退出，只需要在那个方法里面
 * 调用ActivityCollector.finishAll()即可。
 * @author liuhuabai
 *
 */
public class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("BaseActivity",getClass().getSimpleName());
		ActivityCollector.addActivity(this);
		Log.d("BaseActivity", "Here is someThing changed again");
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
	/**
	 * 如果从某个界面要跳转到这个activity，那么只需要调用这个静态方法即可。
	 * @param context
	 * @param data1
	 * @param data2
	 */
	public static void actionStart(Context context,String data1,String data2) {
		Intent intent = new Intent(context,BaseActivity.class);
		intent.putExtra("param1", data1);
		intent.putExtra("param2", data2);
		context.startActivity(intent);
	}
}
