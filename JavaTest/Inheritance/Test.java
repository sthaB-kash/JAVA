

class Parent{
	String name;
	int val;
	Parent(String name, int val){
		this.name=name;
		this.val=val;
	}
	public void display(){
		System.out.println(name+val);	
	}
}

class Child extends Parent{
	String name;
	Child(String cname, String pname, int val){
		super(pname, val);
		this.name=cname;
	}
	@Override
	public void display(){
		System.out.println(name);
		super.display();
	}
}


class Test{
	public static void main(String a[]){
		Child c=new Child("Bikash", "Bimala", 22);
		c.display();
	}
}