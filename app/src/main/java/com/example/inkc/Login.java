package com.example.inkc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

import com.example.inkc.ResponseModel.ResponseModelLogin;

import java.util.ArrayList;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {


    public boolean isRememberUserLogin = true;
    private AppConfig appConfig;
    TextView forgot;



    public LinearLayout linear1;
    public LinearLayout linear_login;
    public LinearLayout linear_forget_pass;
    public LinearLayout linear_register;
    public ImageView imageview1;
    public TextView textview2;
    public LinearLayout linear5;
    public LinearLayout linear6;
    public Button Login;
//    public ProgressBar progressbar1;
    public TextView textview3;
    public Button button3;
    public EditText number;
    public EditText password;

    public Intent log = new Intent();
    public Intent frgt = new Intent();
    public Intent reg = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize(savedInstanceState);
        initializeLogic();


    }
    public void initialize(Bundle savedInstanceState) {
        linear1 = findViewById(R.id.linear1);
        linear_login = findViewById(R.id.linear_login);
        linear_forget_pass = findViewById(R.id.linear_forget_pass);
        linear_register = findViewById(R.id.linear_register);
        imageview1 = findViewById(R.id.imageview1);
        textview2 = findViewById(R.id.textview2);
        linear5 = findViewById(R.id.linear5);
        linear6 = findViewById(R.id.linear6);
        Login = findViewById(R.id.button1);
//        progressbar1 = findViewById(R.id.progressbar1);
        textview3 = findViewById(R.id.textview3);
        button3 = findViewById(R.id.button3);
        number = findViewById(R.id.edittext1);
        password = findViewById(R.id.edittext2);
        forgot = findViewById(R.id.forgot);
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ForgotPassword.class));
            }
        });
        appConfig = new AppConfig(this);
        if(appConfig.isUserLogin())
        {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {

                Login();
//                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {

                startActivity(new Intent(getApplicationContext(), Signup.class));
            }
        });
    }



    public void initializeLogic() {
        _view(Login, 50, 13, "#42AF5F");
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

    @SuppressLint("NotConstructor")
    public void Login() {

        String PhoneNumber = number.getText().toString();
        String UserPassword = password.getText().toString();

        if(PhoneNumber.isEmpty()){
            number.requestFocus();
            number.setError("Please enter your number");
            return;
        }
        else if(UserPassword.isEmpty()){
            password.requestFocus();
            password.setError("Please enter your password");
            return;
        }
        else
        {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Please Wait!");
            progressDialog.show();

            Call<ResponseModelLogin> call = RetrofitClient.getInstance().getApi().login(PhoneNumber,UserPassword);

            call.enqueue(new Callback<ResponseModelLogin>() {
                @Override
                public void onResponse(Call<ResponseModelLogin> call, Response<ResponseModelLogin> response) {

                    ResponseModelLogin responseModelLogin = response.body();
                  //  Toast.makeText(Login.this, responseModelLogin.getMessage()+responseModelLogin.getData().first_name, Toast.LENGTH_SHORT).show();

                    if(response.code()==200){
                        if(responseModelLogin.getCode() == 200) {

                            if (isRememberUserLogin) {
                                appConfig.updateUserLoginStatus(true);
                                appConfig.SaveImagesession(responseModelLogin.getData().user_profile_image);
                                appConfig.SaveNamesession(responseModelLogin.getData().first_name +" "+responseModelLogin.getData().last_name);
                                appConfig.SaveAddresssesion(responseModelLogin.getData().user_address);
                                appConfig.SaveContactsession(responseModelLogin.getData().user_phone_number);
                                appConfig.SaveInkcRegis(responseModelLogin.getData().user_id);
                                appConfig.SaveMemberShip(responseModelLogin.getData().kennel_club_name);

                            }
//                            Toast.makeText(Login.this, "responseModelLogin.body().code", Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        }
                        else
                        {
                            Toast.makeText(Login.this, "UserName or PassWord is Wrong", Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                    else
                    {
                        Toast.makeText(Login.this, "Error In Server", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<ResponseModelLogin> call, Throwable t) {
//                    Toast.makeText(Login.this, t.getMessage(), Toast.LENGTH_SHORT).show();
//                    Log.d("checkerror",t.getMessage());
                    Toast.makeText(Login.this, "UserName or PassWord is Wrong", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();

                }
            });
        }



    }
}