package tic_toc;

public class tisch_des_Spiels {
	public char[][] tisch;
	
public char[][]	der_tisch_von_Spiel() {
	char[][]  tisch  = {{'1','|','2','|','3'},{'-','+','-','+','-'},{'4','|','5','|','6'},{'-','+','-','+','-'},{'7','|','8','|','9'}	};
 
return	tisch;
		
		
}
	
	
	
	
	
	
	
	
	
	
	public void der_tisch(char[][]  tisch) {
		
	
	for(int i=0;i<tisch.length;i++) {
		for(int j=0;j<tisch[i].length;j++) {
			System.out.print(tisch[i][j] );
		}System.out.println();}

}
public void hya (char [][]a,char t) {
	a[0][1]=t;
	System.out.println(a[0][1]);
}

}