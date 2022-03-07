package teste;
import java.util.*;
public class ForEx1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int vl;
		
		System.out.println("Digite um valor interio e positivo --> ");
		vl = tec.nextInt();
		
		
		if(vl > 0) {
			for(int count = -vl; count <= vl; count++) {
				if(count != 0 && vl % count == 0) {
					System.out.print(count +" ");
			}					
		  }
		}else {
			System.out.println("Valor inválido");
		}
	}

}
