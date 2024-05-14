package ClassQuastion;

import java.util.*;
public class Tree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Owner owner = new Owner();
		System.out.println("주인의 이름 입력하기");
		owner.name = sc.nextLine();
		System.out.println("주인의 나이 입력하기");
		owner.age = sc.nextInt();
		sc.nextLine();
		System.out.println("주인의 연락처 입력하기");
		owner.pNumber = sc.nextLine();
		
		System.out.println("주인의 이름: "+owner.name+" 나이: "+owner.age+" 주인의 전화번호: "+owner.pNumber);;

		
	}

}
class Mango{
	String name = "mango";
	int cost = 200;
	int exp = 50;
	int growthCost = 4;
	int currentCount = 7;
	int maxCount = 50;
	
}
class Papaya{
	String name = "Papaya";
	int cost = 375;
	int exp = 6;
	int growthCost = 6;
	int currentCount = 6;
	int maxCount = 50;
	
}
class BananaPalm{
	String name = "BananaPalm";
	int cost = 500;
	int exp = 5;
	int growthCost = 5;
	int currentCount = 7;
	int maxCount = 50;
	
}
class Lemon{
	String name = "Lemon";
	int cost = 750;
	int exp = 8;
	int growthCost = 8;
	int currentCount = 1;
	int maxCount = 50;
	
}
class Owner{
	String name;
	int age;
	String pNumber;
}