class PrimeOrComposite {
	public static void main(String args[]) {
		int num=9;
		int i=1, prime=0;
		while(i<=num){
			if(num%i==0)
				prime++;
			i++;
		}
		if(prime==2)
			System.out.println(num + " is a prime number\n\n");
		else
			System.out.println(num + "is a composite number\n\n\n");
		System.out.println("(using While loop)");
	}
}