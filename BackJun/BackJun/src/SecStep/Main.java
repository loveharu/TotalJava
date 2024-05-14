package SecStep;

import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
		/*
		 * String push = "push"; String pop = "pop"; String size = "size"; String empty
		 * = "empty"; String top = "top";
		 * 
		 * int cmdCount = 0;
		 * 
		 * Scanner sc = new Scanner(System.in); List<Integer> stackList = new
		 * ArrayList<>(); int index = -1; // 초기 인덱스 설정
		 * 
		 * if (sc.hasNextInt()) { cmdCount = sc.nextInt(); } else { return; // 프로그램 종료 }
		 * 
		 * sc.nextLine(); // 버퍼 비우기
		 * 
		 * // 명령어와 처리 메서드를 맵에 저장 Map<String, Runnable> commands = new HashMap<>();
		 * commands.put(push, () -> { int number = sc.nextInt(); stackList.add(number);
		 * //index++; }); commands.put(pop, () -> { if (index >= 0) {
		 * System.out.println(stackList.get(index)); stackList.remove(index); //
		 * index--; } else { System.out.println("-1"); } }); commands.put(size, () -> {
		 * System.out.println(stackList.size()); }); commands.put(empty, () -> { if
		 * (stackList.isEmpty()) System.out.println("1"); else System.out.println("0");
		 * }); commands.put(top, () -> { if (index >= 0) {
		 * System.out.println(stackList.get(index)); } else { System.out.println("-1");
		 * } });
		 * 
		 * for (int i = 0; i < cmdCount; i++) { String getCmd = sc.nextLine(); Runnable
		 * command = commands.get(getCmd); if (command != null) { command.run(); } }
		 * 
		 * sc.close(); // Scanner 닫기
		 */   
    	 SugarDel sugar = new SugarDel();
    	 sugar.Sugar();
    	}
}