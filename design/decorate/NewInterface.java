package main.java.design.decorate;
//装饰器模式与策略模式相近
//利用继承来增加方法
//易于扩展，不过容易扩展出过多的类
//而且这类方法逻辑过于相似，容易出现问题
public class NewInterface implements SimpleInterface {
    private SimpleInterface simpleInterface;
    public NewInterface(SimpleInterface simpleInterface){
        super();
        this.simpleInterface=simpleInterface;
    }
    public String dosomething() {
        //before do
        System.out.println("before dosomething");
        simpleInterface.dosomething();
        System.out.println("after dosomething");
        return "";
    }

}
