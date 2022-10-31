package com.example.inkc;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.appbar.AppBarLayout;

import java.util.ArrayList;
import java.util.Random;

public class RegistrationActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear1;
	private LinearLayout main_ui;
	private ScrollView vscroll2;
	private LinearLayout linear18;
	private TextView textview1;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private ImageView imageview1;
	private TextView textview2;
	private ImageView imageview2;
	private TextView textview4;
	private LinearLayout linear7;
	private LinearLayout linear6;
	private ImageView imageview4;
	private TextView textview5;
	private ImageView imageview3;
	private TextView textview6;
	private TextView textview3;
	
	private Intent litter = new Intent();
	private Intent single = new Intent();
	private Intent kennel = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.registration);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear1 = findViewById(R.id.linear1);
		main_ui = findViewById(R.id.main_ui);
		vscroll2 = findViewById(R.id.vscroll2);
		linear18 = findViewById(R.id.linear18);
		textview1 = findViewById(R.id.textview1);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		linear21 = findViewById(R.id.linear21);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		imageview1 = findViewById(R.id.imageview1);
		textview2 = findViewById(R.id.textview2);
		imageview2 = findViewById(R.id.imageview2);
		textview4 = findViewById(R.id.textview4);
		linear7 = findViewById(R.id.linear7);
		linear6 = findViewById(R.id.linear6);
		imageview4 = findViewById(R.id.imageview4);
		textview5 = findViewById(R.id.textview5);
		imageview3 = findViewById(R.id.imageview3);
		textview6 = findViewById(R.id.textview6);
		textview3 = findViewById(R.id.textview3);
		
		linear3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				single.setClass(getApplicationContext(),SingledogActivity.class);
				startActivity(single);
			}
		});
		
		linear4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				litter.setClass(getApplicationContext(), SelectpuppiesActivity.class);
				startActivity(litter);
			}
		});
		
		linear7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				kennel.setClass(getApplicationContext(), KennelActivity.class);
				startActivity(kennel);
			}
		});
	}
	
	private void initializeLogic() {
		{
			GradientDrawable SketchUi = new GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF2196f3);SketchUi.setCornerRadii(new float[]{
				d*0,d*0,d*0 ,d*0,d*0,d*0 ,d*103,d*103});
			main_ui.setElevation(d*3);
			RippleDrawable SketchUiRD = new RippleDrawable(new ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFFFFFFF}), SketchUi, null);
			main_ui.setBackground(SketchUiRD);
			main_ui.setClickable(true);
		}
		_view(linear3, 50, 12, "#64b5f6");
		_view(linear4, 50, 12, "#64b5f6");
		_view(linear7, 50, 12, "#64b5f6");
		_view(linear6, 50, 12, "#64b5f6");
		_view(linear19, 50, 12, "#ffffff");
	}
	
	public void _view(final View _view, final double _radius, final double _shadow, final String _color) {
		GradientDrawable ab = new GradientDrawable();
		
		ab.setColor(Color.parseColor(_color));
		ab.setCornerRadius((float) _radius);
		_view.setElevation((float) _shadow);
		_view.setBackground(ab);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
