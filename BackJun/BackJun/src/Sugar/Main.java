package Sugar;
 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = solution(N);
        System.out.println(count);
    }

    public static int solution(int N) {
        // 가능한 5킬로그램 봉지 개수를 늘려가면서 확인
        for (int fiveKg = N / 5; fiveKg >= 0; fiveKg--) {
        	System.out.println("fiveKg :" + fiveKg);
        	System.out.println("N : " + N);
            int remain = N - (fiveKg * 5);
            System.out.println("remain : "+remain);
            // 남은 무게가 3의 배수이면 조합 가능
            if (remain % 3 == 0) {
                // 5킬로그램 봉지 개수와 3킬로그램 봉지 개수의 합이 최소 개수
                return fiveKg + (remain / 3);
            }
        }
        // 조합이 불가능한 경우
        return -1;
    }
}