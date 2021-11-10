package com.patika.mustafa.java101.ebobveekok;

import java.util.Scanner;

public class EbobEkok {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen Birinci sayıyı giriniz");
		int number1 = scanner.nextInt();
		System.out.println("Lütfen İkinci sayıyı giriniz");
		int number2 = scanner.nextInt();
		int ebob = 1;
		int count;
		int ekok = 1;
		if (number1 > number2) {
			count = number2;
			
		} else {
			count = number1;
			
		}
		
		while (count > 0) {
			
			if (number1 % count == 0 && number2 % count == 0) {
				ebob = count;
				break;
			}
			count--;
		}
		
		count = 1;
		while (count <= number1 * number2) {
			count++;
			if (count % number1 == 0 && count % number2 == 0) {
				ekok = count;
				break;
			}
			
		}
		System.out.printf("%d ve %d sayısının ekoku= %d \n", number1, number2, ekok);
		System.out.printf("%d ve %d sayısının ebobu= %d \n", number1, number2, ebob);
		
		scanner.close();
	}
}
