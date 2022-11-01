package com.example.inkc;

import android.content.Context;
import android.content.SharedPreferences;

public class AppConfig {
    private Context context;
    private SharedPreferences sharedPreferences;

    public AppConfig(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getString(R.string.pref_file_key),Context.MODE_PRIVATE);
    }

    public boolean isUserLogin()
    {
        return sharedPreferences.getBoolean(context.getString(R.string.pref_is_user_login),false);
    }

    public void updateUserLoginStatus(boolean status)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getString(R.string.pref_is_user_login),status);
        editor.apply();
    }

    public void SaveImagesession(String image)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.image),image);
        editor.apply();
    }
    public String getImagesession()
    {
        return sharedPreferences.getString(context.getString(R.string.image),"image");
    }


    public void SaveNamesession(String name)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.name),name);
        editor.apply();
    }
    public String getNamesession()
    {
        return sharedPreferences.getString(context.getString(R.string.name),"name");
    }


    public void SaveAddresssesion(String address)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.address),address);
        editor.apply();
    }
    public String getAddresssesion()
    {
        return sharedPreferences.getString(context.getString(R.string.address),"");
    }

    public void SaveContactsession(String contact)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.contact),contact);
        editor.apply();
    }
    public String getContactsession()
    {
        return sharedPreferences.getString(context.getString(R.string.contact),"image");
    }


    public void SaveInkcRegis(String image)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.inkcregister),image);
        editor.apply();
    }
    public String getInkcRegis()
    {
        return sharedPreferences.getString(context.getString(R.string.inkcregister),"register");
    }


    public void SaveMemberShip(String member)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.membership),member);
        editor.apply();
    }
    public String getMemberShip()
    {
        return sharedPreferences.getString(context.getString(R.string.membership),"Not Member");
    }



}
