package model;

/**
 * Created by brunodevesa on 21/05/15.
 */
public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    
}
