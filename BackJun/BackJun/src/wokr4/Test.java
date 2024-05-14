package wokr4;

import java.util.Arrays;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {

 
		Human a=null;
		System.out.println(a);
		//Human 배열은 Human a;에서 a 여러개 생성한것이다.
		//따라서 Human클래스 저장공간이 여러개 생긴것이 아니고
		//Human클래스 저장 주소가 여러개 생긴것이다.
		
		Human arrHuman[] = new Human[3];
		a= new Human();
		a.name = "홍길동";
		a.age=10;
		a.height=10.10;
		System.out.println(a);

		System.out.println(Arrays.toString(arrHuman));
		System.out.println(arrHuman[1]);
		arrHuman[0] = new Human();
		arrHuman[1] = new Human();
		arrHuman[2] = new Human();
		
		arrHuman[0].name="홍길동";
		arrHuman[1].name="엄준식";
		arrHuman[2].name="최수연";
		
		for(Human arr : arrHuman) {
			System.out.println(arr .name);
			System.out.println(arr .age);
			System.out.println(arr .height);
		}

	}

}
