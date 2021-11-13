package com.demo.commands;

import com.demo.Terminal;

public class Exit implements Terminal {

    @Override
    public void execute(Object[] args) {
        if(args.length!=0){
            System.out.println();
        }
        System.exit(0);
    }
}
