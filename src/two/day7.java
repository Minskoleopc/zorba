package two;

import java.util.Arrays;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = new int[3][4];
		
//		a =[
//		 	[11,22,33,77],
//			[44,55,66,88,],
//			[77,88,99,99],
//		 	 
//		 ]
//		
		

		
		// program 1 
		
		
		int [][] a1 = {
				{1,22,333},
				{4444,55555,666666,7777777},
				{88888888}		
		};
		
		
		System.out.println(a1[0][2]); // 3
		System.out.println(a1[1][3]);  // 7
		System.out.println(a1[2][0]);// 8
		
		for(int i = 0 ; i < a1.length; i++) {
				//System.out.println(i);
			    //System.out.println(a1[i].length);
				int[] r= a1[i];
				for(int j = 0 ; j < r.length ; j++) {
					System.out.println(r[j]);
				}
			
		}
		
		
		// program 2
		
		int [][] numbers = {
				{-1,-2,-3},      // 0
				{-11,-22,-33},  // 1
				{-44,-55,-66}	// 2
		};
		
		for(int i = 0 ; i < numbers.length ; i++) {
			//System.out.println(i);
			//System.out.println(numbers[i]);
			//System.out.println(Arrays.toString(numbers[i]));
			int rows [] = numbers[i];
			for(int j = 0 ; j < rows.length ; j++) {
				System.out.println(rows[j]);
			}
		}
		
		// program 3
		
		int numbersB [] = {11,22,33};
		for(int q1:numbersB) {
			System.out.println(q1);
		}
		
		// multiple dimensional array
		
		int numbersC [][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}	
		} ;
		
		for(int [] q1:numbersC) {
			//System.out.println(q1);
			//System.out.println(Arrays.toString(q1));
			for(int q2:q1) {
				System.out.println(q2);
			}
		}
		
		// program 4
		
		int numbersD [][] = {
				{88,888,8888},
				{99,999,9999},
				{66,666,6666}	
		} ;
		
		
		for(int [] row:numbersD) {
			//System.out.println(row);
			//System.out.println(Arrays.toString(row));
			for(int col:row) {
				System.out.println(col);
			}
		}
		
		// program 5
		
		
		
		//t1 = [a,b]
		// a = [a1,a2]
		// b = [b1,b2]
		// a1 = [a1a,a1b,a1c]
		// a2 = [a2a,a2b,a2c]
		// b1 = [b1a,b1b,b1c]
		// b2 = [b2a,b2b,b2c]
		
		
		

		int [][][] t1 = {
				{
					{11,22,33},
					{44,55,66}
				},
				{
					{77,88,99},
					{33,44,99}
				}	
				
		};
		
		
//		t1 = [
//		      	[
//		      	 	[11,22,33],
//		      	 	[44,55,66]
//		      	 
//		      	 ],
//		      	[
//		      	 	[77,88,99],
//		      	 	[33,44,99]
//		      	 
//		      	 ]
//		      
//		      ]
//		
		
		System.out.println(t1[0][0][1]);
		System.out.println(t1[1][1][1]);
		System.out.println(t1[0][1][2]);
		
		// for loop 
		// for each loop
		
		
		
		
		
				
		
		
	}

}
