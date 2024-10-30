package com.example.database.Entity;

public class RequestData {
    private String otp;
    private String text;

    public String getotp() {
        return otp;
    }

    public void setotp(String otp) {
        this.otp = otp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

   
    public String toString() {
        return "RequestData{" +
                "OTP=" + otp +
                ", text='" + text + '\'' +
                '}';
    }
}

