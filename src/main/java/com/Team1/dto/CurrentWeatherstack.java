package com.Team1.dto;

public class CurrentWeatherstack {
    private double temperature;
    private double wind_speed;
    private String wind_dir;
    private double pressure;
    private double humidity;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "CurrentWeatherstack{" +
                "temperature=" + temperature +
                ", wind_speed=" + wind_speed +
                ", wind_dir='" + wind_dir + '\'' +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
