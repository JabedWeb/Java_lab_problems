import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even number");
        else
            System.out.println(num + " is odd number");
    }
    }
}