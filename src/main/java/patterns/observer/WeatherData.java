package main.java.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject<WeatherInfo> {

    List<Observer<WeatherInfo>> observers;
       private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<Observer<WeatherInfo>>();
    }

    @Override
    public void addObserver(Observer<WeatherInfo> o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer<WeatherInfo> o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
                WeatherInfo data = new WeatherInfo(temperature, humidity, pressure);
        for(Observer<WeatherInfo> o : observers)
        {
            o.update(data);
        }
    }

    public void setMeasurements(double humidity, double temperature, double pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

}
