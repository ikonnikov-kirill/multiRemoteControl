package multiRemoteControl;

import java.util.ArrayList;
import java.util.Scanner;

public class Remote {
    private ArrayList<Device> deviceList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void addDevice(Device a) {
        deviceList.add(a);
    }

    public void controller() {
        int count = 0;
        for (Device a : deviceList) {
            System.out.println("position " + count + ", device name " + a.toString());
            count++;
        }
        System.out.println("select device");
        Integer choice2 = scanner.nextInt();
        function(deviceList.get(choice2));
    }


    public void function(Device device1) {
        while (true) {
            System.out.println();
            System.out.println("1 onOff");
            System.out.println("2 up");
            System.out.println("3 down");
            System.out.println("4 left");
            System.out.println("5 right");
            System.out.println("6 switch device");
            System.out.println("0 for end");

            Integer choice = scanner.nextInt();
            if (choice == 0) {
                System.exit(0);
            }
            if (choice == 1) {
                device1.onOffSwitch();
            }
            if (choice == 2) {
                device1.up();
//               if(device1 instanceof Tv){
//                   ((Tv) device1).up();
//               }
//               else if (device1 instanceof Radio){
//                   ((Radio) device1).up();
//               }
//               else if (device1 instanceof Heater)  {
//                    ((Heater) device1).up();
//                                  }
            }
            if (choice == 3) {
                device1.down();
//                if (device1 instanceof Tv){
//                    ((Tv) device1).down();
//                }
//                else if (device1 instanceof Radio){
//                    ((Radio) device1).down();
//                }
//                else if (device1 instanceof Heater) {
//                    ((Heater) device1).down();
//                }
             }
            if (choice == 4) {
                device1.left();
//               if(device1 instanceof Tv){
//                   ((Tv) device1).left();
//               }
//               else if (device1 instanceof Radio){
//                   ((Radio) device1).left();
//               }
//               else if (device1 instanceof Heater){
//                   ((Heater) device1).left();
//                }
            }
            if (choice == 5) {
                device1.right();
//                if(device1 instanceof Tv){
//                    ((Tv) device1).right();
//                }
//                else if (device1 instanceof Radio){
//                    ((Radio) device1).right();
//                }
//                else if (device1 instanceof Heater) {
//                    ((Heater) device1).right();
//                }
            }
            if (choice == 6) {
                controller();
            }
        }
    }

}
