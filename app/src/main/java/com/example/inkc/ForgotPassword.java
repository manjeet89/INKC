package com.example.inkc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//Comments addeed for demo purposes

public class ForgotPassword extends AppCompatActivity {


    public LinearLayout linear2;
    public LinearLayout linear3;
    public TextView textview1;
    public LinearLayout linear4;
    public TextView textview5;
    public EditText edittext3;
    public TextView textview2;
    public EditText edittext1;
    public TextView textview3;
    public EditText edittext2;
    public Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        initialize(savedInstanceState);
        initializeLogic();
    }

    public void initialize(Bundle savedInstanceState) {
        linear2 = findViewById(R.id.linear2);
        linear3 = findViewById(R.id.linear3);
        textview1 = findViewById(R.id.textview1);
        linear4 = findViewById(R.id.linear4);
        textview5 = findViewById(R.id.textview5);
        edittext3 = findViewById(R.id.edittext3);
        textview2 = findViewById(R.id.textview2);
        edittext1 = findViewById(R.id.edittext1);
        textview3 = findViewById(R.id.textview3);
        edittext2 = findViewById(R.id.edittext2);
        button1 = findViewById(R.id.button1);

        edittext2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String pass  = edittext1.getText().toString().trim();
                String cpass = edittext2.getText().toString().trim();
                TextView error = findViewById(R.id.error);
                if(pass.equals(cpass)){
                    error.setText("Password Matched");  // match password
                    error.setTextColor(Color.parseColor("#24d61e"));

                }
                else
                {
                    error.setText("Password Not Matched");
                    error.setTextColor(Color.parseColor("#b51c0e"));

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                String Number  = edittext3.getText().toString().trim();
                String pass  = edittext1.getText().toString().trim();
                String cpass = edittext2.getText().toString().trim();
                TextView error = findViewById(R.id.error);
                String errorcheck = error.getText().toString().trim();

                if(TextUtils.isEmpty(Number))
                {
                    edittext3.setError("Please Enter Register Number");
                    Toast.makeText(ForgotPassword.this, "Please Enter Register Number", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(TextUtils.isEmpty(pass))
                {
                    edittext1.setError("Please Enter  Password");
                    Toast.makeText(ForgotPassword.this, "Please Enter  Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(TextUtils.isEmpty(cpass))
                {
                    edittext2.setError("Please Enter Confirm Password");
                    Toast.makeText(ForgotPassword.this, "Please Enter Confirm Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    if (errorcheck.equals("Password Matched"))
                    {

                        Call<ResponseModelForgotPassword> call = RetrofitClient.getInstance().getApi().forgot(Number,pass,cpass);
                        call.enqueue(new Callback<ResponseModelForgotPassword>() {
                            @Override
                            public void onResponse(Call<ResponseModelForgotPassword> call, Response<ResponseModelForgotPassword> response) {
                                ResponseModelForgotPassword responseModelForgotPassword = response.body();

                                String ss = responseModelForgotPassword.getMessage();
                                String id=  responseModelForgotPassword.getData().user_id;
                                String first_name = responseModelForgotPassword.getData().first_name;
                                String last_name = responseModelForgotPassword.getData().last_name;
                                String user_profile_image = responseModelForgotPassword.getData().user_profile_image;
                                String user_address = responseModelForgotPassword.getData().user_address;
                                String user_phone_number = responseModelForgotPassword.getData().user_phone_number;
                                String kennel_club_name = responseModelForgotPassword.getData().kennel_club_name;
                                
                                Toast.makeText(ForgotPassword.this, ss, Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),Verficaion.class);
                                intent.putExtra("user_id",id);
                                intent.putExtra("first_name",first_name);
                                intent.putExtra("last_name",last_name);
                                intent.putExtra("user_profile_image",user_profile_image);
                                intent.putExtra("user_address",user_address);
                                intent.putExtra("user_phone_number",user_phone_number);
                                intent.putExtra("kennel_club_name",kennel_club_name);
                                startActivity(intent);

//                                if(response.code()==200){
//                                    Toast.makeText(ForgotPassword.this,"Successful", Toast.LENGTH_SHORT).show();
//                                    startActivity(new Intent(getApplicationContext(), Verficaion.class));
//
//                                }
//                                else
//                                {
//                                    Toast.makeText(ForgotPassword.this, "Error", Toast.LENGTH_SHORT).show();
//                                }
                            }

                            @Override
                            public void onFailure(Call<ResponseModelForgotPassword> call, Throwable t) {
                                Toast.makeText(ForgotPassword.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                    else
                    {
                        Toast.makeText(ForgotPassword.this, "Confirm Password is Not Match", Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });
    }

    public void initializeLogic() {
        _view(linear4, 50, 13, "#ffffff");
        _view(button1, 50, 13, "#2196f3");
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
                _result.add((double) _arr.keyAt(_iIdx));
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
