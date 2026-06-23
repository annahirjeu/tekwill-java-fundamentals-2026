//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package smarthome;

/**
 *
 * @author aminoiu
 * @since 5/13/2026
 */
public class SecurityDevice extends SmartDevice {
    protected String username;
    protected String securityLevel;

    SecurityDevice(String deviceName, String securityLevel, boolean isOn, String username) {
        super(deviceName, isOn);
        this.securityLevel = securityLevel;
        this.username = username;
    }

    public void getSecurityLevel() {
        System.out.println("Security level for device [" + getDeviceName() + "] is: " + securityLevel);
    }
}