import java.util.ArrayList;
import java.util.List;

public class HostDevice {
    private List<SmartDevices> deviceList = new ArrayList<>();

    public void addDevice(SmartDevices newDevice) {
        deviceList.add(newDevice);
    }

    public void turnDeviceOnOff(SmartDevices devices, boolean turnOn) {
        if (turnOn) {
            devices.isOn = true;
        } else {
            devices.isOn = false;
        }
    }

    public void totalConsomption() {
        float totalConsumption = 0;
        for (SmartDevices device : deviceList) {
            totalConsumption += device.consumption();
        }
        System.out.println("Total consumption is:" + totalConsumption);
    }

    public void stateOfAllDevices() {
        for (SmartDevices device : deviceList) {
            if (device.isOn == true) {
                System.out.println("The status of the " + device.getName() + " device, is: ON " + device.toString());
        } else {
                System.out.println("The status of the " + device.getName() + " device, is: OFF");
        }
        }
    }

    public void verification(SmartDevices device) {
        if (device instanceof SmartLamp) {
            System.out.println("The device " + device.getName() +" is a smartLamp");
        } else if (device instanceof SmartThermostat) {
            System.out.println("The device " + device.getName() +" is a smartThermostat");
        } else {
            System.out.println("The device " + device.getName() +" is a smartSecurityCamera");
        }
    }

}
