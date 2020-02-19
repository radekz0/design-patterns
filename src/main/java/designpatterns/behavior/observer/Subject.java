package designpatterns.behavior.observer;

public interface Subject {
    void addSubscriber(Subscriber subscriber);
    void uploadVideo(String name);
}
