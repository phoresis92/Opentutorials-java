package collection_framwork;

import java.util.ArrayList;
import java.util.List;

class SameSentence{
	String[] compare(List<String> list1, List<String> list2){

		List<String> list3 = new ArrayList();
		
		if(list1.size()>=list2.size()) {
			for(int i = 0 ; i <list2.size(); i++) {
				if(list1.get(i).equals(list2.get(i))) {
					list3.add(list1.get(i));
				}
			}
		}else System.out.println("�񱳺Ұ�");
		
		String[] result = new String[list3.size()];
		list3.toArray(result);
		
		return result;
		
	}//method end
}//class end

public class SameSentenceTest {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("�ڹٴ� ��ü���� ����Դϴ�");
		list1.add("�츮�� ŰƮ������ �ڹٸ� ���� ���Դϴ�");
		list1.add("������ �÷��� �����ӿ�ũ�� �����! ");
		list1.add("������ ����°� ��Ʈ��ũ�� ��� �����Դϴ� ");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("�ڹٴ� ��ü���� ����Դϴ�");
		list2.add("�츮�� kitri���� �ڹٸ� ���� ���Դϴ�");
		list2.add("������ �ݷ��� �����ӿ�ũ�� �����! ");
		list2.add("������ ����°� ��Ʈ��ũ�� ��� �����Դϴ� ");
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("�ڹٴ� ��ü���� ����Դϴ�");
		list3.add("�츮�� kitri���� �ڹٸ� ���� ���Դϴ�");
		list3.add("������ �ݷ��� �����ӿ�ũ�� �����! ");
		
		SameSentence ss = new SameSentence();
		
		String[] result1 = ss.compare(list1, list2);
		for(String s : result1) {
			System.out.println(s);
		}
		
		String[] result2 = ss.compare(list1, list3);
		for(String s : result2) {
			System.out.println(s);
		}
		
	}//main end

}//class end
