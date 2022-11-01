package com.example.inkc.ResponseModel;

import com.example.inkc.Data;
import com.google.gson.annotations.SerializedName;

public class ResponseModelLogin {


    Data data;
    String message;
    int code;
    boolean status;

    public ResponseModelLogin(Data data, String message, int code, boolean status) {
        this.data = data;
        this.message = message;
        this.code = code;
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
