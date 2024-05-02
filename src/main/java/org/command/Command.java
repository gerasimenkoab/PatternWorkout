package org.command;

public interface Command {
    public void execute();
    public void undo();
    public String getCommandName();
}
