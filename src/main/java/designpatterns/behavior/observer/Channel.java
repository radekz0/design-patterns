package designpatterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private List<Subscriber> subscriberList = new ArrayList<>();
    private String channelName;

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void uploadVideo(String name) {
        notifySubscribers();
    }

     private void notifySubscribers() {
        subscriberList.forEach(i -> i.notifySubscriber());
    }
}
