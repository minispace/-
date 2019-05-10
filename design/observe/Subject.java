package main.java.design.observe;
//±ªπ€≤Ï’ﬂ
public interface Subject {
    public void register(Observer obj);
    public void notifyObj(Observer obj);
    public void remove(Observer obj);
}
