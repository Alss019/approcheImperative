package fr.algorithmie;

import java.util.Scanner;
import java.lang.Math;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrez un nombre");
		
		int coup = 0;
		boolean win = false;
		int min = 1;
		int max = 100;
		int range = max - min + 1;
		int nb = 0;
		int rand = (int)(Math.random() * range);
		
		
		while(win == false) {
			nb = scanner.nextInt();
			if(nb == rand) {
				win = true;
				coup = coup +1;
				System.out.println("Bravo tu as gagner en " + coup +" coups");
			}else if(nb < rand) {
				System.out.println(nb + " plus grand");
				coup = coup +1;
			}else if(nb > rand){
				System.out.println(nb +" plus petit");
				coup = coup +1;
			}
		}
	}

}
