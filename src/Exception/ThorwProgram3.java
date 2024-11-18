package Exception;
class UserDefinedException extends Exception{
    public  UserDefinedException(String str)
    {
        super(str);
    }
}
public class ThorwProgram3 {
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("User Defined Exception");
        }
        catch(UserDefinedException ude)
        {
            System.out.println("Caught Exception");
            System.out.println(ude.getMessage());
        }
    }
}
