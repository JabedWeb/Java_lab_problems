package String;

public class copyCharFromArrayToString {
    public static void main(String[] args) {
        char[] ch={'a','b','c','d','e','f','g','h','i','j'};
        String str=String.copyValueOf(ch, 1, 3);
        System.out.println(str);
    }
    
}
