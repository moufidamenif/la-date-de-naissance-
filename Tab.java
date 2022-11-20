package ex2;
public class Tab {
	int [][] set1,set2,set3,set4,set5;
	int [] cal;
	Tab(){
		int set1[][]=new int [4][4];
		int set2[][]=new int [4][4];
		int set3[][]=new int [4][4];
		int set4[][]=new int [4][4];
		int set5[][]=new int [4][4];
		int cal[]=new int [5];}	
	public void remplissage (){
		int [][]tab1={{1,3,5,7},{9,11,13,15},{17,19,21,23},{25,27,29,31}};
		set1=tab1;
		int [][]tab2={{2,3,6,7},{10,11,14,15},{18,19,22,23},{26,27,30,31}};
		set2=tab2;
		int [][]tab3={{4,5,6,7},{12,13,14,15},{20,21,22,23},{28,29,30,31}};
		set3=tab3;
		int [][]tab4={{8,9,10,11},{12,13,14,15},{24,25,26,27},{28,29,30,31}};
		set4=tab4;
		int [][]tab5= {{16,17,18,19},{20,21,22,23},{24,25,26,27},{28,29,30,31}};
		set5=tab5;
		int []tab= {1,10,100,1000,10000};
		cal=tab;}
public void affiche (int i ) {
	{for (int j=0;j<4;j++) {
		System.out.print(set1[i][j]);
	}
	System.out.print("        ");
	for (int j=0;j<4;j++) {
		System.out.print(set2[i][j]);
	}
	System.out.print("        ");
	for (int j=0;j<4;j++) {
		System.out.print(set3[i][j]);
	}
	System.out.print("        ");
	for (int j=0;j<4;j++) {
		System.out.print(set4[i][j]);
	}
	System.out.print("        ");
	for (int j=0;j<4;j++) {
		System.out.print(set5[i][j]);}
	System.out.println();
	}}
	
	
	
}