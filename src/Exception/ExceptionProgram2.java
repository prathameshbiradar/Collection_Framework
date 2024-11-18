package Exception;

public class ExceptionProgram2 {
    public static int divide(int a, int b)
    {

            return a/b;

    }
    public static int computeDivide(int a, int b)
    {
        int res = 0;
        try {

            res = divide(a, b);
        }catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        return res;
    }
    public static void main(String[] args) {

        int a =11;
        int b =0;
        try {
            int result = computeDivide(a, b);
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
