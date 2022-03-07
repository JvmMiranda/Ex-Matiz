package teste;
import java.util.*;
public class ForEx2 {

	public static void main(String[] args) {
	Scanner tec =  new Scanner(System.in);
	int vl, D=0;
	
	System.out.println("Digite um valor --> ");
	vl = tec.nextInt();
	
	if(vl > 0) {
		for(int cnt = 1; cnt <= vl; cnt++) {
			if(cnt != 0 && vl % cnt == 0) {
				D++;
		}					
	  }if(D == 2) {
		  System.out.println("O valor é primo");
	  }else {
		  System.out.println("O valor não é primo");
	  }
		
	}else {
		System.out.println("Valor inválido");
  }
 }
}




	

	
	

	


