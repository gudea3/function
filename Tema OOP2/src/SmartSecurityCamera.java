public class SmartSecurityCamera extends SmartDevices {
    boolean startFilming;

    @Override
    float consumption() {
        float value;
        if (!isOn) {
            return value = 0;

        } else if (isOn && !startFilming) {
            return value = 1.2f;
        } else {
            return value = 1.7f;
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

    public boolean isStartFilming() {
        return startFilming;
    }

    public void setStartFilming(boolean startFilming) {
        this.startFilming = startFilming;
    }

    @Override
    public String toString() {
        return "SmartSecurityCamera{" +
                "startFilming=" + startFilming +
                '}';
    }
}