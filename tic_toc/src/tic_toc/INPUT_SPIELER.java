package tic_toc;

import java.util.Scanner;

public class INPUT_SPIELER extends tisch_des_Spiels {
public String test="0";

char EINGABEx_o=' ';

public String EINGABE="";

public char get_EINGABEx_o() {
	
	return EINGABEx_o;
}
public String getTest() {
	return test;
}

public   char set_Eingabe(String a) {
		boolean c1=true;
		boolean c=true;
		
	    
	    

		
System.out.print("geben Sie Herr "+a+" eine zahl zwischen 1-9 ein ^__^ : ");
System.out.println();
System.out.println("Achtung!!! die Zahl muss nicht zuvor benutzt haben Übrigens dies wurde benutzt  "+this.test);
Scanner input =new Scanner(System.in);
this.EINGABE=input.nextLine();
do {
switch (EINGABE){

case "1":
	c1=false;
	break;
case "2":
	c1=false;
	break;
case "3":
	c1=false;
	break;
case "4":
	c1=false;
	break;
case "5":
	c1=false;
	break;
case "6":
	c1=false;
	break;
case "7":
	c1=false;
	break;
case "8":
	c1=false;
	break;
case "9":
	c1=false;
	break;
	default :
	
		System.out.println("Diese Zahl ist nich im 1-9 Bereich -___- gib andere erneut ein!!!");
		c1=true;
		this.EINGABE=input.nextLine();	
			
	break;

}

}while(c1);




do {


if ((this.EINGABE.length()!=1)) {
	System.out.println("Diese Zahl ist nich im 1-9 Bereich -___- gib andere erneut einS!!!");
	c1=true;

	this.EINGABE=input.nextLine();	

}





else {c1=false;
};


}while(c1);
do {

if (this.test.indexOf(this.EINGABE)==-1) {
		c=false;
		if (this.test.equals("")) {
			this.test=this.test+this.EINGABE;

	}
		else {this.test=this.test+"/"+this.EINGABE;}
		
	}else if (!(test.indexOf(this.EINGABE)==-1)) {
		System.out.println("Diese Zahl ist benutzt worden -___- gib andere erneut ein!!!");

		System.out.print("geben Sie Herr "+a+" eine Zahl zwischen 1-9 ein ^__^ : ");
		System.out.println();
		System.out.println("Achtung!!! die Zahl muss nicht zuvor benutzt haben Übrigens dies wurde benutzt  "+this.test);

		this.EINGABE=input.nextLine();	
		c=true;}
continue;
	}while((c));

		
return this.EINGABEx_o= this.EINGABE.charAt(0);
	    

	    
	}			









}
