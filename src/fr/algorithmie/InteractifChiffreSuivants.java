package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffreSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrez un nombre");
		int nb = scanner.nextInt();
		for( int i=nb; i<nb+10;i++) {
			System.out.println(i+1);
		}
	}

}
