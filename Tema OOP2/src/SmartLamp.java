public class SmartLamp extends SmartDevices {
    private int brigthness;
    private String color;


    @Override
    float consumption() {
        float value;
        if (!isOn) {
            return value = 0;

        } else {
            return value = 0.75f;
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

    public int getBrigthness() {
        return brigthness;
    }

    public void setBrigthness(int brigthness) {
        this.brigthness = brigthness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartLamp{" +
                "brigthness=" + brigthness +
                ", color='" + color + '\'' +
                '}';
    }
}

