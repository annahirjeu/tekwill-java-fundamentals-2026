//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

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
    }
}