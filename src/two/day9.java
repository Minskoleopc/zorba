package two;

import java.util.Arrays;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Array 
		
		int [] a  = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		int [] aC = {1,2,3};
		
		//[1,2,3]
		
		for(int i = 0 ; i < a.length ; i++) {
			//System.out.println(i);
			System.out.println(a[i]);
		}
		
		// for - each
		for(int s:aC) {
			System.out.println(s);
		}
			
		// program 2
		
		int [][] aa = new int [3][3];
		
		aa[0][0] = 1;
		aa[0][1] = 2;
		aa[0][2] = 3;
		
		aa[1][0] = 11;
		aa[1][1] = 22;
		aa[1][2] = 33;
		
		aa[2][0] = 44;
		aa[2][1] = 55;
		aa[2][2] = 66;
		
		int [] [] aaC = {
				{1,2,3},  // r
				{11,22,33}, // r2
				{44,55,66}	 // r3
		};
		
		for(int i = 0 ; i < aaC.length ; i++) {
			//System.out.println(i);
			//System.out.println(aaC[i]);
//			String q = Arrays.toString(aaC[i]);
//			System.out.println(q);
			
			int [] bb = aaC[i];
			for(int j = 0 ; j < bb.length ; j++) {
				System.out.println(bb[j]);
			}
			
		}
		
		for(int [] bb:aaC) {
			for(int bbb:bb) {
				System.out.println(bbb);
			}
		}
		
		// program 3
		
		int ccc [][][] = new int [3][3][3];
		
		ccc[0][0][0] = 1;
		ccc[0][0][1] = 2;
		ccc[0][0][2] = 3;
		
		ccc[0][1][0] = 11;
		ccc[0][1][1] = 22;
		ccc[0][1][2] = 33;
		
		ccc[0][2][0] = 111;
		ccc[0][2][1] = 222;
		ccc[0][2][2] = 333;
		
		//-----------------------------------------------------------
		ccc[1][0][0] = 1111;
		ccc[1][0][1] = 2222;
		ccc[1][0][2] = 3333;
		
		ccc[1][1][0] = 111;
		ccc[1][1][1] = 222;
		ccc[1][1][2] = 333;
		
		ccc[1][2][0] = 1;
		ccc[1][2][1] = 2;
		ccc[1][2][2] = 3;
		
		//
		
		ccc[2][0][0] = 1111;
		ccc[2][0][1] = 2222;
		ccc[2][0][2] = 3333;
		
		ccc[2][1][0] = 111;
		ccc[2][1][1] = 222;
		ccc[2][1][2] = 333;
		
		ccc[2][2][0] = 1;
		ccc[2][2][1] = 2;
		ccc[2][2][2] = 3;
		
		
		for(int i = 0 ; i < ccc.length ; i++) {
			System.out.println(ccc[i]);
			int cc [][] = ccc[i];
			for(int j = 0 ; j < cc.length ; j++) {
				//System.out.println(cc[j]);
				int c [] =cc[j];
				for(int l = 0 ; l < c.length ; l++) {
					System.out.println(c[l]);
				}
			}
		}
		
		for(int [][] qq:ccc) {	
			for(int [] q:qq) {
				for(int qr:q) {
					System.out.println(qr);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
