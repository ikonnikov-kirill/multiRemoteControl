package multiRemoteControl;

import java.util.ArrayList;
import java.util.Random;

public class Tv extends Device {
    Random random = new Random();
    private Integer volume;
    private ArrayList<Integer> tvChannels = new ArrayList<>();
    private Integer tvPosition = 0;

    public Tv(String descr1) {
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
        if (tvPosition == 0) {
            System.out.println("last positions");
            return;
        }
        tvPosition = tvPosition - 1;
        System.out.println("new tv position " + tvChannels.get(tvPosition));
    }
    @Override
    public void right() {
        if (tvPosition == tvChannels.size()) {
            System.out.println("last position");
            return;
        }
        tvPosition = tvPosition + 1;
        System.out.println("new TV position " + tvChannels.get(tvPosition));
    }

    public void stationGenerator() {
        Integer a = random.nextInt(25 - 5) + 5;
        for (int i = 0; i < a; i++) {
            Integer b = random.nextInt(100 - 5) + 5;
            tvChannels.add(b);
        }
    }
}