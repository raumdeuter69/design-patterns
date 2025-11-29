package main.java.patterns.observer;

public interface Subject<T> {
    public void addObserver(Observer<T> o);
    public void removeObserver(Observer<T> o);
    public void notifyObservers();
}
