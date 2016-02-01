/**
 * 
 */

/**
 * @author BegoLo
 *
 */
public class Main {


	static java.util.Scanner in;
	
	public static void casoDePrueba() {
		int n;
		String men;
		n = in.nextInt();
		if((n>0) && (n<20000)){
			if(n<3){
				System.out.println("IMPOSIBLE");
			}else{
				if(n==3){
					System.out.println("0");
				}else{
					men = probarTreboles(n);
					System.out.println(men);
				}
			}
		}
	}
	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++) {
			casoDePrueba();
		}
	}
	public static String probarTreboles(int n){
		int numeroTreboles;
		numeroTreboles= Math.round(n/4);
		n=n-(numeroTreboles*4);
		if((n%3)==0){
			return String.valueOf(numeroTreboles);
		}else{
			return "IMPOSIBLE";
		}
		
	}

}
