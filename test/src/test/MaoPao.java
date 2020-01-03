package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaoPao {
	
	public static void main(String[] args) {
//		String string = new Scanner(System.in).nextLine();
//		
//		String[] splitString = string.split(",");
////		Integer[] split = {5,3,4,9,1};
////		System.out.println(split[0]);
//		
//		Integer[] split = new Integer[splitString.length];
//		for (int i = 0; i < splitString.length; i++) {
//			split[i] = Integer.parseInt(splitString[i]); 
//		}
//		
//		int a = 0;
//		
//		for (int i = 1; i < split.length; i++) {
//			
//			for (int j = 0; j < split.length-i; j++) {
//				
//				if (split[j] > split[j+1]) {
//					a = split[j];
//					split[j] = split[j+1];
//					split[j+1] = a;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(split));
   
		
		Integer[] array = {5,1,3};
		int a = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {
				if (array[j] > array[j+1]) {
					a = array[j+1];
					array[j+1] = array[j];
					array[j] = a;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
