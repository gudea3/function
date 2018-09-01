public class Main {

    public static void main(String[] args) {

        SmartDevices lamp1 = new SmartLamp();
        SmartDevices lamp2 = new SmartLamp();
        SmartDevices thermostat = new SmartThermostat();
        SmartDevices camera1 = new SmartSecurityCamera();
        SmartDevices camera2 = new SmartSecurityCamera();

        lamp1.setName("Lamp1");
        ((SmartLamp) lamp1).setBrigthness(25);
        ((SmartLamp) lamp1).setColor("blue");

        lamp2.setName("Lamp2");
        ((SmartLamp) lamp2).setBrigthness(55);
        ((SmartLamp) lamp2).setColor("white");

        thermostat.setName("Thermostat");
        ((SmartThermostat) thermostat).setTemperature(22);

        camera1.setName("Camera1");
        ((SmartSecurityCamera) camera1).isOn();
        ((SmartSecurityCamera) camera1).setStartFilming(true);

        camera2.setName("Camera2");

        HostDevice hostDevice = new HostDevice();

        hostDevice.addDevice(lamp1);
        hostDevice.addDevice(lamp2);
        hostDevice.addDevice(thermostat);
        hostDevice.addDevice(camera1);
        hostDevice.addDevice(camera2);

        hostDevice.turnDeviceOnOff(lamp1, true);
        hostDevice.turnDeviceOnOff(camera1, true);
        hostDevice.turnDeviceOnOff(thermostat, true);

        hostDevice.stateOfAllDevices();

        hostDevice.totalConsomption();

        hostDevice.verification(lamp1);



    }
}
