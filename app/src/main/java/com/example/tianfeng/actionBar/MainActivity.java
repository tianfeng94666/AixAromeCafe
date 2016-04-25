package com.example.tianfeng.actionBar;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.tianfeng.aixaromecafe.R;


public class MainActivity extends Activity {

	private ActionBar mActionBar;
	private final Handler mHandler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// 针对type是normal的情况
		mActionBar = (ActionBar) findViewById(R.id.gd_action_bar);
		// 添加右边的具体的item，其实是imagebutton
		// 它内部自己封装了一些type，比如refresh、search，主要就是直接使用它内置的一些图片作为imagebutton的src
		// 后面是该imagebutton的id，可以在values/ids.xml中定义
//		// 刷新跟其他type有所不一样，除了一个imagebutton，还有一个progressbar，下面可看到
//		mActionBar.addItem(ActionBarItem.Type.Refresh, R.id.action_bar_refresh);
//		mActionBar.addItem(Type.Search, R.id.action_bar_search);
//		// 你也可以按照下面一样自己添加一个item，设置自己的图片
//		mActionBar.addItem(
//				mActionBar.newActionBarItem(NormalActionBarItem.class)
//						.setDrawable(R.drawable.gd_action_bar_eye)
//						.setContentDescription("view"), R.id.action_bar_view);
		// 给item即imagebutton添加监听事件
		mActionBar.setOnActionBarListener(new ActionBar.OnActionBarListener() {

			@Override
			public void onActionBarItemClicked(int position) {

				if (position == ActionBar.OnActionBarListener.HOME_ITEM) {

					// 当按左边的主页按钮时所触发的操作
					Toast.makeText(MainActivity.this, "home or back",
							Toast.LENGTH_SHORT).show();
					return;

				}

				final ActionBarItem item = mActionBar.getItem(position);

				switch (item.getItemId()) {
					case R.id.action_bar_refresh:
						if (item instanceof LoaderActionBarItem) {

							mHandler.postDelayed(new Runnable() {
								@Override
								public void run() {
									// 通过这个方法可以来显示和隐藏那个progressbar
									((LoaderActionBarItem) item).setLoading(false);
								}
							}, 2000);
						}

						Toast.makeText(MainActivity.this, "refresh",
								Toast.LENGTH_SHORT).show();
						break;

					case R.id.action_bar_search:

						// 你具体的操作
						Toast.makeText(MainActivity.this, "search",
								Toast.LENGTH_SHORT).show();
						break;

					case R.id.action_bar_view:

						// 你具体的操作
						Toast.makeText(MainActivity.this, "view",
								Toast.LENGTH_SHORT).show();
						break;

				}
			}
		});
	}

}

