package org.example;

public class WeatherEntityDTO {
    private int temperature;
    private boolean rain;
    private SensorEntityDTO sensor;

    public WeatherEntityDTO() {
    }

    public WeatherEntityDTO(int temperature, boolean rain, SensorEntityDTO sensor) {
        this.temperature = temperature;
        this.rain = rain;
        this.sensor = sensor;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isRain() {
        return rain;
    }

    public void setRain(boolean rain) {
        this.rain = rain;
    }

    public SensorEntityDTO getSensor() {
        return sensor;
    }

    public void setSensor(SensorEntityDTO sensor) {
        this.sensor = sensor;
    }
}
