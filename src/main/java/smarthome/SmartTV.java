package smarthome;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 *
 * @author aminoiu
 * @since 5/11/2026
 */
public class SmartTV extends SmartDevice {
    private int resolution;
    private int channel;

    SmartTV() {
        channel = 1;
        resolution = 1080;
    }

    SmartTV(String deviceName, boolean isOn, int resolution, int channel) {
        super(deviceName, isOn);
        this.resolution = resolution;
        this.channel = channel;
    }

    void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Channel for device [" + getDeviceName() + "] is set to: " + channel);
    }

    void getResolution() {
        System.out.println("Resolution for device [" + getDeviceName() + "] is: " + resolution);
    }
}