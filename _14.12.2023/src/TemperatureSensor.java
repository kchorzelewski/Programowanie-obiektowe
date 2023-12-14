public class TemperatureSensor implements Sensor{
    public double temperature = 22.0;
    public String status = "On";

    @Override
    public double readValue() {
        return temperature;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        temperature = 0;
        status = "Reset";
    }
}
