package main.java.design.observe;
//���۲���
public interface Subject {
    public void register(Observer obj);
    public void notifyObj(Observer obj);
    public void remove(Observer obj);
}
