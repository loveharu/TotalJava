package FirstStep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackWork {

    

    void stackWork() {
        String push = "push";
        String pop = "pop";
        String size = "size";
        String empty = "empty";
        String top = "top";

        int cmdCount = 0;

        Scanner sc = new Scanner(System.in);
        List<Integer> stackList = new ArrayList<>();
        int index = -1; // 초기 인덱스 설정

        System.out.println("명령어 입력 횟수 입력");

        if (sc.hasNextInt()) {
            cmdCount = sc.nextInt();
        } else {
            System.out.println("유효하지 않은 입력입니다. 정수를 입력하세요.");
            return; // 프로그램 종료
        }

        sc.nextLine(); // 버퍼 비우기

        for (int i = 0; i < cmdCount; i++) {            
            String getCmd = sc.nextLine();         

            int number = 0;
            if (getCmd.contains(push) || getCmd.contains(" ")) { // "push" 명령어 또는 숫자가 포함되어 있는 경우
                String[] tokens = getCmd.split("\\s+"); // 공백을 기준으로 문자열 분리
                if (tokens.length == 2) { // "push" 다음에 숫자가 있는 경우
                    try {
                        number = Integer.parseInt(tokens[1]); // 문자열을 숫자로 변환                       
                        getCmd = tokens[0]; 
                    } catch (NumberFormatException e) {
                        System.out.println("잘못된 숫자 형식입니다.");
                        continue; // 다음 반복으로 건너뜀
                    }
                } else {
                    System.out.println("숫자를 입력하세요.");
                    continue; // 다음 반복으로 건너뜀
                }
            }
            

            switch (getCmd) {
                case "push":
                    stackList.add(number);
                    index++;
                    break;
                case "pop":
                    if (index >= 0) {
                        System.out.println(stackList.get(index));
                        stackList.remove(index);
                        index--;
                    } else {
                        System.out.println("-1");
                    }
                    break;
                case "size":
                    System.out.println(stackList.size());
                    break;
                case "empty":
                    if (stackList.isEmpty())
                        System.out.println("1");
                    else
                        System.out.println("0");
                    break;
                case "top":
                    if (index >= 0) {
                        System.out.println(stackList.get(index));
                    } else {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                default:
                    System.out.println("잘못된 명령어입니다.");
            }
        }
        sc.close(); // Scanner 닫기
    }
}