package interface_Test;

interface I1{
	public void x();
}

interface I2{
	public void z();
}


class Interface_rule1 implements I1,I2{
	//�ϳ��� Ŭ������ �������� �������̽��� ���� �� �� �ִ�
	public void x() {
		System.out.println(123);
	}
	public void z() {
		System.out.println(456);
	}
	public static void main(String[] args) {
		Interface_rule1 ad = new Interface_rule1();
		ad.x();
		ad.z();
	}
}