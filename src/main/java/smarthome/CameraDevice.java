//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package smarthome;

/**
 *
 * @author aminoiu
 * @since 5/13/2026
 */
public class CameraDevice extends SecurityDevice {
    private String ip;

    CameraDevice(String deviceName, String securityLevel, boolean isOn, String username) {
        super(deviceName, securityLevel, isOn, username);
    }

    void startRecording() {
        System.out.println("Camera [" + getDeviceName() + "] is recording...");
    }
}