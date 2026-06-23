package smarthome;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 *
 * @author aminoiu
 * @since 5/11/2026
 */
public class SmartDevice {
    private String deviceName;
    private boolean isOn;

    SmartDevice() {
        deviceName = "Uknown Device";
        isOn = false;
    }

    SmartDevice(String deviceName, boolean isOn) {
        this.deviceName = deviceName;
        this.isOn = isOn;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        System.out.println("Device name is set to: " + deviceName);
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Device is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Device is off");
    }

    public boolean isOn() {
        return isOn;
    }

    void displayStatus() {
        System.out.println("Device name: " + deviceName + ", is " + (isOn ? "ON" : "OFF"));
    }

}