package org.command;

public class PrintHelloCommand implements Command{
    HelloPrinter printer;
    String commandName;
    public PrintHelloCommand(HelloPrinter printer){
        this.printer = printer;
        this.commandName  = "print hello";
    }
    @Override
    public void execute() {
        printer.printHello();
    }
    public void undo(){

    }
    public String getCommandName(){
        return this.commandName;
    }
}
