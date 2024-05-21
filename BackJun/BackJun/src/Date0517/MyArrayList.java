package Date0517;

import java.util.ArrayList;

public class MyArrayList {

	public int serialNumber = 3;
	public int operationNumber= 1;
	public String numberShape= "A";
	public String cardShape= "하트";
	public static void main(String[] args) {
		ArrayList<Card> p1Deck = new ArrayList<Card>();
		ArrayList<Card> p2Deck = new ArrayList<Card>();
		ArrayList<Integer> deck = new ArrayList<Integer>();
		
		for(int i = 0;i<52;i++) {
			deck.add(i);
		}
	}

}
