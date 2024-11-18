package Exception;

public class NestedTryBlock {
    public static void main(String[] args) {
        try
        {
            try
            {
                int a=10,b=0;
                System.out.println(a/b);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            try
            {
                int[]arr = new int[4];
                arr[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
