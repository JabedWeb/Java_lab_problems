package String;

public class compareTwoString {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        int com=str1.compareTo(str2);
       if(com==0){
           System.out.println("\"" + str1 + "\"" +" Both the string are equal");
       }
       else{
           System.out.println("Both the string are not equal");
       }
    }
    
}
