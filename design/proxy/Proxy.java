package main.java.design.proxy;

//代理模式与装饰者模式表面一致
//思想分别是代理主要用于权限控制
//所以代理的初始化在构造函数中实现
//装饰器模式使用用于添加新的方法
public class Proxy implements IService{
    public  IService iService;


    public void dosomething() {
        //before do
        iService.dosomething();
        //after do
    }

    public Proxy(){
        iService=new AccService();
    }
}
