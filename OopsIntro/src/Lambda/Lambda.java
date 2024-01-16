package Lambda;

import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
//        arr.forEach((item) ->System.out.println(item * 2));

        Lambda calc = new Lambda();

        Operation sum = (a , b) -> a + b;
        System.out.println(calc.oop(2,3,sum));
        System.out.println(sum.operation(2,4));
        Operation sub = (a , b) -> a - b;
        Operation mul = (a , b) -> a * b;
    }
    public int oop(int a, int b, Operation op){
        return op.operation(a,b);
    }

}

interface Operation{
    int operation(int a, int b);
}
