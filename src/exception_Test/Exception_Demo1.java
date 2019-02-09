package exception_Test;

class A{
	int arr[] = new int[3];
	
	void a() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	void z(int fi , int se) {
		
		try {
		System.out.println(arr[fi]/arr[se]);
		/*} catch (Exception e) {
			System.out.println(e.toString());*/
		/*Exception�� ArrayIndexOutOfBoundsException, ArithemeticException 
		���� �������� ���ܸ� �ǹ��ϱ� ������ Exception ���Ŀ� �����ϴ� catch ���� ����� �� ���� 
		�����̱� �����̴�. �ڹ� �����Ϸ��� ���ʿ��� ������ �����ϰ� �̸� �����ڿ��� �˷��ִ� ���̴�.*/
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("0���� ���� �� �����ϴ�!!!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println("�迭�� ������ �ʰ��Ͽ����ϴ�");
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("finally ����");
		}
		/*���� ��� �����ͺ��̽��� ����Ѵٸ� �����ͺ��̽� ������ �����ؾ� �Ѵ�. 
		�̶� �����ͺ��̽� ������ �������� �ۼ��� ���ø����̼��� ���� ���ӻ��¸� �����ϰ� �Ǵµ� 
		�����ͺ��̽��� �����ϴ� �������� ���ܰ� �߻��ؼ� �� �̻� �ļ� �۾��� �����ϴ� ���� �Ұ����� ��찡 
		���� �� �ִ�. ���ܰ� �߻��ߴٰ� �����ͺ��̽� ������ ���� ������ �����ͺ��̽��� ���� ���¸� �����ϰ� 
		�ǰ� �ޱ�� �����ͺ��̽��� �� �̻� ������ ������ �� ���� ���¿� ���� �� �ִ�. 
		������ ���� �۾��� ���� �߻����ο� ������� ������ finally���� ó���ϱ⿡ ���� �۾��̶�� �� �� �ִ�. 
		�����ڸ� finally�� �۾��� �������� ����Ѵٰ� �� �� �ִ�.*/
	}
	
}


public class Exception_Demo1 {

	public static void main(String[] args) {
		
		A ins = new A();
		
		ins.a();
		
			ins.z(10, 0);
			ins.z(1, 0);
			ins.z(2, 1);
	
	}
	
}
