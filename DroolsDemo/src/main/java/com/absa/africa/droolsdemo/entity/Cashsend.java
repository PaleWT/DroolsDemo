package com.absa.africa.droolsdemo.entity;

public class Cashsend {
    private String mobileNo;
    private String pin;
    private double cashsendAmount;

    private String message;

    public Cashsend() {
    }

    public Cashsend(String mobileNo, String pin, double cashsendAmount) {
        this.mobileNo = mobileNo;
        this.pin = pin;
        this.cashsendAmount = cashsendAmount;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getCashsendAmount() {
        return cashsendAmount;
    }

    public void setCashsendAmount(double cashsendAmount) {
        this.cashsendAmount = cashsendAmount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
