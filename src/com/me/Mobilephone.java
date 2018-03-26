package com.me;

//step 8 mobilephone class
public class Mobilephone implements ITelephone{

    //step 9 fields
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    //step 10 create a constructor
    public Mobilephone(int myNumber) {
        this.myNumber = myNumber;
    }

    //step 11 implement methods
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");

    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
        }else{
            System.out.println("Phone is switched off");

        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        }else{
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

//step 12 go back to main

