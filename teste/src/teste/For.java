package teste;
import java.util.*;
public class For {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double n1, n2, med;
		int qnt;
		
		
		System.out.println("Quantas mediasde aluno você quer calcular ??");
		qnt = tec.nextInt();
		for(int cont = 1; cont <= qnt; cont++) {
		System.out.print("Digite a primeira nota ");
		n1 = tec.nextDouble();
		System.out.print("Digite a segunda nota ");
		n2 = tec.nextDouble();
		med = (n1 + n2) / 2;
		System.out.print("Media do aluno --> "+med);
		System.out.println("\n");
		}
		System.out.println("OK");
		

	}

}
