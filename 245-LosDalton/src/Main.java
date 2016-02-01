import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean salir = false;
		//boolean dalton;
		int numHermanos;
		int numeros[];
		do{
			
			salir=false;
			numHermanos=in.nextInt();
			if(numHermanos==0){
				salir=true;
			}else{
				try{
					
				numeros=new int[numHermanos];
				for(int i=0;i<numHermanos;i++){
					numeros[i]=in.nextInt();
				}
				for(int i=0;i<numeros.length-1;i++){
					if(numeros[i]<numeros[i+1]){
						salir=true;
						
					}else if(numeros[i]>numeros[i+1] || numeros[i]==numeros[i+1]){
						salir=false;
						break;
					}
					
				}
				}catch(Exception e){
					return;
				}
				
				if (salir){
					System.out.println("DALTON");
					salir=false;
				}else{
					System.out.println("DESCONOCIDOS");
					
				}
				
			}
			
		}while(!salir);
	
	}
}
