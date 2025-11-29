package main.java.patterns.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd= new WeatherData();
        CurrentConditionsDisplay crr = new CurrentConditionsDisplay();
        wd.addObserver(crr);
        wd.setMeasurements(0, 0, 0);
        wd.setMeasurements(0.1, 0.2, 0.3);
        
    }
    
}
