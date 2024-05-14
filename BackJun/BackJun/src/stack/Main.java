package stack;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int cmdCount = sc.nextInt();
		sc.nextLine();
		
		for(int i =0;i<cmdCount;i++) {
			int num=0;
			int currentIndex = 0;			
			List queList = new ArrayList();
			String cmd = sc.nextLine();
			String[] pushCmd = cmd.split("\\s+");
			if(pushCmd.length == 2)
				num = Integer.valueOf(pushCmd[1]);		
	
			switch(pushCmd[0]) {
				case "push":
					queList.add(num);
					currentIndex ++;
					break;
				case "pop":
				    if (!queList.isEmpty()) {
				        queList.remove(0);
				    } else {
				        System.out.println("-1");
				    }
				    break;
				case "size":
					System.out.println(queList.size());
					break;
				case "empty":
					if(queList.isEmpty())
						System.out.println("1");
					else
						System.out.println("-1");
					break;
				case "front":
					if (!queList.isEmpty()) {
				        System.out.println(queList.get(0));
				    } else {
				        System.out.println("-1");
				    }
					break;
				case "back":
					if(!queList.isEmpty()) {
						 
						 System.out.println(queList.get(queList.size()-1));
					}
					else
						System.out.println("-1");
					break;
				
			}
			
		}
		
		

	}

}
