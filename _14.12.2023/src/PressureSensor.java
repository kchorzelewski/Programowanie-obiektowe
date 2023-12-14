public class PressureSensor implements Sensor {
    public double pressure = 100.0;
    public String status = "On";

    @Override
    public double readValue() {
        return pressure;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        pressure = 0;
        status = "Reset";
    }
}
