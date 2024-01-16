package OopsIntroduction;

public class Obj {
    public static void main(String[] args) {
        Obj fun = new Obj();
        System.out.println(fun.getClass().isEnum());
    }

    public int sum(int a, int b){
        return a + b;
    }

}
