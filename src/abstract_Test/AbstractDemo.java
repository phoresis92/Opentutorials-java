package abstract_Test;


abstract class A{
	
	abstract void a(); /*{
		System.out.println("abstract �޼ҵ� a()");
	}*/
	//abstract method ��ü�� ���� �� ����.
	void b() {
		System.out.println("�Ϲ� �޼ҵ� b()");
	}
	//abstract class �� abstract method �� �ƴ� �Ϲ� �޼ҵ尡 ������ �� �ִ�.
	
}

class B extends A{
	int a = 1;
	void a() {
		System.out.println("abstract method a();");
	}
	void b(int a) {

		System.out.println(a);
	}
}


public class AbstractDemo {
	public static void main(String[] args) {
		//A intant_abstract = new A();
		//abstract class�� �ν��Ͻ�ȭ �ϸ� ������ �߻��Ѵ�. ��ü���� �޼ҵ��� ������ �������� �ʱ� ������
		
		B ins_b = new B();
		
		ins_b.a();
		ins_b.b();
		ins_b.b(3);
		
	}
}
