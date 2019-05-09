package main.java.design.factory.simplefactory;

//简单工厂
//使用时常与单例合用
//好处：spring利用工厂统一处理各类装配 利用配置或注解
//缺点：耦合高，不管怎么样都要来维护这个简单工厂
//工厂模式简单来讲并不好用 业务逻辑复杂就。。。 当然抽象工厂做了一定优化，实际效果也不好
//spring 利用ioc和反射将工厂设计 配置注解而不需要改具体工厂类
public  class simpleFactory {
    public static Obj create(String objectname){
         if(objectname=="objA"){
             return new ObjA();
         }
         if(objectname=="objB"){
            return new ObjB();
         }
         return null;
    }
}
