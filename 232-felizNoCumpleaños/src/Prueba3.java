import java.util.Scanner;

public class Prueba3 {

	public static void main(String[] args) {
		boolean salir = false;
		Scanner in = new Scanner(System.in);
		int[] diasMeses ={31,28,31,30,31,30,31,31,30,31,30,31};
		int diaCumple, mesCumple, anoCumple, diaNoCumple, mesNoCumple, anoNoCumple;
		int sumaDias;
		do{
			sumaDias=0;
			
			diaCumple=in.nextInt();
			mesCumple=in.nextInt();
			anoCumple=in.nextInt();
			
			diaNoCumple=in.nextInt();
			mesNoCumple=in.nextInt();
			anoNoCumple=in.nextInt();
			
			salir=(diaCumple==0 && mesCumple==0 && anoCumple==0 && diaNoCumple==0 && mesNoCumple==0 && anoNoCumple==0);
			if(!salir){
				if(diaCumple==diaNoCumple && mesCumple==mesNoCumple){
					sumaDias=0;
				}else{
					
					//calculo los dias que le falta cumplir el mes
					sumaDias=diasMeses[mesCumple-1]-diaCumple;
					
					//sumamos los dias que faltan para acabar ese año
					for(int i=mesCumple;i<diasMeses.length;i++){
						sumaDias+=diasMeses[i];
					}
					
					//comenzamos la suma de los años
					for(int i=anoCumple+1;i<anoNoCumple;i++){
						//System.out.println(i);
						for(int j=0;j<diasMeses.length;j++){
							sumaDias+=diasMeses[j];
						}
					}
					
					//calculamos los dias del ultimo año
					for(int i=0;i<mesNoCumple-1;i++){
						sumaDias+=diasMeses[i];
					}
					
					//restamos los dias que sobran
					sumaDias+=diaNoCumple;
					
					
					}
				System.out.println(sumaDias);
			}
		}while(!salir);
	}

}
