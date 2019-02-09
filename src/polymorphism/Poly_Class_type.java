package polymorphism;
//��Ӱ� �������̵� �׸��� ����ȯ�� �̿��� �������̴�. (polymorphism)
class A{
	public String x() {
		return "A.x";
	}
}

class B extends A{
	public String y() {
		return "yyy";
	}
	public String x() {
		return "B.x";
	}
}

class B2 extends A{
	public String x() {
		return "B2.x";
	}
}

public class Poly_Class_type {
	public static void main(String[] args) {
		A obj = new B();  // Ŭ���� B�� ������ ���� Ŭ���� A
		obj.x();
		//obj.y();
		A obj2 = new B2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
		/*Ŭ���� B�� Ŭ���� A�� ������ Ÿ������ �ν��Ͻ�ȭ ���� �� 
		Ŭ���� A�� �����ϴ� �ɹ����� Ŭ���� B�� �ɹ��� �ȴ�. 
		���ÿ� Ŭ���� B���� �������̵��� �ɹ��� ���۹���� �״�� �����Ѵ�. */
	}
}
/*Ŭ���� B�� ������ ���� Ŭ���� A�� �ϸ� Ŭ���� B�� ��ġ Ŭ���� A�ΰ�ó�� �����ϰ� �Ǵ� ���̴�. 
Ŭ���� B�� ����ϴ� ���忡���� Ŭ���� B�� Ŭ���� A�ΰ�ó�� ����ϸ� �ȴ�. */

