package teste;
import java.util.*;
public class Ex_7 {

	public static void main(String[] args) {
		
		int[][] t = new int[5][5];
		Random gen = new Random();
		int aux;
		
		//preenche e imprimi a matriz antes da torca 
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t.length; j++) {
				t[i][j] = gen.nextInt(10);
				System.out.print(t[i][j]+ "\t");
			}
			System.out.println();
		}
		// Troca da diagonais 
		System.out.println();
		int i = 0;
		int j = t.length - 1 ;
		while (i < t.length) {
			aux = t[i][i];
			t[i][i] = t[i][j];
			t[i][j] = aux;
			i++;
			j--;
		}
		
		// Imprimir a matriz após a troca 
		
		for(int ii = 0; ii < t.length; ii++) {
			for(int jj = 0; jj < t.length; jj++) {			
				System.out.print(t[ii][jj]+ "\t");
			}
			System.out.println();
		}
		System.out.println();
		//hehehe
	}
}
