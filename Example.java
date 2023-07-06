class Example {
    public static void main(String[] args) {
        System.out.println("Method Overloading");
        Example obj = new Example();
        // System.out.println(obj.add(1, 2));

        // System.out.println(obj.add(1, 2, 3));
        // System.out.println(obj.add(1.5f, 2));

        obj.switchStatement();

    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    float add(float a, int b) {
        return (float) (a + b);
    }

    public void switchStatement() {
        int day = 3;
        switch(day) {
            case 1: 
                System.out.println("Today is Sunday");
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
            default: 
                System.out.println("invalid day");
        }
    }
} 