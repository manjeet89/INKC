package com.example.inkc;

import com.example.inkc.ResponseModel.ResponseModelLogin;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("login/verification")
    Call<ResponseModelVerification> verification(
            @Field("user_id") String user_id,
            @Field("user_otp") String user_otp


    );

    @FormUrlEncoded
    @POST("login")
    Call<ResponseModelLogin> login(
            @Field("user_phone_number") String user_phone_number,
            @Field("user_password") String user_password

    );

    @FormUrlEncoded
    @POST("login/forgotpassword")
    Call<ResponseModelForgotPassword> forgot(
            @Field("user_phone_number") String user_phone_number,
            @Field("user_password") String user_password,
            @Field("confirm_password") String confirm_password

    );
}
