package fr.algorithmie;
import java.util.Scanner; 

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrez un nombre");
		int nb = scanner.nextInt();
		boolean win = false;
		// while tant que win est false on  redemande un nombre a l'utilisateur
		while(win == false) {
			if(nb>=1 && nb<=10) {
				System.out.println("Bravo vous avez gagné");
				win = true;
			}else {				
				System.out.println("Raté, veuillez entrez un nombre");
				nb = scanner.nextInt();
			}
		}
		
	}	
}
