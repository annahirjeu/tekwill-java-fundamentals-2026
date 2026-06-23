package smarthome;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

import java.util.Scanner;

/**
 *
 * @author aminoiu
 * @since 5/11/2026
 */
public class SmartHome {
    public static void main(String[] args) {
        SmartDevice smartDevice = new SmartDevice("Smart Plug", true);
        smartDevice.displayStatus();
        smartDevice.turnOff();

        SmartLight smartLight = new SmartLight("Living Room Light", true, 50);
        smartLight.displayStatus();
        smartLight.turnOff();

        SmartTV smartTV = new SmartTV("Living Room TV", true, 1080, 1);
        smartTV.displayStatus();
        smartTV.turnOff();

        SmartTV smartTv2 = new SmartTV();
        smartTv2.displayStatus();
        smartTv2.turnOn();

        CameraDevice cameraDevice = new CameraDevice("Front Door Camera", "High", true, "admin");
        cameraDevice.displayStatus();
        cameraDevice.getSecurityLevel();
        cameraDevice.startRecording();
        cameraDevice.turnOff();

        SmartHome smartHome = new SmartHome();
        SmartHome.Room livingRoom = smartHome.new Room("Living Room");
        livingRoom.addDevices(new SmartDevice[]{smartLight, smartTV});
        livingRoom.displayRoom();
    }

    class Room {
        String roomName;
        SmartDevice[] devices = new SmartDevice[2];

        Room(String roomName) {
            this.roomName = roomName;
        }

        void displayRoom() {
            System.out.println("Room Name: " + roomName);
            for (SmartDevice device : devices) {
                device.displayStatus();
            }
        }

        void addDevices(SmartDevice[] addedDevices) {
            devices = addedDevices;
        }
    }
}