package presentation;

import aplication.IncrementCounterController;
import model.Observable;
import model.Observer;


/**
 * Created by brunodevesa on 21/05/15.
 */
public class MainUI implements Observer {

    IncrementCounterController incrementCounterController;


    public void run() {

        incrementCounterController = new IncrementCounterController(this);
        incrementCounter();

    }

    public void incrementCounter() {

            incrementCounterController.incrementController();
    }


    @Override
    public void subscribe(Observable observable) {

    }

    @Override
    public void unsubscribe(Observable observable) {

    }

    @Override
    public void update() {
        //  JOptionPane.showMessageDialog(null, "hello, i'm the UI and i'm a subscriber of Counter");
        System.out.println("hello, i'm the UI and i'm a subscriber of Counter");

    }
}
