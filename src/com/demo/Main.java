package com.demo;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting operating system...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Operating System Simulator [Version 10.0.19042.1348]");
        TimeUnit.SECONDS.sleep(2);

        while(true){
            System.out.print("Users\\User>");
            String userInput = scanner.nextLine();
            String[] splitedInput = userInput.split("[ ]+");
            String commandName = splitedInput[0];
            Object[] commandArgs = new String[splitedInput.length - 1];
            System.arraycopy(splitedInput, 1, commandArgs, 0, commandArgs.length);
            Terminal command = Factory.getCommand(commandName);
            if(command != null)
                command.execute(commandArgs);
            else
                System.out.println("'" +  command + "'" + " is not recognized as an existing command.");
        }
    }
}