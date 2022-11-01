package com.example.inkc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
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
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;

public class Signup extends AppCompatActivity {

    private RadioGroup radioGroup;

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
    static String male = "1";
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
        //radiobutton1 = findViewById(R.id.radiobutton1);
        radiobutton2 = findViewById(R.id.radiobutton2);
        button1 = findViewById(R.id.button1);

        radioGroup = findViewById(R.id.radiogroupgender);
        radiobutton1 = radioGroup.findViewById(R.id.radiobutton1);
        radiobutton1.setChecked(true);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int selectid = radioGroup.getCheckedRadioButtonId();
                if(selectid == -1)
                {
                    Toast.makeText(Signup.this, "No One Selected", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    RadioButton radioButton = radioGroup.findViewById(selectid);
                   // Toast.makeText(Signup.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
                    if(radioButton.getText().equals("Male"))
                    {
                        //Toast.makeText(Signup.this, "1", Toast.LENGTH_SHORT).show();
                        male = "1";
                    }
                    else
                    {
                        //Toast.makeText(Signup.this, "0", Toast.LENGTH_SHORT).show();
                        male = "0";
                    }

                }
            }
        });




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUp();
            }
        });


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

    private void SignUp() {
        String first = edittext2.getText().toString().trim();
        String last = edittext3.getText().toString().trim();
        String date = edittext9.getText().toString();
        String gender = male;
        String phone  = edittext5.getText().toString();
        String email = edittext4.getText().toString().trim();
        String password = edittext8.getText().toString().trim();


        if(first.isEmpty()){
            edittext2.requestFocus();
            edittext2.setError("Please enter your first name");
            return;
        }
        else if(last.isEmpty()){
            edittext3.requestFocus();
            edittext3.setError("Please enter your last name");
            return;
        }

        else if(date.isEmpty()){
            edittext9.requestFocus();
            edittext9.setError("Please enter your date");
            return;
        }

        else if(phone.isEmpty()){
            edittext5.requestFocus();
            edittext5.setError("Please enter your number");
            return;
        }
        else if(email.isEmpty()){
            edittext4.requestFocus();
            edittext4.setError("Please enter your email");
            return;
        }
        else  if(password.isEmpty()){
            edittext8.requestFocus();
            edittext8.setError("Please enter your password");
            return;
        }
        else
        {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Please Wait!");
            progressDialog.show();

            StringRequest request = new StringRequest(Request.Method.POST, "https://mployis.com/inkc/api/login/signup",
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            JSONObject jsonObject = null;
                            try {
                                jsonObject = new JSONObject(response);
                                String message = jsonObject.getString("message");
                                if(message.equals("Please verify user")){

                                    String data = jsonObject.getString("data");
                                    JSONObject jsonObject1 = new JSONObject(data);
                                    String user_id = jsonObject1.getString("user_id");
                                    String first_name = jsonObject1.getString("first_name");
                                    String last_name = jsonObject1.getString("last_name");
                                    String user_profile_image = jsonObject1.getString("user_profile_image");
                                    String user_address = jsonObject1.getString("user_address");
                                    String user_phone_number = jsonObject1.getString("user_phone_number");
                                    String kennel_club_name = jsonObject1.getString("kennel_club_name");



                                    Intent intent = new Intent(getApplicationContext(),Verficaion.class);
                                    intent.putExtra("user_id",user_id);
                                    intent.putExtra("first_name",first_name);
                                    intent.putExtra("last_name",last_name);
                                    intent.putExtra("user_profile_image",user_profile_image);
                                    intent.putExtra("user_address",user_address);
                                    intent.putExtra("user_phone_number",user_phone_number);
                                    intent.putExtra("kennel_club_name",kennel_club_name);

                                    startActivity(intent);
                                    //startActivity(new Intent(getApplicationContext(),Verficaion.class));

                                }else
                                {
                                    Toast.makeText(Signup.this, "Phone Number Is Must Be Unique", Toast.LENGTH_SHORT).show();
                                    edittext5.requestFocus();
                                    edittext5.setError("Phone Number Is Must Be Unique");
                                    progressDialog.dismiss();
                                }

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            //
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            })
            {
                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("user_password", password);
                    params.put("first_name", first);
                    params.put("user_phone_number", phone);
                    params.put("last_name", last);
                    params.put("user_birth_date", date);
                    params.put("gender", gender);
                    params.put("user_email_id",email );
                    return params;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(Signup.this);
            requestQueue.add(request);
        }




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