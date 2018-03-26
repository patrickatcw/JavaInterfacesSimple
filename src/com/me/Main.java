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

    }


}
