package main.java.design.observe;

import java.util.List;

public class MessageSubject implements  Subject{
    public List<Observer> list;


    public void register(Observer observer) {
        list.add(observer);
    }

    public void notifyObj(Observer observer) {
        for (int i =0; i< list.size();i++){
            list.get(i).update();
        }
    }

    public void remove(Observer observer) {
        list.remove(observer);

    }
}
