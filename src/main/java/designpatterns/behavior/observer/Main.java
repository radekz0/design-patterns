package designpatterns.behavior.observer;

/*
Observer is a behavioral design pattern. It specifies communication between objects: observable and observers.
An observable is an object which notifies observers about the changes in its state. For example youtube channel and it's subscribers.
*/


public class Main {

    public static void main(String[] args) {
        Subject channel = new Channel("Radek's channel");
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        channel.addSubscriber(s1);
        channel.addSubscriber(s2);

        channel.uploadVideo("A new video");
    }
}
