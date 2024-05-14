package Work5;

import java.util.ArrayList;
import java.util.List;

public class Compare {
	private List<Person> listPerson;
	private List<ItemInfo> listItem;
	private List<Integer> listResult = new ArrayList<>();
	
	public Compare(List<Person> listPerson, List<ItemInfo> listItem, List<Integer> listResult) {
		super();
		this.listPerson = listPerson;
		this.listItem = listItem;
		this.listResult = listResult;
		doCompare();
	}
	void doCompare() {
	    int max = Integer.MIN_VALUE; // 최소값으로 초기화
	    int index = 0;
	    
	    for (int i = 0; i < listResult.size(); i++) {
	        int total = listResult.get(i);
	        
	        if (total > max) { // 현재 요소가 최댓값보다 크면
	            max = total; // 최댓값을 업데이트
	            index = i; // 인덱스도 업데이트
	        }
	    }
	    
	    System.out.println("최고 구매가는 " + max + " 해당 객체의 인덱스는 " + index);
	    System.out.println("가장 많이 구매한 사람의 이름은: " + listPerson.get(index).getName());
	    System.out.println("가장 많이 구매한 사람의 나이는: " + listPerson.get(index).getAge());
	}
}
