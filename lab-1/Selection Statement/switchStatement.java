class Today {
	public static void main(String args[]) {
		int today;
		System.out.println("What day is today?");
		System.out.println("Today is ");
		
		switch(today=7)
		{
			case 1:
				System.out.println("Sunday");
				break;
			
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thrusday");
				break;
			case 6:
				System.out.println("Friday");
				break;

			default: 
				System.out.println("Saturday");
		}
		System.out.println("\n\nUsing Switch Statement");
	}	
}