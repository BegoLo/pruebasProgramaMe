import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s;
		boolean imposible;
		s=in.nextLine();
		int casos=Integer.parseInt(s);
	    for (int i =0;i<casos;i++){
	    	imposible=false;
	    	int n = in.nextInt();
	    	if((n>0) && (n<20000)){
				if(n<3){
					imposible = true;
				}else{
					if(n==3){
						System.out.println("0");
					}else{
						int numeroTreboles;
						numeroTreboles= Math.round(n/4);
						n=n-(numeroTreboles*4);
						if((n%3)==0){
							System.out.println(numeroTreboles);
						}else{
							imposible = true;
						}
					}
				}
			}else{
				imposible = true;
			}
	    	
	    	if(imposible) {
	    		System.out.println("IMPOSIBLE");
	    	}
	    }
	    
		
	}

}
