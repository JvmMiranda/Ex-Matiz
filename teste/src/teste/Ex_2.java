package teste;
import java.util.*;
public class Ex_2 {

	public static void main(String[] args) {
		//declaracao de variavel 
		Scanner t = new Scanner(System.in);
		int[] v = new int[5];
		int mai, men;
		
		//preencher o vetor 
		for (int i=0; i < v.length; i++){
			System.out.print("Digete um valor --> ");
			v[i] = t.nextInt();
			}
	    // Localizar e imprimir o maior e o menor valor 
		mai = v[0];
		men = v[0];
		for(int i=0; i < v.length; i++) {
			if(v[i] > mai) {
				mai = v[i];
			}
			if(v[i] < men) {
				men = v[i];
			}
		}
		System.out.println("Maior = "+ mai);
		System.out.println("Menor = "+ men );
		System.out.println(" ");
		
		//Tab maior 
		for (int i=0; i <= 10; i++){
			System.out.println(mai + " x " + i + " = " + (mai*i));
		}
		System.out.println(" ");
		//Tab menor 
		for (int i=0; i <= 10; i++){
			System.out.println(men + " x " + i + " = " + (men*i));
			
		}
	}

}
