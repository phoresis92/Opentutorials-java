package polymorphism;

//���� �̸������� ���� �ٸ� ���� ����� ������ �ֱ� ������ �����ε��� �������� �� ����� �� �� �ִ�.
class O{
	public void a(int param) {
		System.out.println("�������");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("�������");
		System.out.println(param);
	}
	
}

public class PolyOverloading {

	public static void main(String[] args) {
	O o = new O();
	o.a(1);
	o.a("bam");
	}
	
}
