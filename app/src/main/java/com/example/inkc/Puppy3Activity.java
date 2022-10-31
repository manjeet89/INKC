package com.example.inkc;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
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
import android.widget.ScrollView;
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

public class Puppy3Activity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1;
	private TextView textview2;
	private EditText edittext1;
	private TextView textview3;
	private EditText edittext2;
	private TextView textview4;
	private LinearLayout linear7;
	private CalendarView calendarview1;
	private TextView textview5;
	private Button button1;
	private TextView textview6;
	private LinearLayout linear2;
	private TextView textview7;
	private LinearLayout linear3;
	private TextView textview8;
	private TextView textview9;
	private EditText edittext4;
	private TextView textview10;
	private LinearLayout linear6;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private EditText edittext6;
	private TextView textview14;
	private LinearLayout linear4;
	private TextView textview15;
	private EditText edittext5;
	private TextView textview16;
	private TextView textview17;
	private EditText edittext7;
	private TextView textview18;
	private LinearLayout linear5;
	private TextView textview19;
	private EditText edittext8;
	private Button button2;
	private EditText edittext9;
	private ImageView imageview1;
	private RadioButton radiobutton5;
	private RadioButton radiobutton6;
	private RadioButton radiobutton7;
	private RadioButton radiobutton8;
	private RadioButton radiobutton9;
	private RadioButton radiobutton10;
	private RadioButton radiobutton3;
	private RadioButton radiobutton4;
	private RadioButton radiobutton1;
	private RadioButton radiobutton2;
	
	private Calendar calendar = Calendar.getInstance();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.puppy3);
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
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		edittext1 = findViewById(R.id.edittext1);
		textview3 = findViewById(R.id.textview3);
		edittext2 = findViewById(R.id.edittext2);
		textview4 = findViewById(R.id.textview4);
		linear7 = findViewById(R.id.linear7);
		calendarview1 = findViewById(R.id.calendarview1);
		textview5 = findViewById(R.id.textview5);
		button1 = findViewById(R.id.button1);
		textview6 = findViewById(R.id.textview6);
		linear2 = findViewById(R.id.linear2);
		textview7 = findViewById(R.id.textview7);
		linear3 = findViewById(R.id.linear3);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		edittext4 = findViewById(R.id.edittext4);
		textview10 = findViewById(R.id.textview10);
		linear6 = findViewById(R.id.linear6);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		textview13 = findViewById(R.id.textview13);
		edittext6 = findViewById(R.id.edittext6);
		textview14 = findViewById(R.id.textview14);
		linear4 = findViewById(R.id.linear4);
		textview15 = findViewById(R.id.textview15);
		edittext5 = findViewById(R.id.edittext5);
		textview16 = findViewById(R.id.textview16);
		textview17 = findViewById(R.id.textview17);
		edittext7 = findViewById(R.id.edittext7);
		textview18 = findViewById(R.id.textview18);
		linear5 = findViewById(R.id.linear5);
		textview19 = findViewById(R.id.textview19);
		edittext8 = findViewById(R.id.edittext8);
		button2 = findViewById(R.id.button2);
		edittext9 = findViewById(R.id.edittext9);
		imageview1 = findViewById(R.id.imageview1);
		radiobutton5 = findViewById(R.id.radiobutton5);
		radiobutton6 = findViewById(R.id.radiobutton6);
		radiobutton7 = findViewById(R.id.radiobutton7);
		radiobutton8 = findViewById(R.id.radiobutton8);
		radiobutton9 = findViewById(R.id.radiobutton9);
		radiobutton10 = findViewById(R.id.radiobutton10);
		radiobutton3 = findViewById(R.id.radiobutton3);
		radiobutton4 = findViewById(R.id.radiobutton4);
		radiobutton1 = findViewById(R.id.radiobutton1);
		radiobutton2 = findViewById(R.id.radiobutton2);
		
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
				edittext9.setText(new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
			}
		});
		
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
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
		calendarview1.setVisibility(View.GONE);
		_view(button2, 50, 13, "#2196f3");
		_view(linear1, 50, 0, "#ffffff");
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
