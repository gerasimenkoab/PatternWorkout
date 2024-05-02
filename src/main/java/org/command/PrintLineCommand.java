package org.command;

public class PrintLineCommand implements Command{
    LinePrinter printer;
    String commandName;
    public PrintLineCommand(LinePrinter printer){
        this.printer = printer;
        this.commandName = "print line";
    }
    public void execute(){
        printer.printLine();
    }
    public void undo(){

    }
    public String getCommandName(){
        return this.commandName;
    }

}
