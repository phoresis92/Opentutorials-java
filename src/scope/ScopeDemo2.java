package scope;

public class ScopeDemo2 {

	static int i ;
	
	static void a() {
		i = 0; //��������(Grobal variable)���� ������� ���ѹݺ� �ȴ�
		//int i = 0; //��������(Local variable)�� ���ѹݺ� ���� �ʴ´�
	}
	public static void main(String[] args) {
		for(i=0 ; i<5 ; i++) { // i �� int�� ����� ��������ȭ
			a();
			System.out.println(i);
		}
	}
}
// �� ��� ������ �����ϴ��Ŀ� ���� �������� ���������� ������  
