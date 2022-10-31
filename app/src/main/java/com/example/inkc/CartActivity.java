package com.example.inkc;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
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
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Random;

public class CartActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private BottomNavigationView bottomnavigation1;
	private MainActivity.FragFragmentAdapter frag;

	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout main_ui;
	private ScrollView vscroll1;
	private TextView textview1;
	private LinearLayout linear5;
	private LinearLayout linear10;
	private LinearLayout linear13;
	private LinearLayout linear16;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private ImageView imageview5;
	private TextView textview8;
	private Button button5;
	private ImageView imageview6;
	private TextView textview9;
	private Button button6;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private ImageView imageview7;
	private TextView textview10;
	private Button button7;
	private ImageView imageview8;
	private TextView textview11;
	private Button button8;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private ImageView imageview9;
	private TextView textview12;
	private Button button9;
	private ImageView imageview10;
	private TextView textview13;
	private Button button10;
	private TextView textview3;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.cart);
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

		bottomnavigation1 = findViewById(R.id.bottomnavigation1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		main_ui = findViewById(R.id.main_ui);
		vscroll1 = findViewById(R.id.vscroll1);
		textview1 = findViewById(R.id.textview1);
		linear5 = findViewById(R.id.linear5);
		linear10 = findViewById(R.id.linear10);
		linear13 = findViewById(R.id.linear13);
		linear16 = findViewById(R.id.linear16);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		imageview5 = findViewById(R.id.imageview5);
		textview8 = findViewById(R.id.textview8);
		button5 = findViewById(R.id.button5);
		imageview6 = findViewById(R.id.imageview6);
		textview9 = findViewById(R.id.textview9);
		button6 = findViewById(R.id.button6);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		imageview7 = findViewById(R.id.imageview7);
		textview10 = findViewById(R.id.textview10);
		button7 = findViewById(R.id.button7);
		imageview8 = findViewById(R.id.imageview8);
		textview11 = findViewById(R.id.textview11);
		button8 = findViewById(R.id.button8);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		imageview9 = findViewById(R.id.imageview9);
		textview12 = findViewById(R.id.textview12);
		button9 = findViewById(R.id.button9);
		imageview10 = findViewById(R.id.imageview10);
		textview13 = findViewById(R.id.textview13);
		button10 = findViewById(R.id.button10);
		textview3 = findViewById(R.id.textview3);
		
		button5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button8.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				
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
		_view(linear5, 50, 10, "#ffffff");
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
