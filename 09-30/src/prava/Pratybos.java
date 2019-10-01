package prava;

public class Pratybos {

	public static void main(String[] args) {
//		nuliai();
//		istrizaine();
//		istrizaines();
//		kasAntra();
//		sakes();
//		trysKrastai();
//		didinaKasEilute();
		paskutinis();

	}

	private static void nuliai() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(0 + " ");
			}
	}
}
	
	private static void istrizaine() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if(i == j) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
	
	private static void istrizaines() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if(i == j || 9 - j == i) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
	
	private static void kasAntra() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if(i % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
	
	private static void sakes() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if(j % 2 == 0 || i ==0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
	
	private static void trysKrastai() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if(j==0 || j==9 || i==0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
	
	private static void didinaKasEilute() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(i+1 + " ");
			}
			System.out.println();
		}
	}
	
	private static void paskutinis() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(j+i+1 + " ");
			}
			System.out.println();
		}
	}
}
