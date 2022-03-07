package teste;
import java.util.*;
public class Ex_5_BD {

	public static void main(String[] args) {
		
		int[][] x = new int[10][10];
		Random gen = new Random();
		int max = 0;
		//Preenche a tabela com numeros aleatórios 
		for(int l = 0; l < x.length; l++) {
			for(int c = 0; c < x.length; c++) {
				x[l][c] = gen.nextInt(1001);
			}
				
		}
		// Encontra o maior numero 
		for(int l = 0; l < x.length; l++) {
			for(int c = 0; c < x.length; c++) {
				System.out.print(x[l][c]+"\t");
				if(x[l][c] > max) {
					max = x[l][c];
				}
			}
			System.out.println();
		}
		System.out.println("Maior valor --> " + max);
		System.out.println();
		//Encontra a localização do maior numero
		for(int l = 0; l < x.length; l++) {
			for(int c = 0; c < x.length; c++) {
				if(max == x[l][c]) {
					System.out.println("Localização do maior valor ["+l+"]"+"["+c+"]");
				}
			}
		}
	}
}
