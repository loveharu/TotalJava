package Work5;

import java.util.*;
import java.util.ArrayList;

public class GetInfo {
	Scanner sc = new Scanner(System.in);
	List<Person> listPerson = new ArrayList<>();
	List<ItemInfo> listItem = new ArrayList<>();

	public GetInfo() {

		System.out.println("사람 수 입력>>");
		int count = sc.nextInt();
		sc.nextLine(); // 개행 문자 처리
		getInfo(count);
		Result result = new Result(listPerson, listItem);
	}

	void getInfo(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("이름 입력 >>");
			String name = sc.nextLine();
			System.out.println("나이 입력 >>");
			int age = sc.nextInt();
			Person person = new Person(name, age);
			listPerson.add(person);
			putItemInfo(person);

		}

	}

	void putItemInfo(Person person) {

		System.out.println("박스 갯수 입력");
		int pencilBox = sc.nextInt();
		System.out.println("연필 갯수 입력");
		int pencilCount = sc.nextInt();
		System.out.println("연필 가격 입력");
		int pencilPrice = sc.nextInt();
		sc.nextLine();

		ItemInfo item = new ItemInfo(pencilBox, pencilCount, pencilPrice);
		listItem.add(item);
		printPersonInfo(person);
		printItemInfo(item);

	}

	void printItemInfo(ItemInfo item) {
		System.out.println("박스 수 :" + item.getPencilBox());
		System.out.println("연필 수 :" + item.getPencilCount());
		System.out.println("가격  :" + item.getPencilPrice());

	}

	void printPersonInfo(Person human) {

		System.out.println("이름 :" + human.getName());
		System.out.println("나이 :" + human.getAge());

	}

}
