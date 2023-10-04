package fr.tableaux;

public class ExerciceTableauChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ville = {"Toulouse", "Bordeaux", "Paris","Marseille", "Rennes"};
		System.out.println(ville[0]);
		System.out.println(ville[1]);
		System.out.println(ville[2]);
		System.out.println(ville[3]);
		System.out.println(ville[4]);
		System.out.println(ville.length);
		ville[3] = "Reims";
		System.out.println(ville[0]);
		System.out.println(ville[1]);
		System.out.println(ville[2]);
		System.out.println(ville[3]);
		System.out.println(ville[4]);
	}

}
