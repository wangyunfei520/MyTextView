package com.example.mytextview;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;

public class MainActivity extends Activity {

	private MyView[] myViews = new MyView[5];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
	}

	private void initView() {
		myViews[0] = (MyView) findViewById(R.id.home);
		myViews[1] = (MyView) findViewById(R.id.live);
		myViews[2] = (MyView) findViewById(R.id.yaokongqi);
		myViews[3] = (MyView) findViewById(R.id.yewu);
		myViews[4] = (MyView) findViewById(R.id.wo);

		myViews[0].setImageBack(R.drawable.home_selected);
		myViews[0].setText("首页");
		myViews[1].setImageBack(R.drawable.live_normal);
		myViews[1].setText("直播");
		myViews[2].setImageBack(R.drawable.yakongqi_normal);
		myViews[2].setText("遥控器");
		myViews[3].setImageBack(R.drawable.yewu_normal);
		myViews[3].setText("业务");
		myViews[4].setImageBack(R.drawable.geren_normal);
		myViews[4].setText("我");
		setTextColor(0);
	}
	
	public void setTextColor(int x) {
		for (int i = 0; i < myViews.length; i++) {
			if (i == x) {
				myViews[i].setTextColor(getResources().getColor(R.color.absolute));
			}else {
				myViews[i].setTextColor(getResources().getColor(R.color.black));
			}
		}
	}
	
	public void click(View view) {
		switch (view.getId()) {
		case R.id.home:
			myViews[0].setImageBack(R.drawable.home_selected);
			myViews[1].setImageBack(R.drawable.live_normal);
			myViews[2].setImageBack(R.drawable.yakongqi_normal);
			myViews[3].setImageBack(R.drawable.yewu_normal);
			myViews[4].setImageBack(R.drawable.geren_normal);
			setTextColor(0);
			break;

		case R.id.live:
			myViews[0].setImageBack(R.drawable.home_normal);
			myViews[1].setImageBack(R.drawable.live_selected);
			myViews[2].setImageBack(R.drawable.yakongqi_normal);
			myViews[3].setImageBack(R.drawable.yewu_normal);
			myViews[4].setImageBack(R.drawable.geren_normal);
			setTextColor(1);
			break;

		case R.id.yaokongqi:
			myViews[0].setImageBack(R.drawable.home_normal);
			myViews[1].setImageBack(R.drawable.live_normal);
			myViews[2].setImageBack(R.drawable.yaokongqi_selected);
			myViews[3].setImageBack(R.drawable.yewu_normal);
			myViews[4].setImageBack(R.drawable.geren_normal);
			setTextColor(2);
			break;

		case R.id.yewu:
			myViews[0].setImageBack(R.drawable.home_normal);
			myViews[1].setImageBack(R.drawable.live_normal);
			myViews[2].setImageBack(R.drawable.yakongqi_normal);
			myViews[3].setImageBack(R.drawable.yewu_selected);
			myViews[4].setImageBack(R.drawable.geren_normal);
			setTextColor(3);
			break;

		case R.id.wo:
			myViews[0].setImageBack(R.drawable.home_normal);
			myViews[1].setImageBack(R.drawable.live_normal);
			myViews[2].setImageBack(R.drawable.yakongqi_normal);
			myViews[3].setImageBack(R.drawable.yewu_normal);
			myViews[4].setImageBack(R.drawable.geren_selected);
			setTextColor(4);
			break;

		default:
			break;
		}
	}

}
