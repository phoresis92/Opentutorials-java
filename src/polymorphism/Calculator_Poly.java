package polymorphism;

abstract class Calculator{
	int fi,se;
	
	public void set(int fi, int se) {
		this.fi = fi;
		this.se = se;
	
	}
	
	int _sum() {
		return fi+se;
	}
	
	abstract void sum();
	
	abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}

class Cal_DecoP extends Calculator{
	
	void sum() {
		System.out.println(_sum()+"+++");
	}
	void avg() {
		System.out.println(_sum()/2+"+++");
	}
	
}
class Cal_DecoM extends Calculator{
	void sum() {
		System.out.println(_sum()+"---");
	}
	void avg() {
		System.out.println(_sum()/2+"---");
	}
}



public class Calculator_Poly {

	public static void execute (Calculator cal) { //2.�ϳ��� �޼ҵ�� �ΰ��� �ν��Ͻ� ó��
		System.out.println("���� ���");
		cal.run();
	}
	
	/*public static void execute(Cal_DecoP cal_p) { //3.������ ������ Ÿ���̾��ٸ� ������ ������ �ΰ��� �����.
		System.out.println("���� ���");
		cal_p.run();
	}
	public static void execute(Cal_DecoM cal_m) {
		System.out.println("���� ���");
		cal_m.run();
	}*/
	
	public static void main(String[] args) {
		Calculator cal_p = new Cal_DecoP(); 
		Calculator cal_m = new Cal_DecoM(); //1.���� ������ Ÿ������ ���������ν�
		
		execute(cal_p);
		execute(cal_m);

	}

}

/*Ŭ���� CalculatorDemo�� execute �޼ҵ�� CalculatorDecoPlus�� 
CalculatorDecoMinus Ŭ������ �޼ҵ� run�� ȣ���ϸ鼭 �װ��� '������'��� ����� 
ȭ�鿡 ǥ���ϴ� ����� ������ �ִ�. �� �� �޼ҵ� execute ���ο����� �Ű������� ���޵� 
��ü�� �޼ҵ� run�� ȣ���ϰ� �ִ�.

���� �޼ҵ� execute�� �Ű����� ������ Ÿ���� Calculator�� �ƴ϶�� ��� �ؾ��ұ�? 
���� ���� ������ ó�� �� �� ���� ���̴�. �޼ҵ� execute ���忡���� �Ű������� ���޵� ���� 
Calculator�̰ų� �� �ڽ��̶�� �޼ҵ� run�� ������ �ִٴ� ���� ���� ���� �� �ְ� �Ǵ� ���̴�.

�� �ƶ������� �������̶� �ϳ��� Ŭ����(Calculator)�� �پ��� ���� ���
(ClaculatorDecoPlus, ClaculatorDecoMinus)�� ������ �ִµ� �̰��� �������̶�� �� �� �ְڴ�.*/ 
