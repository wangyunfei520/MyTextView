package com.example.mytextview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MyView extends FrameLayout  {

	private View view;
	private ImageView imageView;
	private TextView textView;

	public MyView(Context context) {
		super(context);
	}
	
	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		view = LayoutInflater.from(context).inflate(R.layout.my_view, this);
		imageView = (ImageView) view.findViewById(R.id.logo);
		textView = (TextView) view.findViewById(R.id.name);
	}
	
	public void setImageBack(int id) {
		imageView.setBackgroundResource(id);
	}
	
	public void setText(String name) {
		textView.setText(name);
	}
	
	public void setTextColor(int color) {
		textView.setTextColor(color);
	}
	
	public MyView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

}
