package com.me;

//step 3 create deskphone class
public class Deskphone implements ITelephone{

    //step 4 fields
    private int myNumber;
    private boolean isRinging;

    //step 5 create a constructor
    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    //step 6 implement methods
    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

//step 7 create an instance of the desktop class in main





