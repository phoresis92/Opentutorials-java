package polymorphism;

interface I2{
	public String A();
}

interface I3{
	public String B();
}

class D implements I2,I3{
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}

public class Interface_Poly {

	public static void main(String[] args) {
		D obj = new D();
		I2 obj2 = new D();
		I3 obj3 = new D();
		
		System.out.println(obj.A()); // A
		System.out.println(obj.B()); // B
		
		System.out.println(obj2.A()); // A
		//System.out.println(obj2.B());
		
		//System.out.println(obj3.A());
		System.out.println(obj3.B()); // B
		
	}
}

/*�̰��� �������̽��� �ſ� �߿��� Ư¡ ���� �ϳ��� �����ش�. 
�ν��Ͻ� objI2�� ������ Ÿ���� I2�� �Ѵٴ� ���� �ν��Ͻ��� �ܺο��� ������ �� �ִ�
���� ��ġ�� �ν��Ͻ� I2�� �ɹ��� �����Ѵٴ� �ǹ̰� �ȴ�. �ν��Ͻ� I2�� I3�� ���ؼ�
�ϳ��� Ŭ������ �پ��� ���¸� ��� �Ǵ� ���̴�.*/
