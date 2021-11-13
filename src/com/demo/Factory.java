package com.demo;

import com.demo.commands.Date;
import com.demo.commands.Exit;
import com.demo.commands.Help;

public abstract class Factory {
    public static Terminal getCommand(String commandName){
        if(commandName.equalsIgnoreCase("date")){
            return new Date();
        }else if(commandName.equalsIgnoreCase("help")){
            return new Help();
        }else if(commandName.equalsIgnoreCase("exit")){
        return new Exit();
    }
        else{
            return null;
        }
    }
}
