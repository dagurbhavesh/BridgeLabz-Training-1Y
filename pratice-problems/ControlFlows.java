class ControlFlows{
	public static void main(String args[]){
		System.out.println("For loop Example: ");
		for(int p=1; p<=5; p++){
			for(int k=1; k<=p; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("While loop Example: ");
		
		int i = 1;
		while(i<=20){
				System.out.println(i+ "");
				i++;
		}
		System.out.println("DO - While loop Example :");
		 int j = 0 ;
		 do{
			 System.out.println(j);
			 j++;
		 }
		 while(j<=20);
		 
			
		
	}
}