class Demo {
    String name;
    public Demo(String name){
        this.name = new String(name);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String str) {
        name = str;
    }
}

class ChildClass {
    int age;
    // ChildClass( int num, String name){
    //     this.age=num;
    //     // super(name);
    // }
    public int getAge(){
        return this.age;
    }
    public static void main(String args[]){
        ChildClass obj = new ChildClass(22, "Bikash Shrestha");
        System.out.println(obj.getAge() + " " + obj.getName());
    }
}