package RemoteControlWithUndo;

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
import SimpleRemoteControl.Light;
import SimpleRemoteControl.LightOnCommand;

public class RemoteLoader {
  public static void main(String[] args) {
      RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

      // Criando todos os dispositivos
      Light livingRoomLight = new Light("Living Room");
      Stereo stereo = new Stereo("Living Room");
      CeilingFan ceilingFan = new CeilingFan("Living Room");
      GarageDoor garageDoor = new GarageDoor("Garage");

      // Criando os comandos para ligar e desligar as luzes
      LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
      LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

      // Criando os comandos para ligar e desligar o som
      StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
      StereoOffCommand stereoOff = new StereoOffCommand(stereo);

      // Criando os comandos para ligar e desligar o ventilador de teto
      CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
      CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

      // Criando os comandos para abrir e fechar a porta da garagem
      GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
      GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

      // Associando os comandos aos slots do controle remoto
      remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
      remoteControl.setCommand(1, stereoOnWithCD, stereoOff);
      remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
      remoteControl.setCommand(3, garageDoorUp, garageDoorDown);

      // Testando o controle remoto
      System.out.println(remoteControl);

      remoteControl.onButtonWasPushed(0);
      remoteControl.offButtonWasPushed(0);
      System.out.println(remoteControl);
      remoteControl.undoButtonWasPushed();

      remoteControl.onButtonWasPushed(1);
      System.out.println(remoteControl);
      remoteControl.undoButtonWasPushed();

      remoteControl.onButtonWasPushed(2);
      remoteControl.offButtonWasPushed(2);
      System.out.println(remoteControl);
      remoteControl.undoButtonWasPushed();

      remoteControl.onButtonWasPushed(3);
      remoteControl.offButtonWasPushed(3);
      System.out.println(remoteControl);
      remoteControl.undoButtonWasPushed();
  }
}
