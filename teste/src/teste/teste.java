package teste;

import java.util.*;

public abstract class teste {

	public static void main(String[] args) {
		int n1, n2, r, o;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		n1 = tec.nextInt();
		System.out.println("Digite outro numero");
		n2 = tec.nextInt();
		
		System.out.println("Digite o numero da operação desejada");
		System.out.println("1 --> Somar");
		System.out.println("2 --> Subtrair");
		System.out.println("3 --> Dividir");
		System.out.println("4 --> Multiplicar");
		o = tec.nextInt();
		
	if(o > 0 && o < 5) {	
	  switch(o) {
	      case 1:
		      r = n1 + n2;
		     break; 
	      case 2:
	    	 r = n1 - n2;
	         break;
	      case 3:
	    	 r = n1 / n2;
	         break;
	      default:
	    	 r = n1 * n2;
	    	 break;
	  }
	     System.out.println("Resultado --> "+r);	 	     
  }else {
	  System.out.println("Operação invalida");
  }
 }
}
	  
	  
	  
	  
	  
	   