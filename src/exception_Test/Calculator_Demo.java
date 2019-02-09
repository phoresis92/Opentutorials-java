package exception_Test;

class Calcu{
	
	int a;
	int b;
	
	public Calcu(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void divide() {
		
		try {
			System.out.println("����� �Դϴ�.");
			System.out.println(a/b);
			System.out.println("�Ϸ�Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("e.egtMessage()"+e.getMessage());
			/*e.getMessage();
			������ ���� �⺻���� ������ ������ش�. ������ �ʴ�.*/
			
			System.out.println("e.toString()"+e.toString());
			/*e.toString()
			e.getMessage()���� �� �ڼ��� ���� ������ �����Ѵ�.
			java.lang.ArithmeticException�� �߻��� ���ܰ� � ���ܿ� �ش��ϴ����� 
			���� ������� ��������.*/
			
			System.out.println("+e.printStackTrace();");
			e.printStackTrace();
			/*e.printStackTrace()
			�޼ҵ� getMessage, toString���� �ٸ��� printStackTrace�� ���ϰ��� ����. 
			�� �޼ҵ带 ȣ���ϸ� �޼ҵ尡 ���������� ���� ����� ȭ�鿡 ����Ѵ�. 
			printStackTrace�� ���� �ڼ��� ���� ������ �����Ѵ�.
		*/
		}
	}
	
}


public class Calculator_Demo {
	public static void main(String[] args) {
		
		Calcu a = new Calcu(10,0);
		
		a.divide();
		
	}
	

}
