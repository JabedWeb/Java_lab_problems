package exceptions;



class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        System.out.println(s);
    }
}

class InvalidGenderException extends Exception{
    InvalidGenderException(String s){
        System.out.println(s);
    }
}

public class userdefinedexception {
    public static void main(String[] args) {
        try {
        vote(12);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Gender("male");
            } catch (Exception e) {
                System.out.println(e);
            }
    }
  static  void vote(int age ) throws InvalidAgeException{

        if (age < 18) {
            throw new InvalidAgeException("Not Eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    static void Gender(String gender) throws InvalidGenderException{
        if(gender=="male"){
            throw new InvalidGenderException("Don't need guardian");
        }
        else{
            System.out.println("Need guardian");
        }
}
}
