package org.command;

public class EmptyCommand implements Command{
    String commandName = "Empty";
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
    public String getCommandName(){
        return this.commandName;
    }

}
