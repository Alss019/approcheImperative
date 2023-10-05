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
		int i = 0;
		
		while(open == false) {	
			if (option == 1) {
				System.out.println("option 1");
				System.out.println("Ajouter un chiffre");
				if(i == 0) {
					option = scanner.nextInt();
					tab.add(option);
					i++;
					System.out.println(option + " ajouter au tableau");
					
				}else {
					option = scanner.nextInt();
					tab.add(option);
					i++;
					System.out.println("ajouter");
				}	
				System.out.println("Tapez 1 pour ajouter un nombre Tapez 2 pour voir votre tableau");
				option = scanner.nextInt();
			}
			if(option == 2){
				System.out.println(tab);
				System.out.println("option 2");
				System.out.println("Tapez 1 pour ajouter un nombre Tapez 2 pour voir votre tableau");
				option = scanner.nextInt();
			}
		}
		
		
		
		
	}

}
