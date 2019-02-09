package inheritanceExam1;

class Calculator{
	int left, right;
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class SubstractCal extends Calculator{
	public SubstractCal(int left, int right) {
		super(left, right);
/*		super Ű����� �θ� Ŭ������ �ǹ��Ѵ�. 
		���⿡ ()���̸� �θ� Ŭ������ �����ڸ� �ǹ��ϰ� �ȴ�.
		�̷��� �ϸ� �θ� Ŭ������ �⺻ �����ڰ� �������� ������ �߻����� �ʴ´�.
		���� Ŭ������ �����ڿ��� super�� ����� �� ������ ����
		super�� ���� ���� ��Ÿ���� �Ѵٴ� ���̴�. 
		�� �θ� �ʱ�ȭ�Ǳ� ���� �ڽ��� �ʱ�ȭ�Ǵ� ���� �����ϱ�
		���� ��å�̶�� ��������.*/
		}
	public void substract() {
		System.out.println(this.left-this.right);
	}
}


public class CalculatorConstructorDemo5 {
	public static void main(String[] args) {
		SubstractCal c1 = new SubstractCal(40, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		c1.setOprands(60, 30);
		c1.sum();
		c1.avg();
		c1.substract();
	}
}
