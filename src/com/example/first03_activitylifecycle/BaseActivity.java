package com.example.first03_activitylifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * ����һ���̳���activity�Ļ��࣬�Լ���д��������̳У��������е�
 * activity�ͻᱻ��ӵ�һ��list��ȥ�����Ҫʵ��һ���˳���ֻ��Ҫ���Ǹ���������
 * ����ActivityCollector.finishAll()���ɡ�
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
	 * �����ĳ������Ҫ��ת�����activity����ôֻ��Ҫ���������̬�������ɡ�
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
