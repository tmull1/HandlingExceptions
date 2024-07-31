package application;

public class StandardSensor implements Sensor {
    private int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        // Always on, do nothing
    }

    @Override
    public void setOff() {
        // Always on, do nothing
    }

    @Override
    public int read() {
        return value;
    }
}

