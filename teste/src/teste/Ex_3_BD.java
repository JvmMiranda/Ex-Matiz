package teste;
import java.util.*;
public class Ex_3_BD {

	public static void main(String[] args) {
		
		
		// array BD
		// tipo[][] nome array = new tipo[linhas][colunas] 
		Scanner tec = new Scanner(System.in);
 		int[][] x = new int[3][3];
 		
 		//Entrada de dados 
 		
 		for(int l = 0; l < x.length; l++) {
 			for(int c = 0; c < x.length; c++) {
 				System.out.print("Valor: ");
 				x[l][c] = tec.nextInt();
 			}
 		}	
 		//Saida de dados 
		
 		for(int l = 0; l < x.length; l++) {
 			for(int c = 0; c < x.length; c++) {
 				System.out.print(x[l][c]+"\t");
 				
 			}
 			System.out.println();
 		}
	}
}
