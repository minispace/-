package main.java.design.strategy;

//����ģʽ
//ʵ���Ͻ�ʵ�ַ��ڼ̳�����
//���㽫�㷨���뿪��������չ
//ȱ�㣺ʹ����Ҫ֪�����еĲ��� 2�����Զ��������Ӳ��ٹ�����
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
