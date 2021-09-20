package tic_toc;

import java.util.Scanner;

public class namen_der_spieler extends tisch_des_Spiels {
	
public String MAIN_PLAYER;public String NEBEN_PLAYER;
	
public String getMAIN_PLAYER() {
	return MAIN_PLAYER;
}






public String getNEBEN_PLAYER() {
	return NEBEN_PLAYER;
}






public  String setname_der_whäler(String a, String b) {
	boolean c=false;
	String ch;
	System.out.println("wer will der erste auswähler sein");

	do {
	Scanner input=new Scanner(System.in);
	ch=input.nextLine();
	if (((ch.equals(a))||(ch.equals(b)))) {
		c=false;
	}else {
		System.out.println("ACHTUNG!! diese Name wurde niemals eingegeben ");
		System.out.println("geben sie bitte Name des auswähler erneut ein!  ");

		c=true; 
	}
	
	}while (c);
return this.MAIN_PLAYER=ch;
	
}






public void  setname_der_neben_wahler(String main) {
		
		

		
		
		if (this.P1.equals(main)) {
			this.MAIN_PLAYER=this.P1;
		this.NEBEN_PLAYER=this.P2;
		} else   {
			this.MAIN_PLAYER=this.P2;	
			this.NEBEN_PLAYER=this.P1;
		}
		
		
		
		
		
	}

	
	public String P1; public String getP1() {
		return P1;
	}

	public String getP2() {
		return P2;
	}

	public String P2;	

	
	public String namen_erfullung(int a) {
		

	
		String ch;
		do {
			Scanner input=new Scanner(System.in); 
			System.out.println("geben Sie die name von Spieler n°: "+a);
			 ch=input.nextLine();
		}while (ch.length()<3);
				
return ch;

	}






}
