package com.example.inkc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;

public class Signup extends AppCompatActivity {

    private ScrollView vscroll2;
    private LinearLayout linear5;
    private TextView textview5;
    private TextView textview7;
    private EditText edittext2;
    private TextView textview8;
    private EditText edittext3;
    private TextView textview14;
    private LinearLayout linear7;
    private CalendarView calendarview1;
    private TextView textview15;
    private LinearLayout linear8;
    private TextView textview10;
    private EditText edittext5;
    private TextView textview9;
    private EditText edittext4;
    private TextView textview11;
    private EditText edittext8;
    private LinearLayout linear4;
    private TextView textview6;
    private TextView edittext9;
    private ImageView imageview1;
    private RadioButton radiobutton1;
    private RadioButton radiobutton2;
    private Button button1;
    Calendar calendar;
   // private Calendar calendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initialize(savedInstanceState);
        initializeLogic();

    }
    private void initialize(Bundle savedInstanceState) {
        vscroll2 = findViewById(R.id.vscroll2);
        linear5 = findViewById(R.id.linear5);
        textview5 = findViewById(R.id.textview5);
        textview7 = findViewById(R.id.textview7);
        edittext2 = findViewById(R.id.edittext2);
        textview8 = findViewById(R.id.textview8);
        edittext3 = findViewById(R.id.edittext3);
        textview14 = findViewById(R.id.textview14);
        linear7 = findViewById(R.id.linear7);
        calendarview1 = findViewById(R.id.calendarview1);
        textview15 = findViewById(R.id.textview15);
        linear8 = findViewById(R.id.linear8);
        textview10 = findViewById(R.id.textview10);
        edittext5 = findViewById(R.id.edittext5);
        textview9 = findViewById(R.id.textview9);
        edittext4 = findViewById(R.id.edittext4);
        textview11 = findViewById(R.id.textview11);
        edittext8 = findViewById(R.id.edittext8);
        linear4 = findViewById(R.id.linear4);
        textview6 = findViewById(R.id.textview6);
        edittext9 = findViewById(R.id.edittext9);
        imageview1 = findViewById(R.id.imageview1);
        radiobutton1 = findViewById(R.id.radiobutton1);
        radiobutton2 = findViewById(R.id.radiobutton2);
        button1 = findViewById(R.id.button1);


        edittext9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();

                // on below line we are getting
                // our day, month and year.
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        // on below line we are passing context.
                        Signup.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // on below line we are setting date to our text view.
                                edittext9.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        },
                        // on below line we are passing year,
                        // month and day for selected date in our date picker.
                        year, month, day);
                // at last we are calling show to
                // display our date picker dialog.
                datePickerDialog.show();
            }
        });


        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();

                // on below line we are getting
                // our day, month and year.
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        // on below line we are passing context.
                        Signup.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // on below line we are setting date to our text view.
                                edittext9.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        },
                        // on below line we are passing year,
                        // month and day for selected date in our date picker.
                        year, month, day);
                // at last we are calling show to
                // display our date picker dialog.
                datePickerDialog.show();
            }
        });



//        imageview1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View _view) {
//                calendarview1.setVisibility(View.VISIBLE);
//            }
//        });

        textview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void initializeLogic() {
        calendarview1.setVisibility(View.GONE);
        _view(button1, 50, 13, "#42A5F5");
        _view(linear5, 50, 13, "#FFFFFF");
    }

    public void _view(final View _view, final double _radius, final double _shadow, final String _color) {
        android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();

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