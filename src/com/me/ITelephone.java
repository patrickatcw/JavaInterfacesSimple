package com.me;

//step 1 create interface
public interface ITelephone {

    //step 2 defining the actual methods from the actual interface
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    //step 3 now create a new class called Deskphone

}
