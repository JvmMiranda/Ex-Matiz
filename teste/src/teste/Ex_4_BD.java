package teste;
import java.util.*;
public class Ex_4_BD {

	public static void main(String[] args) {
		
		int[][] x = new int[4][4];
		int s=0, d=0;
        Random gen = new Random();
		Scanner tec = new Scanner(System.in);
		
		for(int l = 0; l < x.length; l++) {
			for(int c = 0; c < x.length; c++) {
				x[l][c] = gen.nextInt(21);			
			}
		}
		for(int l = 0; l < x.length; l++) {
			for(int c = 0; c < x.length; c++) {
				System.out.print(x[l][c]+"\t");
				if(l == c) {
					s = s + x[l][c];	
				}
				if(l + c == 3 ) {
					d = d + x[l][c];
				}
		   }
			System.out.println();
		}
		System.out.println("Soma diagonal P "+s);
		System.out.print("Som diagonal S "+d);
		
		
		
	}

}
