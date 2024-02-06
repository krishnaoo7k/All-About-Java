package StringPrograms;

public class Abcd {
    public static void main(String[] args) {
        String str = "";
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+ i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
