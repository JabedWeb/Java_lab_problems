import java.util.Scanner;

public class reverseInteger {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;

        while(number!=0){
            int lastDigit=number%10;
            reverse=reverse*10+lastDigit;
        }
        while(number!=0){
            int lastDigit = number%10;
            reverse = reverse*10 + lastDigit;
            number = number/10;
        }
        System.out.println("The reverse of the number is "+reverse);
    }
}
