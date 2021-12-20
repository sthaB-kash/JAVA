class NameList {
    public static void main(String args[]) {
        String  names[]={"bikash", "shrestha", "Bikash Shrestha"};
        int numbers[] = {1,2,3};
        for( String name: names) {
            System.out.println(name);
        }
        for(int num : numbers){
            System.out.println(num);
        }

    }
}