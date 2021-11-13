package com.demo.commands;

import com.demo.Terminal;

public class Help implements Terminal {

    @Override
    public void execute(Object[] args) {
        if(args.length == 0){
            print();
        } else{
            printCommandHelp((String)args[0]);
        }
    }

    private void print(){
        System.out.println("Information about each command." + "\n" +
                           "DATE     " + "Display the date." + "\n" +
                           "HELP     " + "Provides Help information for OS commands." + "\n" +
                           "EXIT     " + "Quits the CMD.EXE program (command interpreter).");
    }

    private void printCommandHelp(String command){
    }
}
