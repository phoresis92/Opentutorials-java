package interface_Test;

interface I3{
	public void x();
}

interface I4 extends I3{
	public void z();
}
//�������̽��� ����� �ȴ�.
interface I5 extends I4{
	//private void y();
	/* �������̽��� �� �������̽��� ������ Ŭ������ ��� ������ ���ΰ��� �����Ѵ�. 
	�׷��� ������ �ܺο��� ���� �� �� �ִ� ���� �������� ���� �������� public���� ����Ѵ�. 
	public�� �����ϸ� ���� ������ default�� �Ǵ� ���� �ƴ϶� public�� �ȴ�. 
	�ֳ��ϸ� �������̽��� �ɹ��� ������ public�̱� �����̴�.*/
}



public class Interface_rule2 implements I4 {

	public void z(){
		System.out.println(123);
	}

	public void x() {
		System.out.println(456);
	}
	
	public static void main(String[] args) {
		Interface_rule2 dd = new Interface_rule2();
		dd.z();
		dd.x();
	}
}
