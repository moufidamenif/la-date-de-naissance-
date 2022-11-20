package ex2;
import java.util.Scanner;
import java.lang.Math;
public class test {

	public static void main(String[] args) {
		Scanner clavier=new Scanner (System.in);
		int somme=0 ;
		int a ;
	Tab tabs=new Tab() ;
	tabs.remplissage();
	for (int i=0;i<4;i++) {
	tabs.affiche(i);
	}
	for (int i=1;i<6;i++) {
		do {
	System.out.print("la date de naissance est presente dans set"+i+"?");
	
		a=clavier.nextInt();
			}while ((a<0)||(a>1));
	somme =somme+a*tabs.cal[i-1];
	}
	System.out.print(somme);
	double   entier=0;
	String str =Integer.toString(somme);
	for(int i=0;i<str.length();i++) 
	{
		if (str.charAt(i)=='1') {
			entier=entier+Math.pow(2,4-i);
		}
	}
	System.out.print("entier est "+(int)(entier));
	
	}

}
