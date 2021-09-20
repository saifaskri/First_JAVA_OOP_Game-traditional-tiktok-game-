package tic_toc;

import java.util.Scanner;

public class Das_Ende_Meines_Spiels {
	boolean ERgebnis=false;
	boolean h1=true;
	boolean h3=true;

	
	public boolean isH1() {
		return h1;
	}



	public boolean isH3() {
		return h3;
	}



	public void Das_Ende_Herizontal(char [][]tab) {
	int i;	
	boolean c=true;
	for ( i=0;i<5;i+=2) {
			
		
		if  (((((tab[i][0])==(tab[i][2]))&&((tab[i][0])==(tab[i][4]))))||((((tab[0][4])==(tab[2][4]))&&((tab[0][4])==(tab[4][4]))))||((((tab[0][2])==(tab[2][2]))&&((tab[0][2])==(tab[4][2]))))||((((tab[0][0])==(tab[2][0]))&&((tab[0][0])==(tab[4][0]))))||((((tab[0][4])==(tab[2][2]))&&((tab[0][4])==(tab[4][0]))))||((((tab[0][0])==(tab[2][2]))&&((tab[0][0])==(tab[4][4]))))){
			c=true;
		break;
		}else {c=false;};
	
	}
	 this.ERgebnis=c;
	}



	public boolean isERgebnis() {
		return ERgebnis;
	}
	
	public boolean Weiter_suchen_vertikal3(char [][]tab) {
		boolean c=true;
		
		if ((((tab[0][4])==(tab[2][4]))&&((tab[0][4])==(tab[4][4])))) {
			c=false;
			
		}else {
			c=true;
		}                               
		return this.h3=c ;
		
	}
	
	
	
	
	
	public boolean Weiter_suchen_vertikal1(char [][]tab) {
		boolean c=true;
		
		if ((((tab[0][0])==(tab[0][2]))&&((tab[0][0])==(tab[0][4])))) {
			c=false;
			
		}else {
			c=true;
		}
		return this.h1=c ;
		
	}
	
	
	
	
}
