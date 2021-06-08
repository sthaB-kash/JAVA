class PrimeOrComposite {
	public static void main(String args[]) {
		int num=5;
		int i=1;
		boolean prime=false;
		do{
			if(num%i==0)
				prime= true;
			i++;
		}while(i<=num);
		if(prime)
			System.out.println(num + " is a prime number\n\n");
		else
			System.out.println(num + "is a composite number\n\n\n");
		System.out.println("(using Do-While loop)");
	}
}