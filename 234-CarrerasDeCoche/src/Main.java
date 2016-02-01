import java.util.*;
/**
 * 
 */

/**
 * @author BegoLo
 *
 */
public class Main {

	static java.util.Scanner in;
	
	
	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++) {
			//System.out.println(i);
			casoDePrueba();
			
		}

	}
	
	public static void casoDePrueba(){
		int total, numPilas, voltMin, suma = 0,num;
		try{
		 numPilas = in.nextInt();
		 voltMin = in.nextInt();
		
		for(int i=0;i<numPilas;i++){
			num=in.nextInt();
			suma+=num;
			
		}
		total=suma/voltMin;
		}catch(Exception e){
			return;
		}
		System.out.print(total);
		
	}

}
