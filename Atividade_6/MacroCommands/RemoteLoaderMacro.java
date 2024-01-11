package MacroCommands;

import RemoteControlWithUndo.RemoteControlWithUndo;
import RemoteControlWithoutUndo.CeilingFan;
import RemoteControlWithoutUndo.CeilingFanOffCommand;
import RemoteControlWithoutUndo.CeilingFanOnCommand;
import RemoteControlWithoutUndo.GarageDoor;
import RemoteControlWithoutUndo.GarageDoorDownCommand;
import RemoteControlWithoutUndo.GarageDoorUpCommand;
import RemoteControlWithoutUndo.LightOffCommand;
import RemoteControlWithoutUndo.Stereo;
import RemoteControlWithoutUndo.StereoOffCommand;
import RemoteControlWithoutUndo.StereoOnWithCDCommand;
import SimpleRemoteControl.Command;
import SimpleRemoteControl.Light;
import SimpleRemoteControl.LightOnCommand;


public class RemoteLoaderMacro {
  public static void main(String[] args) {
    
      RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

      // Criando os objetos que serão controlados pelos comandos
      Light livingRoomLight = new Light("Living Room");
      Stereo stereo = new Stereo("Living Room");
      CeilingFan ceilingFan = new CeilingFan("Living Room");
      GarageDoor garageDoor = new GarageDoor("");

      // Criando os comandos individuais
      LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
      LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
      StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
      StereoOffCommand stereoOff = new StereoOffCommand(stereo);
      CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
      CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
      GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
      GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

      // Criando o comando composto
      Command[] partyOn = { livingRoomLightOn, stereoOnWithCD, ceilingFanOn, garageDoorUp };
      Command[] partyOff = { livingRoomLightOff, stereoOff, ceilingFanOff, garageDoorDown };
      MacroCommand partyOnMacro = new MacroCommand(partyOn);
      MacroCommand partyOffMacro = new MacroCommand(partyOff);

      // Associando os comandos aos botões do controle remoto
      remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

      // Testando os comandos
      System.out.println(remoteControl);
      remoteControl.onButtonWasPushed(0);
      remoteControl.offButtonWasPushed(0);
      remoteControl.undoButtonWasPushed();
  }
}
