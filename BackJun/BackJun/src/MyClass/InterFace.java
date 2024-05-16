package MyClass;

class Test {
	public int age;
	public String name;
	
	public Test() {
		setName();
		sayHello();
	}
	public Test(String name, int age,String message) {
        this.name = name;
        this.age = age;
        saySomthing(message);
    }
	void sayHello() {
		System.out.println(name);
		System.out.println(age);
		System.out.println("안녕하세요");
	}
	void saySomthing(String message) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(message);
		
	}
	void setName() {
		this.name = "홍길동";
		this.age = 15;
	}
	void setName(String name,int age) {
        this.name = name;
        this.age = age;
    }
}


public class InterFace {

	public static void main(String[] args) {
		int age = 25;
		String name = "가오";
		String message = "월월";
		Test human1 = new Test();
		Test human2 = new Test(name,age,message);

	}

}
