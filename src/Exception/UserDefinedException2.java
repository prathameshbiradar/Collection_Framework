package Exception;
class InvalidAge extends Exception{
    public InvalidAge(String str)
    {
        super(str);
    }
}

public class UserDefinedException2 {
    public static void invalid(int age)throws InvalidAge
    {
        if(age<18)
        {
            throw new InvalidAge("Invalid age to  vote");
        }
        else
        {
            System.out.println("eligible to vote");
        }
    }
    public static void main(String[] args) {
        try {
            invalid(10);
        }
        catch(InvalidAge i)
        {
            System.out.println("Caught Exception");
            System.out.println(i.getMessage());
        }
        System.out.println("Rest of the code");
    }
}
