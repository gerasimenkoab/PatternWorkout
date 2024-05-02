package org.command;

import org.main.Demo;

public class CommandDemo extends Demo {
    public CommandDemo(){
        this.helloMessage = "=============== Command is ready.=====================";
    }

    @Override
    public void run() {
        System.out.println(this.helloMessage);
        // creating controlling module (invoker)
        Controller controlModule = new Controller();
        // creating executing units (recievers)
        Switcher switcher = new Switcher();
        HelloPrinter hPrinter = new HelloPrinter();
        LinePrinter lPrinter = new LinePrinter();
        // creating Concrete commands for each reciever
        SwitchOnCommand switchOn = new SwitchOnCommand(switcher);
        PrintHelloCommand printHello = new PrintHelloCommand(hPrinter);
        PrintLineCommand printLine = new PrintLineCommand(lPrinter);
        // setting commands to invoker slots
        controlModule.setCommand(0, switchOn);
        controlModule.setCommand(1,printHello);
        controlModule.setCommand(2,printLine);

        System.out.println(controlModule.toString());

        controlModule.buttonPressed(0);
        controlModule.buttonPressed(1);
        controlModule.buttonPressed(2);
    }
}
