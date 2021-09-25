package multiRemoteControl;

public class Main {
    public static void main(String[] args) {
;
        Tv tvOne = new Tv("tvOne");
        Tv tvTwo = new Tv("tvTwo");
        Radio radioOne = new Radio("radioOne");
        Radio radioTwo = new Radio("radioTwo");
        Heater heaterOne = new Heater("heaterOne");
        Heater heaterTwo = new Heater("heaterTwo");

        Remote oneRemote = new Remote();
        oneRemote.addDevice(radioOne);
        oneRemote.addDevice(radioTwo);
        oneRemote.addDevice(tvOne);
        oneRemote.addDevice(tvTwo);
        oneRemote.addDevice(heaterOne);
        oneRemote.addDevice(heaterTwo);
        oneRemote.controller();
    }
}
