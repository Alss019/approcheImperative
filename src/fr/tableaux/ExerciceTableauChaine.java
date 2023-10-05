package fr.tableaux;

public class ExerciceTableauChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarez un tableau de chaines de caractères contenant 5 noms de villes au choix.
		String[] ville = {"Toulouse", "Bordeaux", "Paris","Marseille", "Rennes"};
		
		// Affichez les 5 éléments du tableau
		System.out.println(ville[0]);
		System.out.println(ville[1]);
		System.out.println(ville[2]);
		System.out.println(ville[3]);
		System.out.println(ville[4]);
		
		//Affichez la longueur du tableau
		System.out.println(ville.length);
		
		//Modifiez l’élément d’index 3 du tableau avec la valeur de ville "Reims"
		ville[3] = "Reims";
		
		//Affichez les 5 éléments du tableau après modification
		System.out.println(ville[0]);
		System.out.println(ville[1]);
		System.out.println(ville[2]);
		System.out.println(ville[3]);
		System.out.println(ville[4]);
		
		for(int i=0; i< ville.length; i++) {
			System.out.println(ville[i]);
		}
	}

}
