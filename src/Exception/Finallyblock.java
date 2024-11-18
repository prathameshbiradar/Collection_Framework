package Exception;

public class Finallyblock {
    public static void main(String[] args) {
        // Exception is not occured in try block
        try{
            int a=10,b=2;
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally // finally block is executed
        {
            System.out.println("Finally block is executed when exception is not occured");
        }
        System.out.println("Finally block 2");
        // Exception occured in try block and handled in catch block
        try{
            int a=10,b=0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finally block is executed when exception is handled in catch block");
        }
        // Exception occured in try block but does not handled in catch block.
        try
        {
            int a=10,b=0;
            System.out.println(a/b);
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally block is Executed when exception is not handled in catch block");
        }
    }
}
