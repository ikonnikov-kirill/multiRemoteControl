package multiRemoteControl;

import java.util.ArrayList;
import java.util.Random;

public class Radio extends Device {
    private Integer volume;
    private ArrayList<Integer> radioWaves = new ArrayList<>();
    private Integer radioPosition = 0;
    Random random = new Random();

    public Radio(String descr1) {
        super(descr1);
        stationGenerator();
        volume=0;
    }

    @Override
    public void up() {
        volume = volume + 1;
        System.out.println("Volume increased by 1 to " + volume);
    }

    @Override
    public void down() {
        if (volume == 0) {
            System.out.println("Cannot reduce volume below 0");
            return;
        }

        volume = volume - 1;
        System.out.println("Volume decreased by 1 to " + volume);
    }
    @Override
    public void left() {

        if (radioPosition == 0) {
            System.out.println("last positions");
            return;
        }
        radioPosition = radioPosition - 1;
        System.out.println("new radio position " + radioWaves.get(radioPosition));
    }
    @Override
    public void right() {
        if (radioPosition == radioWaves.size()) {
            System.out.println("last position");
            return;
        }
        radioPosition = radioPosition + 1;
        System.out.println("new radio position " + radioWaves.get(radioPosition));
    }

    public void stationGenerator() {
        Integer a = random.nextInt(25 - 5) + 5;
        for (int i = 0; i < a; i++) {
            Integer b = random.nextInt(100 - 5) + 5;
            radioWaves.add(b);
        }
    }
}
