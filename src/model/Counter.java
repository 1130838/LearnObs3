package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brunodevesa on 21/05/15.
 */
public class Counter implements Observable { // its as it was the repository

    private int number;


    public Counter() {
    }

    private List<Observer> listOfInterested = new ArrayList<Observer>();

    public void incrementCounter() {

        for (int i = 0; i < 10; i++) {
            System.out.println(number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number++;

            // condição
            if (number ==5) {
                notifyObservers();
            }
        }
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
}
