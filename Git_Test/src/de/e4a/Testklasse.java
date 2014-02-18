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
		
		int maximum = max(zahlen1);
		System.out.println("Das Maximum ist: " + maximum);
		int minimum = minimal(zahlen1);
		System.out.println("Das Minimum ist:" + minimum);
	}
		
		public static int max(int[]i) {
			int max =i[0];
			for (int index = 1; index < i.length; index++){
				if (i[index]> max){
					max = i[index];
				}
			}
			return max;
		}
		
		
		public static int minimal(int []array){
			int min = array[0];
			for (int index=1; index< array.length; index++){
				if(array[index] < min){
					min = array[index];
				}
			}
			return min;
		}
	}
		
		

