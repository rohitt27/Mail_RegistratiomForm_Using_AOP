package com.example.applicationLecture.ioc;

public class Airtel implements Sim {

    @Override
    public void calling() {
        System.out.println("In Airtel Calling");
    }

    @Override
    public void msg() {
        System.out.println("In Airtel Msg");
    }
}
