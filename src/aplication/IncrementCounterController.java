package aplication;

import model.Counter;
import model.LimitWatchDog;
import presentation.MainUI;

/**
 * Created by brunodevesa on 24/05/15.
 */
public class IncrementCounterController {

    MainUI mainUI;
    Counter counter;
    LimitWatchDog limitWatchDog;

    public IncrementCounterController(MainUI mainUI) {

        this.mainUI = mainUI;
        counter = new Counter();
        limitWatchDog = new LimitWatchDog();

        counter.addObserver(limitWatchDog); // counter wants be observed by limitWatchDog
        mainUI.subscribe(limitWatchDog); // mainUI wants to know about limitWatchDog
        limitWatchDog.addObserver(mainUI); // limitWatchDog want to be observed by UI

        limitWatchDog.isViolated(5);

    }

    public void incrementController(){
        counter.incrementCounter();
    }
}
