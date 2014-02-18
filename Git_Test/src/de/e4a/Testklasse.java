package de.e4a;

public class Testklasse {

	public static void main(String[] args) {
	
		int [] zahlen= new int[5];
		int [] zahlen1 = {42, 13, 27, -3, 42};
		
		// Ausgabe mit foreach
		
		for(int zahl :zahlen1){
			System.out.println(zahl);
		}
		
		// Ausgabe mit For Schleife
		
		for(int index = 0; index < zahlen1.length; index ++){
			System.out.println(zahlen1[index]);
		}
		
		// Ausgabe mit while Schleife
		int i=0;
		while( i < zahlen1.length){
			System.out.println(zahlen1[i]);
			i++;
		}
		
		
	}
		
		
}
