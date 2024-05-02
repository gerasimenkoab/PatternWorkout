package org.command;

public class SwitchOnCommand implements Command{
    Switcher switcher;
    String commandName;
    public SwitchOnCommand(Switcher s){
        this.switcher = s;
        commandName = "turn switcher";
    }
    public void execute(){
        this.switcher.on();
    }
    public void undo(){
        this.switcher.off();
    }
    public String getCommandName(){
        return this.commandName;
    }

}
