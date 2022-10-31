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

public class Puppy11Activity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview2;
	private TextView textview3;
	private EditText edittext1;
	private TextView textview4;
	private EditText edittext2;
	private TextView textview5;
	private LinearLayout linear16;
	private CalendarView calendarview1;
	private TextView textview6;
	private Button button1;
	private TextView textview7;
	private LinearLayout linear2;
	private TextView textview8;
	private LinearLayout linear3;
	private TextView textview9;
	private TextView textview10;
	private EditText edittext4;
	private TextView textview19;
	private LinearLayout linear4;
	private TextView textview26;
	private EditText edittext5;
	private TextView textview41;
	private TextView textview40;
	private EditText edittext6;
	private TextView textview39;
	private LinearLayout linear6;
	private TextView textview38;
	private EditText edittext7;
	private TextView textview37;
	private TextView textview32;
	private EditText edittext8;
	private TextView textview36;
	private LinearLayout linear5;
	private TextView textview35;
	private EditText edittext9;
	private TextView textview34;
	private TextView textview33;
	private EditText edittext15;
	private TextView textview31;
	private LinearLayout linear7;
	private TextView textview30;
	private EditText edittext14;
	private TextView textview29;
	private TextView textview28;
	private EditText edittext13;
	private TextView textview25;
	private LinearLayout linear8;
	private TextView textview27;
	private EditText edittext12;
	private TextView textview23;
	private TextView textview24;
	private EditText edittext11;
	private TextView textview22;
	private LinearLayout linear10;
	private TextView textview21;
	private EditText edittext10;
	private TextView textview20;
	private TextView textview18;
	private EditText edittext22;
	private TextView textview17;
	private LinearLayout linear11;
	private TextView textview16;
	private EditText edittext23;
	private TextView textview11;
	private TextView textview15;
	private EditText edittext20;
	private TextView textview12;
	private LinearLayout linear12;
	private TextView textview14;
	private EditText edittext21;
	private TextView textview13;
	private TextView textview43;
	private EditText edittext18;
	private TextView textview48;
	private LinearLayout linear14;
	private TextView textview47;
	private EditText edittext19;
	private TextView textview46;
	private TextView textview45;
	private EditText edittext16;
	private TextView textview44;
	private LinearLayout linear13;
	private TextView textview42;
	private EditText edittext17;
	private TextView textview49;
	private TextView textview50;
	private EditText edittext24;
	private TextView textview51;
	private LinearLayout linear15;
	private TextView textview52;
	private EditText edittext25;
	private Button button2;
	private EditText edittext26;
	private ImageView imageview1;
	private RadioButton radiobutton1;
	private RadioButton radiobutton2;
	private RadioButton radiobutton3;
	private RadioButton radiobutton4;
	private RadioButton radiobutton5;
	private RadioButton radiobutton6;
	private RadioButton radiobutton23;
	private RadioButton radiobutton24;
	private RadioButton radiobutton21;
	private RadioButton radiobutton22;
	private RadioButton radiobutton19;
	private RadioButton radiobutton20;
	private RadioButton radiobutton17;
	private RadioButton radiobutton18;
	private RadioButton radiobutton15;
	private RadioButton radiobutton16;
	private RadioButton radiobutton13;
	private RadioButton radiobutton14;
	private RadioButton radiobutton11;
	private RadioButton radiobutton12;
	private RadioButton radiobutton7;
	private RadioButton radiobutton8;
	private RadioButton radiobutton9;
	private RadioButton radiobutton10;
	private RadioButton radiobutton25;
	private RadioButton radiobutton26;
	
	private Calendar calendar = Calendar.getInstance();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.puppy11);
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
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		edittext1 = findViewById(R.id.edittext1);
		textview4 = findViewById(R.id.textview4);
		edittext2 = findViewById(R.id.edittext2);
		textview5 = findViewById(R.id.textview5);
		linear16 = findViewById(R.id.linear16);
		calendarview1 = findViewById(R.id.calendarview1);
		textview6 = findViewById(R.id.textview6);
		button1 = findViewById(R.id.button1);
		textview7 = findViewById(R.id.textview7);
		linear2 = findViewById(R.id.linear2);
		textview8 = findViewById(R.id.textview8);
		linear3 = findViewById(R.id.linear3);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		edittext4 = findViewById(R.id.edittext4);
		textview19 = findViewById(R.id.textview19);
		linear4 = findViewById(R.id.linear4);
		textview26 = findViewById(R.id.textview26);
		edittext5 = findViewById(R.id.edittext5);
		textview41 = findViewById(R.id.textview41);
		textview40 = findViewById(R.id.textview40);
		edittext6 = findViewById(R.id.edittext6);
		textview39 = findViewById(R.id.textview39);
		linear6 = findViewById(R.id.linear6);
		textview38 = findViewById(R.id.textview38);
		edittext7 = findViewById(R.id.edittext7);
		textview37 = findViewById(R.id.textview37);
		textview32 = findViewById(R.id.textview32);
		edittext8 = findViewById(R.id.edittext8);
		textview36 = findViewById(R.id.textview36);
		linear5 = findViewById(R.id.linear5);
		textview35 = findViewById(R.id.textview35);
		edittext9 = findViewById(R.id.edittext9);
		textview34 = findViewById(R.id.textview34);
		textview33 = findViewById(R.id.textview33);
		edittext15 = findViewById(R.id.edittext15);
		textview31 = findViewById(R.id.textview31);
		linear7 = findViewById(R.id.linear7);
		textview30 = findViewById(R.id.textview30);
		edittext14 = findViewById(R.id.edittext14);
		textview29 = findViewById(R.id.textview29);
		textview28 = findViewById(R.id.textview28);
		edittext13 = findViewById(R.id.edittext13);
		textview25 = findViewById(R.id.textview25);
		linear8 = findViewById(R.id.linear8);
		textview27 = findViewById(R.id.textview27);
		edittext12 = findViewById(R.id.edittext12);
		textview23 = findViewById(R.id.textview23);
		textview24 = findViewById(R.id.textview24);
		edittext11 = findViewById(R.id.edittext11);
		textview22 = findViewById(R.id.textview22);
		linear10 = findViewById(R.id.linear10);
		textview21 = findViewById(R.id.textview21);
		edittext10 = findViewById(R.id.edittext10);
		textview20 = findViewById(R.id.textview20);
		textview18 = findViewById(R.id.textview18);
		edittext22 = findViewById(R.id.edittext22);
		textview17 = findViewById(R.id.textview17);
		linear11 = findViewById(R.id.linear11);
		textview16 = findViewById(R.id.textview16);
		edittext23 = findViewById(R.id.edittext23);
		textview11 = findViewById(R.id.textview11);
		textview15 = findViewById(R.id.textview15);
		edittext20 = findViewById(R.id.edittext20);
		textview12 = findViewById(R.id.textview12);
		linear12 = findViewById(R.id.linear12);
		textview14 = findViewById(R.id.textview14);
		edittext21 = findViewById(R.id.edittext21);
		textview13 = findViewById(R.id.textview13);
		textview43 = findViewById(R.id.textview43);
		edittext18 = findViewById(R.id.edittext18);
		textview48 = findViewById(R.id.textview48);
		linear14 = findViewById(R.id.linear14);
		textview47 = findViewById(R.id.textview47);
		edittext19 = findViewById(R.id.edittext19);
		textview46 = findViewById(R.id.textview46);
		textview45 = findViewById(R.id.textview45);
		edittext16 = findViewById(R.id.edittext16);
		textview44 = findViewById(R.id.textview44);
		linear13 = findViewById(R.id.linear13);
		textview42 = findViewById(R.id.textview42);
		edittext17 = findViewById(R.id.edittext17);
		textview49 = findViewById(R.id.textview49);
		textview50 = findViewById(R.id.textview50);
		edittext24 = findViewById(R.id.edittext24);
		textview51 = findViewById(R.id.textview51);
		linear15 = findViewById(R.id.linear15);
		textview52 = findViewById(R.id.textview52);
		edittext25 = findViewById(R.id.edittext25);
		button2 = findViewById(R.id.button2);
		edittext26 = findViewById(R.id.edittext26);
		imageview1 = findViewById(R.id.imageview1);
		radiobutton1 = findViewById(R.id.radiobutton1);
		radiobutton2 = findViewById(R.id.radiobutton2);
		radiobutton3 = findViewById(R.id.radiobutton3);
		radiobutton4 = findViewById(R.id.radiobutton4);
		radiobutton5 = findViewById(R.id.radiobutton5);
		radiobutton6 = findViewById(R.id.radiobutton6);
		radiobutton23 = findViewById(R.id.radiobutton23);
		radiobutton24 = findViewById(R.id.radiobutton24);
		radiobutton21 = findViewById(R.id.radiobutton21);
		radiobutton22 = findViewById(R.id.radiobutton22);
		radiobutton19 = findViewById(R.id.radiobutton19);
		radiobutton20 = findViewById(R.id.radiobutton20);
		radiobutton17 = findViewById(R.id.radiobutton17);
		radiobutton18 = findViewById(R.id.radiobutton18);
		radiobutton15 = findViewById(R.id.radiobutton15);
		radiobutton16 = findViewById(R.id.radiobutton16);
		radiobutton13 = findViewById(R.id.radiobutton13);
		radiobutton14 = findViewById(R.id.radiobutton14);
		radiobutton11 = findViewById(R.id.radiobutton11);
		radiobutton12 = findViewById(R.id.radiobutton12);
		radiobutton7 = findViewById(R.id.radiobutton7);
		radiobutton8 = findViewById(R.id.radiobutton8);
		radiobutton9 = findViewById(R.id.radiobutton9);
		radiobutton10 = findViewById(R.id.radiobutton10);
		radiobutton25 = findViewById(R.id.radiobutton25);
		radiobutton26 = findViewById(R.id.radiobutton26);
		
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
				edittext26.setText(new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
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
		_view(linear1, 50, 10, "#ffffff");
		_view(button2, 50, 13, "#2196f3");
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
