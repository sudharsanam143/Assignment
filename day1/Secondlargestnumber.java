package week3.day1;

import java.util.Arrays;

public class Secondlargestnumber {

	public static void main(String[] args) {
		int a[]= {12,143,3411,5,8,56};
		Arrays.sort(a);
		//System.out.println(a[0]);
		int length=a.length;
		System.out.println(a[length-2]);
	

	}

}


//console
//143