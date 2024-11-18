package Exception;

public class ThowProgram1 {
    public static void validate(int age){
    if(age<18)
    {
        throw new ArithmeticException("Person is not eligible to vote");
    }
    else {
        System.out.println("Person is not eligible to vote");
    }
    }
    public static void main(String[] args) {
        int age=18;

        validate(age);
    }
}
