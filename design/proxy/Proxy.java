package main.java.design.proxy;

//����ģʽ��װ����ģʽ����һ��
//˼��ֱ��Ǵ�����Ҫ����Ȩ�޿���
//���Դ���ĳ�ʼ���ڹ��캯����ʵ��
//װ����ģʽʹ����������µķ���
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
