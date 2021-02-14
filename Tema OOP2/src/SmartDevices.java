public abstract class  SmartDevices {
    public String name;
    public boolean isOn;

    abstract float consumption();

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
