import java.util.ArrayList;

public class VarArgsExample {
    public static void main(String[] args) {
        getVarArgs(1, 2, 3, 4);
    }

    private static void getVarArgs(int... args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int num : args) {
            numbers.add(num);
        }
        System.out.println(numbers);
    }
}
