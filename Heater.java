package multiRemoteControl;

import java.util.ArrayList;

public class Heater extends Device {
    private Integer tempreture = 0;

    public Heater(String descr1) {
        super(descr1);
    }
    @Override
    public void up() {
        tempreture = tempreture + 1;
        System.out.println("tempreture increased by 1 to " + tempreture);
    }
    @Override
    public void down() {
        tempreture = tempreture - 1;
        System.out.println("tempreture decreased by 1 to " + tempreture);
    }
    @Override
    public void left() {

    }

    @Override
        public void right() {

    }
}
