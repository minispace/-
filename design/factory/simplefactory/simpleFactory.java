package main.java.design.factory.simplefactory;

//�򵥹���
//ʹ��ʱ���뵥������
//�ô���spring���ù���ͳһ�������װ�� �������û�ע��
//ȱ�㣺��ϸߣ�������ô����Ҫ��ά������򵥹���
//����ģʽ�������������� ҵ���߼����Ӿ͡����� ��Ȼ���󹤳�����һ���Ż���ʵ��Ч��Ҳ����
//spring ����ioc�ͷ��佫������� ����ע�������Ҫ�ľ��幤����
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
