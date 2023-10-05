package fr.algorithmie;

import java.util.Scanner;

public class InteratifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrez un nombre");
		int nb = scanner.nextInt();
		int total=0;
		for( int i=0; i<=nb ;i++) {
			total = total + i;
		}
		System.out.println("Somme arithmetique : "+total);
	}

}
