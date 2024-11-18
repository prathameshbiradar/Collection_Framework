package Exception;

public class MultiCatchBlock {
    public static void operation(String name)       //StringIndexOutOfBoundException
    {
        try {
            System.out.println(name.charAt(1));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void arrayOperation(int[]arr)     //ArrayIndexOutOfBoundException
    {
        try
        {
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println(a.getMessage());
        }
    }
    public static void main(String[] args) {
        int a=8;
        int b=2;
        String name = null;
        int[]arr ={10,12,13,14,15};

        try
        {
            operation(name);
            arrayOperation(arr);
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exeption Occurs");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
