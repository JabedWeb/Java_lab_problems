// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class factorial {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int factorial_number = scan.nextInt();
        int num = 1, count;
    float fact; 
    float sum=0; 
  
    while(num<= factorial_number)  
    {  
        fact = 1;  
        for(count = 1; count <= num; count++)  
        {  
            fact = fact * count;  
        }  
    System.out.print("1/"+num + "!+");
        sum = sum + (1 / fact);  
  
  num=num+2; 
    }
    System.out.print("\n");
    System.out.print(sum);
}

}