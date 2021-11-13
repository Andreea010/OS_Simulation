package com.demo.commands;

import com.demo.Terminal;

public class Date implements Terminal {

    @Override
    public void execute(Object[] args){
        java.util.Date date = new java.util.Date();
        System.out.println(date.toString());
    }
}
