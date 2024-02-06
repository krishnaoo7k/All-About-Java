package Stringbuffer;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("krishna sharma");
        StringBuffer sb2 = new StringBuffer(12);

        sb.append("kk");
        sb.append(" hello man!");
//        System.out.println(sb);
//        sb.insert(2," yoo");
//        System.out.println(sb);
        float a  = 675765.8f;
        System.out.println(((Object) a).getClass().getName());
    }
}
