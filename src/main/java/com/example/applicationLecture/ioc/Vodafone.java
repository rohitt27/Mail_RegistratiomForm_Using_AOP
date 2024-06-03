package com.example.applicationLecture.ioc;

import com.example.applicationLecture.ioc.Sim;

public class Vodafone implements Sim {

    @Override
    public void calling() {
        System.out.println("In Vodafone Calling");
    }

    @Override
    public void msg() {
        System.out.println("In Vodafone Msg");
    }
}
