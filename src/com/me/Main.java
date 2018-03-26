package com.me;
/*
interface -
a bit like a class, except a Java interface can only contain method
signatures and fields. An Java interface cannot contain an implementation
of the methods, only the signature (name, parameters and exceptions) of
the method
 */

public class Main {

    public static void main(String[] args) {

        //step 7 cteating an instance of the desktop class
        ITelephone patricksPhone;
        patricksPhone = new Deskphone(123456);
        patricksPhone.powerOn();
        patricksPhone.callPhone(123456);
        patricksPhone.answer();

        //step 8 create mobilephone class

        //step 12 create an instance
        patricksPhone = new Mobilephone(24565);

        //step 13 call methods
        patricksPhone.powerOn();
        patricksPhone.callPhone(2456);
        patricksPhone.answer();

        //step 14 run this

    }
}

/*
results
No action taken, desk phone does not have a power button
Ring ring
Answering the desk phone
Mobile phone powered up
Mobile phone not on or number different
*/