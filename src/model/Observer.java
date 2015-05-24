package model;

/**
 * Created by brunodevesa on 21/05/15.
 */
public interface Observer {

    public void subscribe(Observable observable);
    public void unsubscribe (Observable observable);
    public void update();
}
