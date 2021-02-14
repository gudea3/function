public class SmartThermostat extends SmartDevices{
private int temperature;

    @Override
    float consumption() {
        float value;
        if (!isOn) {
            return value = 0;
        } else {
            return value = 0.55f;
        }
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean isOn() {
        return super.isOn();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setOn(boolean on) {
        super.setOn(on);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "SmartThermostat{" +
                "temperature=" + temperature +
                '}';
    }
}
