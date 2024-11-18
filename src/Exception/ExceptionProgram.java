package Exception;

public class ExceptionProgram {
    public static void main(String[] args) {

        try{
            int a=10;
            int divide = a/0;
            System.out.println(divide);
        }
        catch(ArithmeticException e){
            e.printStackTrace(); //implemented printStackTrace()Method
            System.out.println( e.getMessage()); // getMessage() method
            System.out.println(e.toString()); // toString()Method
//            System.out.println(e);
        }

    }
}
