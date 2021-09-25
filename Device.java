package multiRemoteControl;

public abstract class Device {

    private Boolean onOff = false;
    private int volume = 0;
    private int tempChanWave = 0;
    private String description;

    public Device(String descr1) {
    this.description=descr1;
    }

    public abstract void up ();

    public abstract void down ();

    public abstract void left ();

    public abstract void right ();

//    public void upVolume() {
//        if (onOff == false) {
//            System.out.println("Device is off");
//            System.out.println("nothing will work until device is turned on");
//            return;
//        }
//        volume = volume + 1;
//        System.out.println("volume increased by 1 to " + volume);
//    }
//
//    public void downVolume() {
//        if (onOff == false) {
//            System.out.println("Device is off");
//            System.out.println("nothing will work until device is turned on");
//            return;
//        }
//        if (volume == 0) {
//            System.out.println("volume 0, cant reduce volume any more");
//            return;
//        }
//        volume = volume - 1;
//        System.out.println("volume decreased by 1 to " + volume);
//    }
//
//    public void upTempChanWave() {
//        if (onOff == false) {
//            System.out.println("Device is off");
//            System.out.println("nothing will work until device is turned on");
//            return;
//        }
//        tempChanWave = tempChanWave + 1;
//        System.out.println("temperature/chanell/wave increased by 1 to " + tempChanWave);
//    }
//
//    public void downTempChanWave() {
//        if (onOff == false) {
//            System.out.println("Device is off");
//            System.out.println("nothing will work until device is turned on");
//            return;
//        }
//        tempChanWave = tempChanWave - 1;
//        System.out.println("temperature/chanell/wave decreased by 1 to " + tempChanWave);
//    }

    public void onOffSwitch() {
        if (onOff == false) {
            System.out.println("power was off");
            onOff = true;
            System.out.println("power now turned on");
            return;
        }
        if (onOff == true) {
            System.out.println("power was on");
            onOff = false;
            System.out.println("power now turned off");
        }
    }

    @Override
    public String toString() {
        return description;
    }
}
