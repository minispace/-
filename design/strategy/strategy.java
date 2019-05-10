package main.java.design.strategy;

//策略模式
//实际上将实现放在继承类里
//方便将算法分离开，易于扩展
//缺点：使用需要知道所有的策略 2、策略多代码会增加不少工作量
public class Strategy {
    private Discountstrategy strate;
    public Strategy(Discountstrategy strate){
        this.strate=strate;
    }
    public double getdiscount(double price){
        return strate.getdiscount(price);
    }

    public void changeStrategy(Discountstrategy strate){
        this.strate=strate;
    }
}
