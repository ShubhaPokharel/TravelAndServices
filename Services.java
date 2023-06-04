class Services{
	double powerBill(int numberOfUnits, double amountPerUnit){
		double res;
		res = numberOfUnits * amountPerUnit;
		return res;
	}

	String travel(String name, int age){
		if(age >= 5){
			return  "old enough";
		}
		else{
			return  "young";
		}
	}

	public static void main(String[] args){
	 	Services s =  new Services();
	 	double totalAmount= s.powerBill(4,9.453);
	 	System.out.println("Your total amount: " + totalAmount);

	 	double totalAmount2 = s.powerBill(4224,25.21545);
	 	System.out.println("Your total amount: " + totalAmount2);
	 		System.out.println("**************************************");

	 	 String ageLimit = s.travel("Shubha",11);
	 	 System.out.println("Your name and age limit: " + ageLimit);

	 	 String ageLimit2 = s.travel("Makinley",-1);
	 	 System.out.println("Your name and age limit: "+ ageLimit2);
	}
}