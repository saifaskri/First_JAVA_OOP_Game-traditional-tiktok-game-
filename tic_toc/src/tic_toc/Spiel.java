package tic_toc;

import java.sql.Time;
import java.util.*;
public class Spiel {
	
	public static void main(String[] args) {
char[][]  tisch  = {{'1','|','2','|','3'},{'-','+','-','+','-'},{'4','|','5','|','6'},{'-','+','-','+','-'},{'7','|','8','|','9'}	};
int count=0;


namen_der_spieler  namen =new namen_der_spieler ();
namen.P1=namen.namen_erfullung(1);
namen.P2=namen.namen_erfullung(2); 
namen.setname_der_whäler(namen.getP1(),namen.getP2());
namen.setname_der_neben_wahler(namen.getMAIN_PLAYER());
XoderO XO=new XoderO();
XO.set_xodero(namen.getMAIN_PLAYER());
XO.set_xo_neben(XO.getXo_main());
String winner="";
String winner2="";

INPUT_SPIELER a=new INPUT_SPIELER();
tisch_des_Spiels tab =new tisch_des_Spiels();		
Das_Legen_der_Punkten finals=new Das_Legen_der_Punkten();
Das_Ende_Meines_Spiels Stolz=new Das_Ende_Meines_Spiels ();





while (1==1) {
	
	
	
	
	tab.der_tisch( tisch);

	
	a.set_Eingabe(namen.getMAIN_PLAYER());
	finals.Das_Legen_der_Punktens(tisch,a.get_EINGABEx_o() , XO.getXo_main());
	count++;
	System.out.println();
	System.out.println();
	System.out.println();

	tab.der_tisch( tisch);
	Stolz.Das_Ende_Herizontal(tisch);
	
	if (Stolz.isERgebnis()){
		winner=namen.getMAIN_PLAYER();   
		winner2= namen.getNEBEN_PLAYER();
		break;
	}else if (count==9) {
		break;
	}

	
	
	a.set_Eingabe(namen.getNEBEN_PLAYER());
	finals.Das_Legen_der_Punktens(tisch,a.get_EINGABEx_o(),XO.getXo_neben());
	tab.der_tisch( tisch);
	System.out.println();
	System.out.println();
	System.out.println();
	count++;
	Stolz.Das_Ende_Herizontal(tisch);
	
	
	if (Stolz.isERgebnis()){
	winner=namen.getNEBEN_PLAYER();
	winner2=namen.getMAIN_PLAYER();
	break;
}else if (count==9) {
	
	break;
}


	
}


if (count==9) {
	System.out.print("ahhh wir haben draw hier  ('draw'ist auf Englisch geschrieben worden ;) ");

}else	{
	
System.out.println("Herr "+winner+" Sie haben gewonnen ^___^ ");
System.out.println("Herr "+winner2+" Sie haben verloren! -___-  ");

System.out.println("Danke ,dass ihr mein erstes Spiel gespielt habt");

}























	}

	   



}	

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    