package main.java.patterns.observer;

public class CurrentConditionsDisplay implements Observer<WeatherInfo> {

    @Override
    public void update(WeatherInfo info) {
        System.out.println("Current Conditions:");
        System.out.println("Temp: " + info.temperature());
        System.out.println("Humidity: " + info.humidity());
        System.out.println("Pressure: " + info.pressure());
        System.out.println();
    }
}