package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = { 8, -7, 12, 1, -2, 14, 17, 9};
		
		System.out.println(tab[1]);
		System.out.println(tab.length);
		System.out.println(tab[tab.length - 1]);
		System.out.println(tab[10]); // L'index 10 est hors limite, le tableau a une longueur de 8
		
		
	}

}
