package designpatterns.behavior.observer;

import java.util.logging.Logger;

public class Subscriber implements Observer{
    Logger logger = Logger.getLogger(Subscriber.class.getName());

    @Override
    public void notifySubscriber() {
        logger.info("Video uploaded.");
    }
}
