//splitting a string

 class Split1 {
	 
	 public static void main(String args[]) {
		 
		 String pipeDelimited = "HP | Cisco | Intel | IBM";
		 String[] companies = pipeDelimited.split("\\|");
		 System.out.println(companies);
		 
	 }
	 
 }