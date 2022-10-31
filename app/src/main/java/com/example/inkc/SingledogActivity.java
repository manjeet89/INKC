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
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.appbar.AppBarLayout;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class SingledogActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout main_ui;
	private TextView textview2;
	private EditText edittext1;
	private TextView textview4;
	private EditText edittext2;
	private TextView textview3;
	private LinearLayout linear3;
	private CalendarView calendarview1;
	private TextView textview5;
	private LinearLayout linear2;
	private Button button1;
	private TextView textview1;
	private EditText edittext3;
	private ImageView imageview1;
	private RadioButton radiobutton1;
	private RadioButton radiobutton2;
	private TextView textview6;
	
	private Intent home = new Intent();
	private Calendar calendar = Calendar.getInstance();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.singledog);
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
		linear4 = findViewById(R.id.linear4);
		main_ui = findViewById(R.id.main_ui);
		textview2 = findViewById(R.id.textview2);
		edittext1 = findViewById(R.id.edittext1);
		textview4 = findViewById(R.id.textview4);
		edittext2 = findViewById(R.id.edittext2);
		textview3 = findViewById(R.id.textview3);
		linear3 = findViewById(R.id.linear3);
		calendarview1 = findViewById(R.id.calendarview1);
		textview5 = findViewById(R.id.textview5);
		linear2 = findViewById(R.id.linear2);
		button1 = findViewById(R.id.button1);
		textview1 = findViewById(R.id.textview1);
		edittext3 = findViewById(R.id.edittext3);
		imageview1 = findViewById(R.id.imageview1);
		radiobutton1 = findViewById(R.id.radiobutton1);
		radiobutton2 = findViewById(R.id.radiobutton2);
		textview6 = findViewById(R.id.textview6);
		
		calendarview1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
			@Override
			public void onSelectedDayChange(CalendarView _param1, int _param2, int _param3, int _param4) {
				final int _year = _param2;
				final int _month = _param3;
				final int _day = _param4;
				calendarview1.setVisibility(View.GONE);
				calendar.set(Calendar.DAY_OF_MONTH, (int)(_day));
				calendar.set(Calendar.MONTH, (int)(_month));
				calendar.set(Calendar.YEAR, (int)(_year));
				edittext3.setText(new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
			}
		});
		
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				calendarview1.setVisibility(View.VISIBLE);
			}
		});
	}
	
	private void initializeLogic() {
		_view(button1, 50, 12, "#2196f3");
		calendarview1.setVisibility(View.GONE);
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
