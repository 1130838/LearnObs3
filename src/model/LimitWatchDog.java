package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brunodevesa on 21/05/15.
 */
public class LimitWatchDog implements Limitable, Observable, Observer {

    private List<Observer> listOfInterested = new ArrayList<Observer>();

    public LimitWatchDog() {
    }

    @Override
    public boolean isViolated(int number) {

        return number > 5;
    }

    @Override
    public void addObserver(Observer observer) {
        listOfInterested.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listOfInterested.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (int i = 0; i < listOfInterested.size(); i++) {
            listOfInterested.get(i).update();

        }
    }

    @Override
    public void subscribe(Observable observable) {

    }

    @Override
    public void unsubscribe(Observable observable) {

    }

    @Override
    public void update() {
        notifyObservers();
    }
}
