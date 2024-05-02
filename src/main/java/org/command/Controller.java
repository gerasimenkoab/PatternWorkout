package org.command;
import java.lang.StringBuffer;

public class Controller {
    Command[] slots;
    public Controller(){
        slots = new Command[7];
        for (int i=0; i < slots.length; i++){
            slots[i] = new EmptyCommand();
        }
    }

    public void setCommand(int i, Command command){
        slots[i] = command;
    }

    public void buttonPressed(int i){
        slots[i].execute();
    }
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n ------ Controller Slots: ----------\n");
        for (int i =0; i < slots.length; i++) {
            stringBuff.append("[slot " + i + "] " + slots[i].getCommandName() + " \n");
        }
        return stringBuff.toString();
    }
}
