package tic_toc;

import java.util.Scanner;

public class XoderO extends namen_der_spieler {
public char xo_neben;
public void set_xo_neben(char a) {

	a=Character.toUpperCase(a); 
	if (a=='X') {
		this.xo_neben='O';
	}else if (a=='O') {
		this.xo_neben='X';}}





public char getXo_neben() {
	return xo_neben;
}
	public char xo_main;
	public  void set_xodero  (String a) {
		
		boolean c=true;;
		System.out.println( "Herr "+a+" wählen Sie entweder X oder O aus ^___^ ");	
		do {
		Scanner input=new Scanner(System.in);
		this.xo_main=input.nextLine().charAt(0);
		this.xo_main=Character.toUpperCase(xo_main); 
		if ((this.xo_main=='X')||(this.xo_main=='O')){
			c=false;}
		else if (!(((this.xo_main=='X')||(this.xo_main=='O')))) {
		c=true;
		System.out.println( "Herr "+a+" BITTE geben Sie entweder X oder O ein -___- ");}
		}while (c);
	}
	public char getXo_main() {
		return this.xo_main;
	}
		
	
}
