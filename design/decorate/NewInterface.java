package main.java.design.decorate;
//װ����ģʽ�����ģʽ���
//���ü̳������ӷ���
//������չ������������չ���������
//�������෽���߼��������ƣ����׳�������
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
