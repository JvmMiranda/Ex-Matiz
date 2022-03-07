package teste;

public class ForRelogio {

	public static void main(String[] args) {
		int H, M, S;
		for (H = 0; H < 24; H++) {
			for(M = 0; M < 60; M++) {
				for(S = 0; S < 60; S++) {
					System.out.println(H + "h: "+ M + "min: "+ S + "s");
					try {
						Thread.sleep(1000);
						if (S == 60) {
							System.exit(0);
						}
					}catch (InterruptedException erro) {
						erro.toString();
					}
				}
					
			}
		}
		System.exit(0);
	}

}
