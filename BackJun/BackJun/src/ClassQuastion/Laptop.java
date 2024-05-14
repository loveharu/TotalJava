package ClassQuastion;

public class Laptop {
	public static void main(String[] args){
		ASUSLapTop asus = new ASUSLapTop();
		APPLELapTop apple = new APPLELapTop();
		
		System.out.println("브랜드명은 "+asus.brand);
		System.out.println("인치 :" +asus.inch);
		System.out.println("cpu : "+asus.cpu);
		System.out.println("core : " +asus.core);
		System.out.println("memory "+asus.memory);
		System.out.println("storage :" +asus.storage);
		System.out.println("무게는 "+asus.weight);
		System.out.println("색상은 "+asus.color);
		
		System.out.println("브랜드명은 "+apple.brand);
		System.out.println("인치 :" +apple.inch);
		System.out.println("cpu : "+apple.cpu);
		System.out.println("core : " +apple.core);
		System.out.println("memory "+apple.memory);
		System.out.println("storage :" +apple.storage);
		System.out.println("무게는 "+apple.weight);
		System.out.println("색상은 "+apple.color);
		
	}

}

class ASUSLapTop{
	double inch = 15.6;
	String brand = "ASUS";
	String cpu = "인텔 코어i5-11세대";
	String core = "쿼드코어";
	String memory = "16GB";
	int storage = 256;
	double weight = 1.65;
	String color = "블루";
			
}
class APPLELapTop{
	double inch = 13.3;
	String brand = "애플";
	String cpu = "APL1102";
	String core = "옥타코어";
	String memory = "8GB";
	int storage = 256;
	double weight = 1.29;
	String color = "그레이";			
}