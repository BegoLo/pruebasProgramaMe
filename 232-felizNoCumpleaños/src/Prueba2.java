import java.util.*;

public class Prueba2 {
	public static void main(String[] args) {
		boolean salir=false;
		Scanner in = new Scanner(System.in);
		int dia1 , mes1, ano1, dia2,mes2,ano2;
		long r;
		Calendar noCumple;
		Calendar cumple;
		GregorianCalendar calendario = new GregorianCalendar();
		do{
			dia1=in.nextInt();
			mes1=in.nextInt();
			ano1=in.nextInt();
			dia2=in.nextInt();
			mes2=in.nextInt();
			ano2=in.nextInt();
			salir=(dia1==0 && mes1==0 && ano1==0 && dia2==0 && mes2==0 && ano2==0);
			
			if(!salir){
				if(dia1==dia2 && mes1==mes2){
					r=0;
				}else{
				
					cumple=GregorianCalendar.getInstance();
					noCumple=GregorianCalendar.getInstance();
					int anosBi=0;
					for (int i = ano1;i<=ano2;i++){
						if(calendario.isLeapYear(i)) anosBi++;
						
					}
					//System.out.println(anosBi);
					cumple.set(ano1, mes1,dia1);
					noCumple.set(ano2, mes2,dia2);
					long milis1 = cumple.getTimeInMillis();
				
					        long milis2 = noCumple.getTimeInMillis();
				
					        long diff = milis2 - milis1;

					/*Date noCumpleDate = noCumple.getTime();
					Date cumpleDate = cumple.getTime();
					
					long noCumpleTime = noCumpleDate.getTime();
					long cumpleTime = cumpleDate.getTime();
					
					long diffTime = noCumpleTime-cumpleTime;*/
					r= diff / (1000 * 60 * 60 * 24);
					r-=anosBi;
				}
				System.out.println(r);
			}
		
		}while(!salir);
	}

}
