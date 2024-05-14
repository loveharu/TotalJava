package EduEdu;

public class Example {
    public static int gloabalVar = 10; // 모든지역 접근 가능
	
	public static void main(String[] args) {
		// 지역변수
		int localVar = 5;
		int globalVar=20;
		System.out.println(Example.gloabalVar);
		System.out.println(globalVar);
		System.out.println(localVar);
	}

}
