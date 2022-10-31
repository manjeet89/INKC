package com.example.inkc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Login extends AppCompatActivity {

    private LinearLayout linear1;
    private LinearLayout linear_login;
    private LinearLayout linear_forget_pass;
    private LinearLayout linear_register;
    private ImageView imageview1;
    private TextView textview2;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private Button button1;
//    private ProgressBar progressbar1;
    private TextView textview3;
    private Button button3;
    private EditText edittext1;
    private EditText edittext2;

    private Intent log = new Intent();
    private Intent frgt = new Intent();
    private Intent reg = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize(savedInstanceState);
        initializeLogic();
    }
    private void initialize(Bundle savedInstanceState) {
        linear1 = findViewById(R.id.linear1);
        linear_login = findViewById(R.id.linear_login);
        linear_forget_pass = findViewById(R.id.linear_forget_pass);
        linear_register = findViewById(R.id.linear_register);
        imageview1 = findViewById(R.id.imageview1);
        textview2 = findViewById(R.id.textview2);
        linear5 = findViewById(R.id.linear5);
        linear6 = findViewById(R.id.linear6);
        button1 = findViewById(R.id.button1);
//        progressbar1 = findViewById(R.id.progressbar1);
        textview3 = findViewById(R.id.textview3);
        button3 = findViewById(R.id.button3);
        edittext1 = findViewById(R.id.edittext1);
        edittext2 = findViewById(R.id.edittext2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {

                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {

                startActivity(new Intent(getApplicationContext(),Signup.class));
            }
        });
    }

    private void initializeLogic() {
        _view(button1, 50, 13, "#42AF5F");
        _view(button3, 50, 13, "#42A5F5");
        _view(linear_login, 50, 13, "#FFFFFF");
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