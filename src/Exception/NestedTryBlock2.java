package Exception;

public class NestedTryBlock2 {
    public static void main(String[] args) {
        //Outer(parent)try block
        try{
            //inner try block 1
            try
            {
                //inner try block 2
                try
                {
                    int []a = new int[3];
                    System.out.println(a[10]);
                }
                //catch block for inner try block 2
                catch(ArithmeticException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            // catch block for inner try block 1
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        //catch block for outer try block
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Another Statements");
    }
}
