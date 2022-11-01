package com.example.inkc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
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
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Verficaion extends AppCompatActivity {

    public boolean isRememberUserLogin = true;
    private AppConfig appConfig;

    private LinearLayout linear1;
    private LinearLayout linear2;
    private ImageView imageview1;
    private TextView textview1;
    private EditText edittext1;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verficaion);
        initialize(savedInstanceState);
        initializeLogic();
    }private void initialize(Bundle savedInstanceState) {
        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        imageview1 = findViewById(R.id.imageview1);
        textview1 = findViewById(R.id.textview1);
        edittext1 = findViewById(R.id.edittext1);
        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {

                appConfig = new AppConfig(Verficaion.this);

                String userId = getIntent().getStringExtra("user_id");
                String otp = edittext1.getText().toString().trim();

                String first = getIntent().getStringExtra("first_name");
                String last = getIntent().getStringExtra("last_name");
                String image = getIntent().getStringExtra("user_profile_image");
                String address = getIntent().getStringExtra("user_address");
                String phone = getIntent().getStringExtra("user_phone_number");
                String member = getIntent().getStringExtra("kennel_club_name");

                ProgressDialog progressDialog = new ProgressDialog(Verficaion.this);
                progressDialog.setMessage("Please Wait!");
                progressDialog.show();

                Call<ResponseModelVerification> call = RetrofitClient.getInstance().getApi().verification(userId,otp);

                call.enqueue(new Callback<ResponseModelVerification>() {
                    @Override
                    public void onResponse(Call<ResponseModelVerification> call, Response<ResponseModelVerification> response) {

                        ResponseModelVerification responseModelVerification = response.body();
                        if(responseModelVerification.getCode()==200)
                        {

                            if (isRememberUserLogin) {
                                appConfig.updateUserLoginStatus(true);
                                appConfig.SaveImagesession(image);
                                appConfig.SaveNamesession(first +" "+last);
                                appConfig.SaveAddresssesion(address);
                                appConfig.SaveContactsession(phone);
                                appConfig.SaveInkcRegis(userId);
                                appConfig.SaveMemberShip(member);

                            }

                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        }
                        else
                        {
                            Toast.makeText(Verficaion.this, "Invalid OTP", Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseModelVerification> call, Throwable t) {
                        Toast.makeText(Verficaion.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    private void initializeLogic() {
        _view(linear2, 50, 13, "#FFFFFF");
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