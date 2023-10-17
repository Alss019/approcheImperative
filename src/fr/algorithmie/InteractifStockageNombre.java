package fr.algorithmie;

import java.util.Scanner;

import java.util.ArrayList;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> tab = new ArrayList<Integer>();
		boolean open = false;
		int option = 0;
		System.out.println("Tapez 1 pour ajouter un nombre Tapez 2 pour voir votre tableau");
		option = scanner.nextInt();
		
		while(open == false) {	
			if (option == 1) {
				System.out.println("Ajouter un chiffre");
				int data = scanner.nextInt();
				tab.add(data);
				System.out.println("Ajouter au tableau");
				}	
			else if(option == 2){
				System.out.println(tab);
			}
			else {
				System.out.println("Erreur");
			}
			System.out.println("Tapez 1 pour ajouter un nombre Tapez 2 pour voir votre tableau");
			option = scanner.nextInt();
		}
	}
		

}
