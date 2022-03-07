package teste;
import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		
	Scanner t = new Scanner(System.in);
	int n ;
	
	System.out.print("Informe o valor de n :");
	n = t.nextInt();
	
	while(true) {
		System.out.print(n + " ");
		if(n == 1) {
			break;
		}
		if(n % 2 != 0) {
			n = 3 * n + 1;
		}else {
			n = n / 2;	
		}
	}
		

	}

}
