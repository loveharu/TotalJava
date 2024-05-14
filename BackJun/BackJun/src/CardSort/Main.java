package CardSort;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 카드를 담을 큐 생성
        Deque<Integer> cards = new ArrayDeque<>();
        // 카드를 큐에 순서대로 넣기
        for (int i = 1; i <= N; i++) {
            cards.offer(i);
        }
        
        // 카드가 한 장 남을 때까지 반복
        while (cards.size() > 1) {
            // 제일 위에 있는 카드를 버림
            cards.poll();
            // 그 다음 카드를 제일 아래로 옮김
            int movedCard = cards.poll();
            cards.offer(movedCard);
        }
        
        // 마지막에 남는 카드 출력
        System.out.println(cards.peek());
    }
}

