package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarez un tableau d’entiers contenant tous les chiffres suivants : 8, -7, 12, 1, -2, 14, 17, 9
		int[] tab = { 8, -7, 12, 1, -2, 14, 17, 9};
		
		// Affichez l’élément du tableau d’index 0 du tableau
		System.out.println(tab[0]);
		
		// Affichez la longueur du tableau
		System.out.println(tab.length);
		
		// Affichez l’entier positionné au dernier index du tableau
		System.out.println(tab[tab.length - 1]);
		
		//Affichez l’entier d’index 10. Pourquoi cela échoue ? Affichez un commentaire dans votre code pour l’expliquer.
		System.out.println(tab[10]); // L'index 10 est hors limite, le tableau a une longueur de 8
		
	}

}
