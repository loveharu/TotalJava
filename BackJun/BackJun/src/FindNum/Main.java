package FindNum;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		
		
		Scanner sc = new Scanner(System.in);	    
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for(int i=0;i<N;i++) 
			A[i]= sc.nextInt();	
		
		for(int i=0;i<N;i++) 
			System.out.print(A[i]+" ");
			
		System.out.println("");
		int M1 = sc.nextInt();
		int[] M = new int[M1];
		
		for(int i=0;i<M1;i++) 		
			M[i] = sc.nextInt();
			
		for(int i=0;i<M1;i++) 			
			System.out.print(M[i]+ " ");
			
		System.out.println(" ");
		int resultArry[] = new int[M1];
		for(int i = 0; i < M1; i++) {
            boolean found = false;
            for(int j = 0; j < N; j++) {
                if(M[i] == A[j]) {
                    found = true;
                    break;
                }
            }
            resultArry[i] = found ? 1 : 0;
        }
        
			  for(int k=0;k<resultArry.length;k++)
			  System.out.println(resultArry[k]);
     } 
  
	}
