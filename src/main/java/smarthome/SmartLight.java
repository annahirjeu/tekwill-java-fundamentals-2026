package smarthome;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 *
 * @author aminoiu
 * @since 5/11/2026
 */
public class SmartLight extends SmartDevice {
    private int brightness;

    SmartLight() {
        brightness = 50;
    }

    SmartLight(String deviceName, boolean isOn, int brightness) {
        super(deviceName, isOn);
        this.brightness = brightness;
    }

    void changeBrightness(int newBrightness) {
        brightness = newBrightness;
        System.out.println("Brightness for device [" + getDeviceName() + "] is set to: " + brightness);
    }

    @Override
    void displayStatus() {
        System.out.println("Device name: " + getDeviceName() + ", is " + (isOn() ? "ON" : "OFF") + ", brightness: " + brightness);
    }
}