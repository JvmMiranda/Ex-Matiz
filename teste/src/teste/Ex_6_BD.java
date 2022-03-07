package teste;
import java.util.*;
public class Ex_6_BD {

	public static void main(String[] args) {
		
		Random gen = new Random();
		Scanner tec = new Scanner(System.in);
		int a, m;
		int qtdnotas = 3;
		
		// Numero de alunos 
		System.out.println("Quantos alunos você quer calcular a média");
		a = tec.nextInt();
		
		// Declaração dos arrays 
		
		String nome [] = new String[a];
		double[][] n = new double[a][4];
		double[] p1 = {0.3, 0.5, 0.2};
		
		for(int i = 0; i < a; i++) {
			System.out.print("Nome do aluno "+(i+1)+" --> ");
			nome[i] = tec.next();
			m = 0;
			for(int j = 0; j < 3; j++) {
				tec.nextLine();
				System.out.print("Nota "+(j+1)+"--> ");
				n[i][j] = tec.nextDouble();	
				m += n[i][j] * p1[j];
				}
			n[i][qtdnotas] = m;
			System.out.println();
			}
			
			for(int i = 0; i < a; i++) {
				System.out.println("Nome \t Media");
				System.out.println(nome[i] + "\t" + n[i][qtdnotas]);
				if(n[i][qtdnotas] >= 7) {
					System.out.println("APROVADO");
				}else {
					System.out.println("REPROVADO");
				}
			}
		}
		
	}


