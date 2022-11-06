package String;
import java.util.Scanner;
public class characterIndex {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        System.out.println("Enter the character");
        char ch=scan.next().charAt(0);

        System.out.println("the user input character"+ch);
        int index=str.indexOf(ch);
        System.out.println("The index of the character is "+index);
    }
    
}
