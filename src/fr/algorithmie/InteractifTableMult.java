package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrez un Chiffre");
		int nb = scanner.nextInt();
		while(nb>=11) {
			System.out.println("Veuillez entrez un Chiffre");
			nb = scanner.nextInt();
		}
		if(nb <= 10) {
			System.out.println("Voice la table de " + nb);
			for(int i=0; i<11;i++) {
				System.out.println(i +" * "+ nb +" = "+nb*i);
			}
		}
	}

}
