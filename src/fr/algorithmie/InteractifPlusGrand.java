package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrez 10 nombre");
		int[] tab = new int[10];
		
		int j = 0;
		
		while(j < 10) {
			tab[j]  = scanner.nextInt();
			j++;
		}	
		
		int maxNum = 0;
		
		for( int i=0; i<tab.length; i++) {
			if(tab[i] > maxNum){
				maxNum = tab[i];
			}
		}
		System.out.println(maxNum);
	}
	
}
