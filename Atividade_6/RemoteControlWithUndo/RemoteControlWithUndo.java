package RemoteControlWithUndo;

import RemoteControlWithoutUndo.NoCommand;
import SimpleRemoteControl.Command;

public class RemoteControlWithUndo {
  private Command[] onCommands;
  private Command[] offCommands;
  private Command undoCommand;

  public RemoteControlWithUndo() {
      onCommands = new Command[7];
      offCommands = new Command[7];

      Command noCommand = new NoCommand();
      for (int i = 0; i < 7; i++) {
          onCommands[i] = noCommand;
          offCommands[i] = noCommand;
      }
      undoCommand = noCommand;
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
      onCommands[slot] = onCommand;
      offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
      onCommands[slot].execute();
      undoCommand = onCommands[slot];
  }

  public void offButtonWasPushed(int slot) {
      offCommands[slot].execute();
      undoCommand = offCommands[slot];
  }

  public void undoButtonWasPushed() {
      undoCommand.undo();
  }

  public String toString() {
      StringBuilder stringBuff = new StringBuilder();
      stringBuff.append("\n------ Remote Control -------\n");
      for (int i = 0; i < onCommands.length; i++) {
          stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                  + "    " + offCommands[i].getClass().getName() + "\n");
      }
      stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
      return stringBuff.toString();
  }
}
