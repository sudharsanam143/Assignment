package week6.day2;

import java.util.Arrays;

public class Missingnumber {

	public static void main(String[] args) {
		
		int[] data = {1,3,2,11,4,6,7};
		
		Arrays.sort(data);
		for(int i=0;i<data.length;i++) {
			if(i+1!=data[i]) {
				System.out.println(i+1);
				break;
			}
		}
	}

}
