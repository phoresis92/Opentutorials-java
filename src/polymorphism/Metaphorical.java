package polymorphism;

interface father{}
interface mother{}
interface programer{
	public void coding();
}
interface believer{}

class Steve implements father,programer,believer{
	public void coding() {
		System.out.println("fast");
	}
}
class Rachel implements mother,programer{
	public void coding() {
		System.out.println("elegance");
	}
}

public class Metaphorical { // workspace

	public static void main(String[] args) {
		
		programer employee_f = new Steve();
		programer employee_m = new Rachel();
		
		employee_f.coding();
		employee_m.coding();
	}
	
}
/*Steve�� Rachel�� ������� ���忡���� Steve�� Rachel�� �������̽��� programmer�� ���ؼ�
�λ���� �����ϰ� �ȴ�. �� ����� � ������ �������踦 ������ �������̽� programmer�� ������ �ִٸ� 
����� �� �ִ�. ȸ�翡���� �ڵ��� �� �� �ִ� ����� �ʿ��ϰ� � ����� programmer��� 
�������̽��� �����ϰ� �ִٸ� �� ����� �ݵ�� coding�̶�� �޼ҵ带 �����ϰ� ���� ���̱� �����̴�.
�� �� ������� ������ ��û �� ���� programmer��� �������̽��� �޼ҵ��� coding�� ���ؼ� ��û�ϸ� �ȴ�.
������ �� ����� �����̳� �ɷ¿� ���� �� ������ ������ ����� �ٸ��� 
Steve�� ������ �ڵ��ϰ� Rachel�� ����ϰ� �ڵ��ϰ� �ִ�.*/
