package overloading;

public class OverloadingDemo {
	void A() {System.out.println("void A()");}
	void A(int arg1) {System.out.println("void A(int arg1)");}
	void A(String arg1) {System.out.println("void A(String arg1)");}
	//int A() {System.out.println("void A()");}
	
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		od.A(1);
		od.A("ddd");
	}
}
/*�����ε�(Overloading) : ���� �̸��� �޼ҵ带 ���� �� �����鼭 
�Ű������� ������ ������ �ٸ����� �ϴ� ���

�������̵�(Overriding) : ���� Ŭ������ ������ �ִ� �޼ҵ带 
���� Ŭ������ ������ �ؼ� ����Ѵ�.*/


/*�����ε�(Overloading)�� �������̵�(Overriding) ��������

����	�����ε�	�������̵� 

�޼ҵ� �̸� 	����	���� 

�Űܺ���, Ÿ�� 	�ٸ�	���� 

���� Ÿ�� 	�������	���� */

