package Work5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Result {
	private List<Person> listPerson;
	private List<ItemInfo> listItem;
	private List<Integer> listResult = new ArrayList<>();




	public Result(List<Person> listPerson, List<ItemInfo> listItem) {
		this.listPerson = listPerson;
		this.listItem = listItem;
		getResult();
		System.out.println("컴페어 호출");
		Compare cp = new Compare(listPerson, listItem, listResult);
		
		}










	void getResult() {
		
		for(ItemInfo item : listItem) {
			int price = item.getPencilPrice();
			int box = item.getPencilBox();
			int pencil = item.getPencilCount();
			int result = price * box * pencil;
			System.out.println(result);
			listResult.add(result);
			
		}
		
		

		
	}

}
