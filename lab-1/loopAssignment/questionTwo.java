class QuestionTwo{
	public static void main(String args[]){
	int i=0;
	for(; i<=10; i++) {
		
		if(i==3)
		{
			System.out.println("continue");
			continue;
		}
		System.out.println(i);
	}
	System.out.println("out of loop");
}

}