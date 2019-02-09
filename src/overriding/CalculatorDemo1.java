package overriding;

class Calcu{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public int avg() {
		return((this.left+this.right)/2);
	}
}

class Subst extends Calcu{
	
	public void sum() {
		System.out.println("��� ����� "+(this.left+this.right)+"�Դϴ�.");
	}
	
	public int avg() {
		return super.avg();
	}
	
	public void sub() {
		System.out.println(this.left-this.right);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		Subst s = new Subst();
		s.setOprands(40,20);
		s.sum();
		System.out.println(s.avg());
		s.sub();
		
	}
}
/*�������̵��� �ϱ� ���ؼ��� �Ʒ��� ������ �������Ѿ� �Ѵ�.
-�޼ҵ��� �̸�
-�޼ҵ� �Ű������� ���ڿ� ������ Ÿ�� �׸��� ����
-�޼ҵ��� ���� Ÿ��
���� ���� �޼ҵ��� ���¸� �����ϴ� ���׵��� ���о 
�޼ҵ��� ����(signature)��� �Ѵ�. 
�� ���� ������ �޼ҵ�� ���� ������ �޶� �߻��� ������.*/
